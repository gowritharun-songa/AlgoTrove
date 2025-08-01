class Main {
    public static void main(String[] args) {

        int[] arr = {2, 0, 2, 1, 1, 0, 1, 2, 0, 0};

        Solution solution = new Solution();

        int[] res1 = solution.setColors(arr); // For notmal approach

        for (int i : res1) {
            System.out.print(i + " ");      // Printing the result !!
        }

        System.out.println();

        int[] res2 = solution.dutchFlagAlgo(arr);

        for (int i : res2) {
            System.out.print(i + " ");
        }

        
    }
}

class Solution {
    public int[] setColors(int[] arr) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i : arr) {
            if (i == 0) count0++;
            else if (i == 1) count1++;
            else count2++;
        }

        int index = 0;

        for (int i = 0; i < count0; i += 1) {
            arr[index++] = 0; 
        }

        for (int i = 0; i < count1; i += 1) {
            arr[index++] = 1;
        }

        for (int i = 0; i < count2; i += 1) {
            arr[index++] = 2;
        }

        return arr;
    }

    public int[] dutchFlagAlgo(int[] arr) {

        int low = 0, mid = 0;
        int high = arr.length - 1;

        while(mid <= high) {

            if(arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low += 1;
                mid += 1;
            }

            else if (arr[mid] == 1) mid += 1;

            else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high -= 1;
            }
        }
        return arr;
    }
}