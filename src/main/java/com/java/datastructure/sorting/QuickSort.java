package com.java.datastructure.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,4,6,32,2,5,9,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static int partition(int[] arr, int start, int end){
        int index = start;
        int pivot = arr[end];
        for(int j = start; j <end; j++){
            if(arr[j]<=pivot){
                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;
                index++;
            }
        }
        int temp = arr[index];
        arr[index] = pivot;
        arr[end] = temp;
        return index;
    }

    static void quickSort(int[] arr, int start, int end)
    {
        if (start < end) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, start, end);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, start, pi - 1);
            quickSort(arr, pi + 1, end);
        }
    }
}
