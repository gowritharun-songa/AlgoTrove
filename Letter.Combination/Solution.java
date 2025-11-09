import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Solution {
    List<String> letterCombination(String str) {
        List<String> res = new ArrayList<>();
        Map<Character, String> map = new HashMap<>();
            map.put('2', "abc");
            map.put('3', "def");
            map.put('4', "ghi");
            map.put('5', "jkl");
            map.put('6', "mno");
            map.put('7', "pqrs");
            map.put('8', "tuv");
            map.put('9', "wxyz");

        backtrack(str, res, new ArrayList<>(), map, 0);

        return res;
    }
    void backtrack(String str, List<String> res, List<Character> ans, Map<Character, String> map, int index) {
        if(ans.size() == str.length()) {
            StringBuilder combo = new StringBuilder();
            for(char ch : ans) {
                combo.append(ch);
            }
            res.add(combo.toString());
            return;
        }
        String letters = map.get(str.charAt(index));

        for(char letter : letters.toCharArray()) {
            ans.add(letter);
            backtrack(str, res, ans, map, index + 1);
            ans.remove(ans.size() - 1);
        }
    }
}