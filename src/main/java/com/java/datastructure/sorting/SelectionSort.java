package com.java.datastructure.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,4,6,32,2,5,9,1,3};
        System.out.println(Arrays.toString(selectectionSort(arr)));
    }

    public static int[] selectectionSort(int[] input){
        for(int i=0 ; i< input.length; i++){
            int min = i;
            for(int j=i+1; j<input.length; j++){
                if(input[min] > input[j]){
                    min = j;
                }
            }
            int temp = input[i];
            input[i] = input[min];
            input[min] = temp;
        }
        return input;
    }
}
