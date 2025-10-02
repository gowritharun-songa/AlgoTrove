import java.util.List;
import java.util.ArrayList;

class Code {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Solution solution = new Solution();
        List<List<Integer>> subSets = solution.subSets(arr);

        System.out.println(subSets);
    }
}

class Solution {
    public List<List<Integer>> subSets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        sets(arr, ans, result, i);
        return result;
    }
    public void sets(int[] arr, List<Integer> ans, List<List<Integer>> result, int i) {
        if(i == arr.length) {
            result.add( new ArrayList<>(ans));
            return;
        }
        ans.add(arr[i]);
        sets(arr, ans, result, i + 1);
        ans.removeLast();
        sets(arr, ans, result, i + 1);
    }
}