public class SubOptimal {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 5, 1};
        int k = 10;
        int result = countSubsetsWithSum(arr, k);
        System.out.println(result);
    }
     static int countSubsetsWithSum(int[] arr, int target) {
        return backtrack(arr, 0, 0, target);
    }

    static int backtrack(int[] arr, int i, int currentSum, int target) {
        if (i == arr.length) {
            return currentSum == target ? 1 : 0;
        }
        int include = backtrack(arr, i + 1, currentSum + arr[i], target);
        int exclude = backtrack(arr, i + 1, currentSum, target);
        return include + exclude;
    }

}
