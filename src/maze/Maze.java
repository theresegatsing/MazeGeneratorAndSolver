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
	
	public Maze(int length, int width) {
		this.length = length;
		this.width = width;
		
	}
	
	
	public int getLength() {
		return this.length;
	}
	
	public int getWidth() {
		return this.width;
	}
}
