package com.java.datastructure.leetcode;

public class DivideAndConquerExamples {
    public static void main(String[] args) {
        int [] arrays = new int[]{1,2,3,4,534,6,5,6,4,4,9,-1,-1};
        System.out.println(dac_min(arrays,0,arrays.length));
        System.out.println(maxSubArraySum(arrays));
    }

    public static int dac_min(int[] inputArray,int index,int length){
        int min;
        if(length - 1 == 0)
            return inputArray[index];
        if(index >= length-2){
            if(inputArray[index] < inputArray[index + 1])
                return inputArray[index];
            else
                return inputArray[index + 1];
        }
        min = dac_min(inputArray,index + 1, length);
        if (inputArray[index]  < min)
            return inputArray[index];
        else
           return min;
    }

    static int maxSubArraySum(int a[])
    {

        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

}


/** Given an integer array nums, find the subarray with the largest sum, and return its sum. **/
