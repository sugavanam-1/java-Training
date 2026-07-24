import java.util.*;

public class Main5 {

    public static boolean exist(char[][] board, String word) {

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, i, j, 0))
                    return true;
            }
        }

        return false;
    }

    public static boolean dfs(char[][] board, String word, int i, int j, int index) {

        if (index == word.length())
            return true;

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length
                || board[i][j] != word.charAt(index))
            return false;

        // Mark the current cell as visited
        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = dfs(board, word, i + 1, j, index + 1)
                || dfs(board, word, i - 1, j, index + 1)
                || dfs(board, word, i, j + 1, index + 1)
                || dfs(board, word, i, j - 1, index + 1);

        // Restore the original character
        board[i][j] = temp;

        return found;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter rows and columns
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        char[][] board = new char[rows][cols];

        // Enter board characters
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }

        // Enter the word to search
        String word = sc.next();

        System.out.println(exist(board, word));

      
    }
}