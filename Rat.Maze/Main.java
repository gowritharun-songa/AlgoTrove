
import java.util.List;

class Main {
  public static void main(String[] args) {
    int[][] maze = {
            {1, 1, 1},
            {1, 0   , 1},
            {1, 1, 1}
        };
    
    Solution obj = new Solution();
    List<String> res = obj.findPath(maze);

    System.out.println(res);
  }
}