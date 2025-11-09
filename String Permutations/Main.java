
import java.util.*;
class Main {
    public static void main(String[] args) {
        String str = "kk";
        List<String> res = permutations(str);

        System.out.println(res);
    }

    static List<String> permutations(String str) {
        List<String> res = new ArrayList<>();
        char[] chars = str.toCharArray();// char array
        boolean[] visits = new boolean[str.length()];

        Arrays.sort(chars);

        backtrack(chars, new StringBuilder(), visits, res);

        return res;

    }

    static void backtrack(char[] chars, StringBuilder ans, boolean[] visits, List<String> res) {
        if(ans.length() == chars.length) {
            res.add(ans.toString());
            return;
        }
        for(int i = 0; i < chars.length; i++) {
            if(visits[i]) continue;
            if(i > 0 && chars[i] == chars[i - 1] && !visits[i - 1]) continue;

            visits[i] = true;
            ans.append(chars[i]);
            backtrack(chars, ans, visits, res);
            ans.deleteCharAt(ans.length() - 1);
            visits[i] = false;

        }
    }
}