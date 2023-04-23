package com.java.datastructure.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharectorInString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("gaurav"));
    }

    public static int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int index = -1;
        for(int i =0 ; i<s.length() ; i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),-1);
            }else{
                map.put(s.charAt(i),i);
            }
        }
        for(Character c : map.keySet()){
            if((map.get(c) < index && map.get(c) !=-1) || index == -1){
                index = map.get(c);
            }
        }
        System.out.println(map);
        return index;
    }
}
