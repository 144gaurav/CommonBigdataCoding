package com.java.datastructure.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-1230000));
    }
    public static int reverse(int x) {
        StringBuffer sb = new StringBuffer();
        int output = 0;
        String sign = "";
        char[] s = String.valueOf(x).toCharArray();
        for(int i = s.length-1; i>=0;i--){
            if(s[i] == '-'){
                sign = String.valueOf(s[i]);
            }
            else {
                sb.append(s[i]);
            }
        }
        try{
            return Integer.parseInt(sign+sb.toString());
        }catch (Exception e){
            return output;
        }
    }
}


/***
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 *
 *
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 * Example 2:
 *
 * Input: x = -123
 * Output: -321
 * Example 3:
 *
 * Input: x = 120
 * Output: 21
 *
 *
 * Constraints:
 *
 * -231 <= x <= 231 - 1
 */
