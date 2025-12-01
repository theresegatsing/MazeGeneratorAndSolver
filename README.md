# Maze Generator and Solver 

This project generates a random maze of a user-chosen size and then solves it using depth-first search (DFS). The solution path from the start `S` to the exit `E` is marked directly on the maze.

## Features

- Generate a random maze with walls (`#`), open paths (` `), a start `S`, and an exit `E`.
- Solve the maze using a DFS-based backtracking algorithm.
- Mark the correct solution path with a special character (e.g. `·`).
- Display the maze before and after solving in the console.

## Project Structure

```text
src/
└── maze/
    ├── Maze.java           # Represents the maze grid and print helper
    ├── MazeGenerator.java  # Builds a random maze of given size
    ├── MazeSolver.java     # DFS-based solver that marks the solution path
    └── MazeApp.java        # Main class (user input + run generator & solver)
