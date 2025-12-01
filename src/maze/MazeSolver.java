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

    
    private static boolean dfs(char[][] grid, boolean[][] visited, int r, int c) {
        if (grid[r][c] == 'E') {
            return true; // Found exit, start unwinding
        }

        visited[r][c] = true;

        int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        for (int[] d : dirs) {
            int nr = r + d[0];
            int nc = c + d[1];

            if (isValidMove(grid, visited, nr, nc)) {
                if (dfs(grid, visited, nr, nc)) {
                    // This cell is on the correct path
                    if (grid[r][c] == ' ') {
                        grid[r][c] = '·'; // mark path
                    }
                    return true;
                }
            }
        }
        return false; // no path from here
    }
    
    private static boolean isValidMove(char[][] grid, boolean[][] visited, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) return false;
        if (visited[r][c]) return false;

        char cell = grid[r][c];
        return cell == ' ' || cell == 'E';
    }
}

