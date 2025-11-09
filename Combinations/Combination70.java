import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[n]; // 1 2 3 4

        for(int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }

        List<List<Integer>> result = combinations(arr, 2);
        System.out.println(result);
    }
    static List<List<Integer>> combinations(int[] arr, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int index = 0;
        backtrack(arr, res, ans, index, 2);

        return res;
    }

    static void backtrack(int[] arr, List<List<Integer>> res, List<Integer> ans, int index, int k) {
        if(k == ans.size()) {
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i = index; i < arr.length; i++) {
            if(i > 0 && arr[i] == arr[i - 1]) continue;
            ans.add(arr[i]);
            backtrack(arr, res, ans, i + 1, k);
            ans.remove(ans.size() - 1);
        }
    }
}