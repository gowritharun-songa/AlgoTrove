import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    int n = 3;
    List<String> result = generateBinaries(n);
    System.out.println(result);
  }
  static List<String> generateBinaries(int n) {
    List<String> result = new ArrayList<>();
    String curr = "";
    backtrack(n, curr, result);
    return result;
  }
  static void backtrack(int n, String curr, List<String> result) {
    if(n == curr.length()) {
      result.add(curr);
      return;
    }
    // add 0 first;
    backtrack(n, curr + "0", result);
    // adding 1 only if the prev number is not 1
    if(curr.isEmpty() || curr.charAt(curr.length() - 1) != '1') {
      backtrack(n, curr + "1", result);
    }
  }
}