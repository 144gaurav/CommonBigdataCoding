package com.java.datastructure.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram2("anagram","nagaram"));

    }
    public static boolean isAnagram(String s, String t) {
        char[] input = s.toCharArray();
        char[] target = t.toCharArray();
        int[] frequencies = new int[26];
        Arrays.sort(input);
        Arrays.sort(target);
        if(Arrays.toString(input).equals(Arrays.toString(target)))
            return true;
        else
            return false;
    }

    public static boolean isAnagram2(String s, String t) {
        if(s.length() !=t.length())
            return false;
        int[] frequencies = new int[26];
       for(int i = 0 ; i< s.length() ; i++){
           frequencies[s.charAt(i)-'a']++;
           frequencies[t.charAt(i)-'a']--;
       }
            for (int i : frequencies) {
                if (i < 0)
                    return false;
            }
       return true;
    }
}


/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 *
 *
 * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */
