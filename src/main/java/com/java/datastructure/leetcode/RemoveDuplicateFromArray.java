package com.java.datastructure.leetcode;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int[] finalArray = new int[nums.length];
        finalArray[0] = nums[0];
        int currentIndex = 0;
        int insertIndex = 1;
        int counter = 1;
        for(int i=1 ; i < nums.length ; i++){
            if(nums[i] != finalArray[currentIndex]){
                finalArray[insertIndex] = nums[i];
                currentIndex++;
                insertIndex++;
                counter++;            }
        }
        for (int i = 0; i < nums.length; i++)
            nums[i] = finalArray[i];
        return counter;
    }
}
