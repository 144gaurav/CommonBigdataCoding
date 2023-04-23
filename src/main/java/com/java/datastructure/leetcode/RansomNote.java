package com.java.datastructure.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa","ab"));
    }

    static public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> mag = new HashMap();
        for(int i = 0 ; i < magazine.length() ; i++){
            if(mag.containsKey(magazine.charAt(i))){
                mag.put(magazine.charAt(i),mag.get(magazine.charAt(i)) + 1);
            }else{
                mag.put(magazine.charAt(i),1);
            }
        }

        for(int j = 0; j < ransomNote.length() ; j++){
            if(mag.containsKey(ransomNote.charAt(j)) && mag.get(ransomNote.charAt(j)) > 0){
                mag.put(ransomNote.charAt(j),mag.get(ransomNote.charAt(j)) - 1);
            }else{
                return false;
            }
        }
        return true;
    }
}


/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 *
 *
 *
 * Example 1:
 *
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 *
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 *
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= ransomNote.length, magazine.length <= 105
 * ransomNote and magazine consist of lowercase English letters.
 */
