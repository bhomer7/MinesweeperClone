
import java.util.ArrayList;

public class Board {
	
	private ArrayList<ArrayList<Cell>> board;
	
	private DifficultyClass difficulty;
	
	Board() {
		this(DifficultyClass.EASY);
	}
	
	Board(DifficultyClass d) {
		board = new ArrayList<ArrayList<Cell>>();
		difficulty = d;
		
		createCells();
		setMines();
	}
	
	public void createCells() {
		for(int i = 0; i < difficulty.rows(); i++) {
			board.add(new ArrayList<Cell>());
			for(int j = 0; j < difficulty.cols(); j++) {
				board.get(i).add(new Cell(i,j));
			}
		}
	}
	
	public void setMines() {
		int minesPlaced = 0;
		int r, c;
		
		while(minesPlaced < difficulty.numMines()) {
			r = (int)(difficulty.rows()*Math.random());
			c = (int)(difficulty.cols()*Math.random());
			this.getCell(r,c).setMine();
			minesPlaced++;
		}
	}
	
	public void setNeighbors() {
		for(int r = 0; r < difficulty.rows(); r++) {
			for(int c = 0; c < difficulty.cols(); c++) {
				this.getCell(r, c).setNeighbors(this.getNeighbors(r, c));
			}
		}
	}
	
	public ArrayList<Cell> getNeighbors(int row, int col) {
		ArrayList<Cell> neighbors = new ArrayList<Cell>();
		for(int r = -1; r <= 1; r++) {
			for(int c = -1; c <= 1; c++) {
				if(r != 0 && c != 0 && this.getCell(r, c).isMine()) {
					if(this.getCell(r, c) != null)
						neighbors.add(this.getCell(r,c));
				}
			}
		}
		return neighbors;
	}
	
	public Cell getCell(int r, int c) {
		if(r<0 || r>=difficulty.rows() || c<0 || c>=difficulty.cols())
			return null;
		return board.get(r).get(c);
	}

}
