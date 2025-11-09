// return all the binary strings with the given lenght
// without having the consecutive 1's

import java.util.List;
import java.util.ArrayList;

class BinaryStrings {
    public static void main(String[] args) {
        int n = 3;
        List<String> result = generatingBinaries(n);
        System.out.println(result); 
    }
    static List<String> generatingBinaries(int n) {
        List<String> res = new ArrayList<>();
        String curr = "";
        backtrack(res, curr, n);
        return res;
    }
    static void backtrack(List<String> res, String curr, int n) {
        if(n == curr.length()) {
            res.add(curr);
            return;
        }
        backtrack(res, curr + '0', n);
        if(curr.isEmpty() || curr.charAt(curr.length() - 1) != '1') {
            backtrack(res, curr + '1', n);
        }
    } 

}