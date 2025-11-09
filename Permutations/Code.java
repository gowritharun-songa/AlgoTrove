
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Code {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> result = permutations(arr);
        System.out.println(result);
    }
    static List<List<Integer>> permutations(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        boolean[] visits = new boolean[arr.length];
        backtrack(arr, result, new ArrayList<>(), visits);
        return result;
    }
    static void backtrack(int[] arr, List<List<Integer>> result, List<Integer> ans, boolean[] visits) {
        if(ans.size() == arr.length) {
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int i = 0; i < arr.length; i++) {
            if(visits[i]) continue;
            if(i > 0 && arr[i] == arr[i - 1] && !visits[i - 1]) continue;
            visits[i] = true;
            ans.add(arr[i]);
            backtrack(arr, result, ans, visits);
            ans.remove(ans.size() - 1);
            visits[i] = false;
        }
    }
}
