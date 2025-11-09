import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
  public List<String> findPath(int[][] maze) {
    int n = maze.length;
    List<String> res = new ArrayList<>();
    boolean[][] visits = new boolean[n][n];

    if(maze[0][0] == 1) {
      solve(maze, visits, res, "", 0, 0, n);
    }
    Collections.sort(res);
    return res;
  }

  public boolean isSafe(int[][] maze, boolean[][] visits, int i, int j, int n) {
    return(i >= 0 && i < n && j >= 0 && j < n && maze[i][j] == 1 && !visits[i][j]);
  }

 public void solve(int[][] maze, boolean[][] visits, List<String> res, String path, int i, int j, int n) {
    if(i == n - 1 && j == n - 1) {
      res.add(path);
      return;
    }
    
    visits[i][j] = true;

    // left
    if(isSafe(maze, visits, i, j - 1, n)) {
      solve(maze, visits, res, path + 'L', i, j + 1, n);
    }
    // right
    if(isSafe(maze, visits, i, j + 1, n)) {
      solve(maze, visits, res, path + 'R', i, j + 1, n);
    }
    // top
    if(isSafe(maze, visits, i - 1, j, n)) {
      solve(maze, visits, res, path + 'U', i - 1, j, n);
    }
    // bottom
    if(isSafe(maze, visits, i + 1, j, n)) {
      solve(maze, visits, res, path + 'D', i + 1, j, n);
    }

    visits[i][j] = false;
  }
}