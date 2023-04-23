package com.java.datastructure.leetcode;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("forgeeksskeegfor"));
    }
    public static String longestPalindrome(String str) {
        boolean[][] table = new boolean[str.length()][str.length()];
        int max=0;
        int start = 0;
        for(int i = 0 ; i< str.length() ; i ++){
            table[i][i] = true;
        }

        //for k=2

        for(int i =0; i<str.length()-1; i++ ){
            if(str.charAt(i) == str.charAt(i+1)){
                table[i][i+1] = true;
                if(max < 2){
                    max=2;
                    start = i;
                }

            }
        }

        //for k=3

        for(int k = 3 ; k < str.length() ; k++){
            for(int i =0 ; i < str.length()-k+1; i ++){
                int j = i + k -1;
                        if(table[i+1][j-1] && str.charAt(i) == str.charAt(j)){
                            table[i][j] = true;
                            if(max < k){
                                start = i;
                                max = k;
                            }
                        }
            }
        }
        return str.substring(start,start+max);
    }
}


/***
 * Given a string s, return the longest palindromic substring in s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */
