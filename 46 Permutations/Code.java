import java.util.ArrayList;
import java.util.List;

class Code {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Solution solution = new Solution();
        List<List<Integer>> result = solution.permutations(arr);

        System.out.println(result);
    }
}

class Solution {
    public List<List<Integer>> permutations(int[] arr) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> sol = new ArrayList<>();

        backtrack(arr, sol, result);

        return result;
    }
    public void backtrack(int[] arr, List<Integer> sol, List<List<Integer>> result) {
        if(arr.length == sol.size()) {
            result.add( new ArrayList<>(sol));
            return;
        }
        for(int val : arr) {
            if(!sol.contains(val)) {
                sol.add(val);
                backtrack(arr, sol, result);
                sol.removeLast();
            }
        }
    }
}