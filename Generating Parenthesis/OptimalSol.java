
import java.util.*;

public class OptimalSol {
    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println(result);
    }
    static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String curr = "";
        int open = 0, close = 0;
        backtrack(curr, open, close, result, n);
        return result;
    }

    static void backtrack(String curr, int open, int close, List<String> result, int n) {
        if(curr.length() == n * 2) {
            result.add(curr);
            return;
        }
        if(open < n) {
            backtrack(curr + "(", open + 1, close, result, n);
        }
        if(close < open) {
            backtrack(curr + ")", open, close + 1, result, n);
        }
    }

}