package com.java.datastructure.leetcode;

import java.util.*;

public class IntersectionOfArrays {
    public static void main(String[] args) {
//    int nums1[] = {1,2,2,1};
//    int nums2[] = {2};

        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
        //intersect2(nums1,nums2);
    }

    public static int[] intersect(int[] nums1, int[] nums2){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i= 0 ; i < nums1.length ; i++){
            for(int j=0 ; j < nums2.length ; j ++){
                if(nums1[i] == nums2[j] && !map.containsKey(j)){
                    map.put(j,nums1[i]);
                    break;
                }
            }
        }
        return map.entrySet().stream().map(x -> x.getValue())
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static int[] intersect2(int[] nums1, int[] nums2){
        int[] arr = new int[1001];
        for(int n : nums2){
            arr[n]++;
        }
        System.out.println(Arrays.toString(arr));
        return null;
    }
}

/**

    Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.



        Example 1:

        Input: nums1 = [1,2,2,1], nums2 = [2,2]
        Output: [2,2]
        Example 2:

        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        Output: [4,9]
        Explanation: [9,4] is also accepted.


        Constraints:

        1 <= nums1.length, nums2.length <= 1000
        0 <= nums1[i], nums2[i] <= 1000


        Follow up:

        What if the given array is already sorted? How would you optimize your algorithm?
        What if nums1's size is small compared to nums2's size? Which algorithm is better?
        What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

 **/