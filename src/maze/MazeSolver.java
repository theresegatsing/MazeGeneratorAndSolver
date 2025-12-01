package maze;

/**
 * Solves the maze
 *   
 * @author Therese Elvira Mombou Gatsing
 */

public class MazeSolver {
	
    public static boolean solve(Maze maze) {
        char[][] grid = maze.getGrid();
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        int sr = maze.getStartRow();
        int sc = maze.getStartCol();

        // We don't overwrite 'S' and 'E' themselves, only the path between them
        return dfs(grid, visited, sr, sc);
    }

}
