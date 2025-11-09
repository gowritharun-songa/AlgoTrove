q   q   
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> res = nQueen(n);

        for(List<String> board : res) {
            for(String row : board) {
                System.out.println(row);
            }
            System.out.println(); 
        }
    }
    public static List<List<String>> nQueen(int n) {
        List<List<String>> res = new ArrayList<>();

        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(board, 0, n, res);
        return res;
    }

    public static void backtrack(char[][] board, int row, int n, List<List<String>> res) {
        if(n == row) {
            List<String> temp = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            res.add(temp);
            return;
        }

        for(int col = 0; col < n; col ++) {
            if(isSafe(board, row, col, n)) {
                board[row][col] = 'Q';
                backtrack(board, row + 1, n, res);
                board[row][col] = '.';
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col, int n) {
        for(int i = 0; i < n; i++) {
            if(board[i][col] == 'Q') return false;
        }

        for(int i = 0; i < n; i++) {
            if(board[row][i] == 'Q') return false;
        }

        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') return false;
        }

        for(int i = row , j = col ; i >= 0 && j < n; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
}