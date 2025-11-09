
import java.util.List;
import java.util.ArrayList;

class Code {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> result = subSets(arr);
        System.out.println(result);
    }
    static List<List<Integer>> subSets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int index = 0;
        backtrack(result, ans, arr, index);
        return result;
    }
    static void backtrack(List<List<Integer>> result, List<Integer> ans, int[] arr, int index) {
        /*if(index == arr.length) {
            result.add(new ArrayList<>(ans));
            return;
        }
        //include
        ans.add(arr[index]);
        backtrack(result, ans, arr, index + 1);
        //exclude
        ans.remove(ans.size() - 1);
        backtrack(result, ans, arr, index + 1);*/
        result.add(new ArrayList<>(ans));
        for(int i = index; i < arr.length; i++) {
            if(i > index &&  arr[i] == arr[i - 1]) continue;
            ans.add(arr[i]);
            backtrack(result, ans, arr, index + 1);
            ans.remove(ans.size() - 1);
        }
    }
}