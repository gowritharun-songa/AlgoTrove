package Parenthesis;

import java.util.List;
import java.util.ArrayList;

public class GenerateOptimal {
    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println(result);
    }
    static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String curr = "";
        int open = 0, close = 0;
        backtrack(n, open, close, curr, result);
        return result;
    }
    static void backtrack(int n, int open, int close, String curr, List<String> result) {
        if(curr.length() == 2 * n) {
            result.add(curr);
            return;
        }
        if(open < n) {
            backtrack(n, open + 1, close, curr + '(', result);
        }
        if(close < open) {
            backtrack(n, open, close + 1, curr + ')', result);
        }
    }
}