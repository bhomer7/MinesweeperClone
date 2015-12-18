
public enum DifficultyClass {
	
	EASY (8, 8, 10),
	NORMAL (16, 16, 40),
	HARD (24, 24, 99),
	EXTREME (32, 32, 192),
	CUSTOM (0, 0, 0);

	private final int rows;
	private final int cols;
	private final int numMines;
	DifficultyClass(int r, int c, int m) {
		this.rows = r;
		this.cols = c;
		this.numMines = m;
	}
	
	public int rows() { return rows; }
	public int cols() { return cols; }
	public int numMines() { return numMines; }
}
