
import java.util.List;
import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 5, 1};
        int k = 10;
        List<List<Integer>> result = subSets(arr);
        int count = 0;
        for(List<Integer> set : result) {
            if(sum(set) == k) count++;
        }
        System.out.println(count);
    }
    static int sum(List<Integer> set) {
        int sum = 0;
        for(Integer ele : set) {
            sum += ele;
        }
        return sum;
    }
    static List<List<Integer>> subSets(int[] arr) {
        List<List<Integer>> rslt = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        backtrack(rslt, ans, arr, 0);
        return rslt;
    }
    static void backtrack(List<List<Integer>> rlst, List<Integer> ans, int[] arr, int i) {
        if(i == arr.length) {
            rlst.add(new ArrayList<>(ans));
            return;
        }
        ans.add(arr[i]);
        backtrack(rlst, ans, arr, i + 1);
        ans.remove(ans.size()- 1);
        backtrack(rlst, ans, arr, i + 1);
    }
}
