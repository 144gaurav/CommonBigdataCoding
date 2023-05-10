package com.java.datastructure.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,4,6,3,32,2,5,9,1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int index = i;
            int key = arr[index];
            while (index>0 && arr[index-1]>key){
                arr[index] = arr[index-1];
                index--;
            }
            arr[index] = key;
        }
        return arr;
    }
}
