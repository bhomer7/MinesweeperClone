
import java.util.ArrayList;

public class Cell {
	
	private int row;
	private int col;
	
	private FlagType flagType;
	private boolean isFlagged;
	private boolean isMine;
	
	private int numNeighbors;
	private boolean hasNeighbor;
	
	private boolean isChecked;
	
	Cell(int r, int c) {
		this.row = r;
		this.col = c;
		this.isFlagged = false;
		this.flagType = FlagType.FLAG_BLANK;
		this.isChecked = false;
		this.numNeighbors = 0;
	}
	
	public void setMine() {
		this.isMine = true;
	}
	
	public boolean isMine() { return isMine; }
	
	public void setNeighbors(ArrayList<Cell> neighbors) {
		numNeighbors = neighbors.size();
		hasNeighbor = numNeighbors > 0;
	}
	
	public boolean isFlagged() { return isFlagged; }
	
	public void cycleFlag() {
		switch(flagType) {
		case FLAG_BLANK: flagType = FlagType.FLAG_MINE;
			isFlagged = true;
			break;
		case FLAG_MINE: flagType = FlagType.FLAG_QUESTION;
			isFlagged = true;
			break;
		case FLAG_QUESTION: flagType = FlagType.FLAG_BLANK;
			isFlagged = false;
			break;
		}
	}

}
