import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class FreqSort {
    public static void main(String[] args) {
        String s = "tree";
        String result = freqSort(s);
        System.out.println(result);
    }
    static String freqSort(String s) {
        Map<Character, Integer> map = mapping(s);
        List<Map<Character, Integer>> lst = sorting(map);
        StringBuilder res = new StringBuilder();
        for(Map<Character, Integer> each : lst) {
            Character key = each.keySet().iterator().next();
            Integer value = each.get(key);
            for(int i = 0; i < value; i++) {
                res.append(key);
            }
        }
        return res.toString();
    }
    static Map<Character, Integer> mapping(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }
    static List<Map<Character, Integer>> sorting(Map<Character, Integer> map) {
        List<Map<Character, Integer>> lst = new ArrayList<>();
        for(Map.Entry<Character, Integer> pair : map.entrySet()) {
            Character key = pair.getKey();
            Integer value = pair.getValue();
            Map<Character, Integer> temp = new HashMap<>();
            temp.put(key, value);

            lst.add(temp);
        }
        // sorting
        lst.sort(
                (a, b) -> {
                    Integer p = a.values().iterator().next();
                    Integer q = b.values().iterator().next();

                    return q.compareTo(p);
                }
        );
        return lst;
    }
}
