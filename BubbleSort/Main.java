package com.tharun.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {42, 7, 19, 3, 88, 15, 60, 2, 33, 75};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j += 1) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
