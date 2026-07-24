import java.util.*;

public class Main {

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    public static void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length
                || grid[i][j] == '0')
            return;

        // Mark current cell as visited
        grid[i][j] = '0';

        dfs(grid, i + 1, j); // Down
        dfs(grid, i - 1, j); // Up
        dfs(grid, i, j + 1); // Right
        dfs(grid, i, j - 1); // Left
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter number of rows and columns
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        char[][] grid = new char[rows][cols];

        // Enter grid values (0 or 1)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        System.out.println(numIslands(grid));

        sc.close();
    }
}