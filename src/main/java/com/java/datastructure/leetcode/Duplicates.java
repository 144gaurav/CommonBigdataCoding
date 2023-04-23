package com.java.datastructure.leetcode;

    import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,235};
        boolean isUnique = true;
        Set<Integer> unique = new HashSet();
        for(int num : nums){
            if(!unique.add(num)){
                isUnique = false;
                break;
            }
        }

//        if(isUnique)
//            System.out.println("Array is uniue");
//        else
//            System.out.println("Array is not unique");
    }
    }

