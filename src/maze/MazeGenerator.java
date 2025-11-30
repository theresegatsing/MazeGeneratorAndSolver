package maze;
import java.util.Random;

/**
 * Randomly creates a maze based on the size provided by the user
 * 
 * @author Therese Elvira Mombou Gatsing
 */

public class MazeGenerator {
	
	 private static final Random rand = new Random();

	 public static Maze generate(int rows, int cols) {
	        if (rows % 2 == 0) rows++;
	        if (cols % 2 == 0) cols++;

	        char[][] grid = new char[rows][cols];

	        // 1. Fill with walls
	        for (int r = 0; r < rows; r++) {
	            for (int c = 0; c < cols; c++) {
	                grid[r][c] = '#';
	            }
	        }

	        // 2. Choose a start cell (odd, odd)
	        int startRow = 1;
	        int startCol = 1;
	        grid[startRow][startCol] = ' ';

	        // 3. Carve passages recursively
	        carve(grid, startRow, startCol);

	        // 4. Set start and end points
	        grid[startRow][startCol] = 'S';
	        int endRow = rows - 2;
	        int endCol = cols - 2;
	        grid[endRow][endCol] = 'E';

	        return new Maze(grid, startRow, startCol, endRow, endCol);
	    }
	 
	 
	 private static void carve(char[][] grid, int r, int c) {
	        // Typical recursive backtracking
	        // Randomly shuffle directions: up, down, left, right
	        int[][] dirs = { { -2, 0 }, { 2, 0 }, { 0, -2 }, { 0, 2 } };
	        shuffle(dirs);

	        for (int[] d : dirs) {
	            int nr = r + d[0];
	            int nc = c + d[1];

	            if (isInBounds(grid, nr, nc) && grid[nr][nc] == '#') {
	                // Knock down the wall between (r,c) and (nr,nc)
	                grid[r + d[0] / 2][c + d[1] / 2] = ' ';
	                grid[nr][nc] = ' ';
	                carve(grid, nr, nc);
	            }
	        }
	    }
	

}
