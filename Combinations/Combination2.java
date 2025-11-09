
import java.util.*;
public class Combination2 {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;

        List<List<Integer>> result = combinations(arr, target);
        System.out.println(result);
    }
    static List<List<Integer>> combinations(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        int index = 0;
        Arrays.sort(arr);
        backtrack(arr, result, ans, index, target);
        return result;
    }
    static void backtrack(int[] arr, List<List<Integer>> result,  List<Integer> ans, int index, int currSum) {
        if(currSum == 0) {
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int i = index; i < arr.length; i++) {
            if(i > index && arr[i] == arr[i - 1]) continue;
            if(arr[i] > currSum) break;
            ans.add(arr[i]);
            backtrack(arr, result, ans, i + 1, currSum - arr[i]);
            ans.remove(ans.size() - 1);
        }
    } 
}