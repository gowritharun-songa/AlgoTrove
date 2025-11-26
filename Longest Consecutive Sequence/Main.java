import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    int[] arr = {100, 4, 200, 1, 3, 2};
    int res = optimal(arr);
    System.out.println(res);
  }
  public static int bruteforce(int[] arr) {
    Arrays.sort(arr);
    int curr = 1, maxx = 1;
    for(int i = 1; i < arr.length; i++) {
      if(arr[i - 1] == arr[i]) continue;
      if(arr[i] == arr[i - 1] + 1) curr ++;
      else {
          maxx = Math.max(curr, maxx);
          curr = 1;
      }
    }
    return Math.max(curr, maxx);
  }
  public static int optimal(int[] arr) {
    Set<Integer> set = new HashSet<>();
    for(int ele : arr) {
        set.add(ele);
    }
    int longest = 0;
    for(int ele : arr) {
      if(!set.contains(ele - 1)) {
        int curr = ele;
        int len = 1;
        while(set.contains(curr + 1)) {
          len++;
          curr++;
        }
        longest = Math.max(longest, len);
      }
    } 
    return longest;
  }
}