package com.java.datastructure.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        int[] input = {1, 3, 6, 4, 1, 2};
        System.out.println(find(input));
    }

    public static int find(int[] A) {
        boolean[] arr = new boolean[1000000+1];
        for (int i = 0; i < A.length; i++) {
            if(A[i] >0){
                arr[A[i]] = true;
            }
        }
        for(int i = 1 ; i < arr.length ; i++){
            if(!arr[i]){
                return i;
            }
        }
        return 1;
    }
}


/***
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */