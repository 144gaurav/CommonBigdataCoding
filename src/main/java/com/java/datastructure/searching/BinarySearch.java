package com.java.datastructure.searching;

public class BinarySearch {
    public static void main(String args[]){
        int[] arr = {1, 1, 2, 3, 4, 5, 6, 9, 32};
        System.out.println(search(arr,10));
    }

    public static int search(int[] input, int key){
        int start = 0;
        int end = input.length-1;
        int mid = (start+end)/2;

        while(start<=end){
            if(input[mid] == key){
                return mid;
            }
            else if(input[mid] > key){
                end = mid-1;
            }
            else {
                start = mid +1;
            }
            mid = (start+end)/2;
        }
        return -1;
    }
}
