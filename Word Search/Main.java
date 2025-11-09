
public class Main {
  public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
    String word = "ABCCE";

    boolean res = exist(board, word);

    System.out.println(res);
  }
  static boolean exist(char[][] board, String word) {
    for(int i = 0; i < board.length; i++) {
      for(int j = 0; j < board[0].length; j++) {
        if(board[i][j] == word.charAt(0)) {
          if(nextLetter(board, word, i, j, 0)) return true; 
        }
      }
    }
    return false;
  }

  static boolean nextLetter(char[][] board, String word, int i, int j, int index) {
    if(index == word.length()) return true;
    if( i < 0 || i >= board.length ||
        j < 0 || j >= board[0].length ||
        board[i][j] != word.charAt(index) ||
        board[i][j] == '!') {
          return false;
    }

    char temp = board[i][j];
    board[i][j] = '!';

    boolean found = (
      nextLetter(board, word, i - 1, j, index + 1) || //top
      nextLetter(board, word, i + 1, j, index + 1) || // bottom
      nextLetter(board, word, i, j - 1, index + 1) || // left
      nextLetter(board, word, i, j + 1, index + 1)    // right
    );

    board[i][j] = temp;
    return found;
  }
}