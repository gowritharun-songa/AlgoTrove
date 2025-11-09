
import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = permutations(arr);
        System.out.println(result);
    }
    static List<List<Integer>> permutations(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr, result, new ArrayList<>());
        return result;
    }
    static void backtrack(int[] arr, List<List<Integer>> result, List<Integer> ans) {
        if(ans.size() == arr.length ) {
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int ele : arr) {
            if(! ans.contains(ele)) {
                ans.add(ele);
                backtrack(arr, result, ans);
                ans.remove(ans.size() - 1);
            }
        }
    }
}
