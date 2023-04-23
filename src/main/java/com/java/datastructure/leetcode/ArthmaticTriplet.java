package com.java.datastructure.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class ArthmaticTriplet {
    public static void main(String[] args) {
        int[] nums = {0,1,4,6,7,10};
        int diff  = 3;
        HashMap<Integer,Integer> map = new HashMap();
        List<List<Integer>> list = new ArrayList<>();
        int j=0;
        for(int i=0 ; i<nums.length ; i++){
            if(map.containsKey(nums[i] - diff)){

                for(int k=0 ; k<list.size() ; k++){
                    if(list.get(k).size() == 2)
                    {
                        if(nums[i] - nums[list.get(k).get(1)] == diff){
                            list.get(k).add(i);

                        }
                    }
                    if(k == list.size()-1 && i == nums.length-1 && list.get(k-1).size() == 2){
                        System.out.println("inside");
                    }
                }
                List<Integer> tripplet = new ArrayList<>();
                tripplet.add(map.get(nums[i] - diff));
                tripplet.add(i);
                list.add(tripplet);
            }
            map.put(nums[i],i);
        }

        System.out.println(list.stream().filter(x -> x.size() == 3).collect(Collectors.toList()).size());

    }
}
