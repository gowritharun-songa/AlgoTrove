package com.tharun.InsertionSort;

import java.util.Arrays;

public class Code {
    public static void main(String[] args) {

        int[] arr = {42, 7, 19, 3, 88, 15, 60, 2, 33, 75};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }


}
