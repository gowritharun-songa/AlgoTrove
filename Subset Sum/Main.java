
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1};
        List<Integer> result = subSetSum(arr);
        
        System.out.println(result);
    }
    static List<Integer> subSetSum(int[] arr) {
        List<Integer> result = new ArrayList<>();
        backtrack(arr, result, 0, 0); // arr, result, sum, index;

        //sort
        Collections.sort(result, (a, b) -> b - a);
        return result;
    }
    static void backtrack(int[] arr, List<Integer> result, int sum, int index) {
        if(index == arr.length) {
            result.add(sum);
            return;
        }
        // include
        backtrack(arr, result, sum + arr[index], index + 1);
        // exclude
        backtrack(arr, result, sum , index + 1);
    }
}