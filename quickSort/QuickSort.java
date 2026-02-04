
package com.tharun.quickSort;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {42, 7, 19, 3, 88, 15, 60, 2, 33, 75};

        quickSort(arr, 0, arr.length - 1);

        for(int ele : arr) {
            System.out.print(ele + " ");
        }

    }
    static void quickSort(int[] arr, int left, int right) {
        if(left < right) {
            int par = partition(arr, left, right);

            quickSort(arr, left, par - 1);
            quickSort(arr, par + 1, right);

        }
    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for(int j = left; j < right - 1; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }
}