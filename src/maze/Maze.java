package maze;

/**
 * Holds the grid
 * 
 * @author Therese Elvira Mombou Gatsing
 */
public class Maze {
	
	private int startRow;
	private int startCol;
	private int endRow;
	private int endCol;
	private char[][] grid;
	
	public Maze(char[][] grid, int startRow, int startCol, int endRow, int endCol) {
		this.startRow = startRow;
		this.startCol = startCol;
		this.endCol = endCol;
		this.endRow = endRow;
		this.grid = grid;
		
	}
	
	
	public int getStartRow() {
		return this.startRow;
	}
	
	public int getStartCol() {
		return this.startCol;
	}
	
	public int getEndCol() {
		return this.endCol;
	}
	
	public int getEndRow() {
		return this.endRow;
	}
	
	public char[][] getGrid(){
		return this.grid;
	}
	
	public void print() {
		for (char[] row: grid) {
			System.out.println((new String(row)));
		}
	}
	
	
}
