package Parenthesis;
import java.util.List;
import java.util.ArrayList;

class GenerateParenthesis {
    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println(result);
    }

    static boolean isValid(String s) {
        int balance = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return balance == 0;
    }

    static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack("", n, result);
        return result;
    }

    static void backtrack(String curr, int n, List<String> result) {
        if (curr.length() == n * 2) {
            if (isValid(curr)) {
                result.add(curr);
            }
            return;
        }
        backtrack(curr + "(", n, result);
        backtrack(curr + ")", n, result);
    }
}