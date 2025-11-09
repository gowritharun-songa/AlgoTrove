
import java.util.List;
import java.util.ArrayList;

class Combination1 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4};
        int target = 9;
        List<List<Integer>> result = combinations(arr, target);
        System.out.println(result);
    }
    static List<List<Integer>> combinations(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int index = 0;
        backtrack(arr, result, ans, index, target);
        return result;
    }
    static void backtrack(int[] arr, List<List<Integer>> result, List<Integer> ans, int index, int currSum) {
        if(currSum == 0) {
            result.add(new ArrayList<>(ans));
            return;
        }
        if(currSum < 0 || index >= arr.length) {
            return;
        }
        ans.add(arr[index]);
        backtrack(arr, result, ans, index, currSum - arr[index]);
        ans.remove(ans.size() - 1);
        backtrack(arr, result, ans, index + 1, currSum);
    }
}