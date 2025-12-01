package maze;
import java.util.Scanner;


/**
 * 
 * 
 * @author Therese Elvira Mombou Gatsing
 */

public class MazeApp {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter maze rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter maze columns: ");
        int cols = scanner.nextInt();

        Maze maze = MazeGenerator.generate(rows, cols);

        System.out.println("\nGenerated Maze:");
        maze.print();

        boolean solved = MazeSolver.solve(maze);

        if (solved) {
            System.out.println("\nSolved Maze (path marked with ·):");
            maze.print();
        } else {
            System.out.println("No path found from S to E.");
        }

        scanner.close();
    }
	
	

}
