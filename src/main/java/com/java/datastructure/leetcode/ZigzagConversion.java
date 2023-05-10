package com.java.datastructure.leetcode;

public class ZigzagConversion {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",4));
    }

    public static String convert(String s, int numRows) {
        Character[][] output = new Character[numRows][s.length()];
        int index1 = 0;
        int index2 = 0;
        int midIndex = numRows-2;
        for(int i=0 ; i < s.length(); i++){
            if(numRows==1){
                output[index1][index2] = s.charAt(i);
                index2++;
            }
            else {
                if((index2%(numRows-1))==0  && midIndex >=0 &&(index1<numRows)){
                    output[index1][index2] = s.charAt(i);
                    index1++;
                    midIndex = numRows-2;
                }else if(index2<s.length()){
                    index2 = (index2%(numRows-1))==0 ? index2+1 : index2;
                    midIndex = midIndex<0 ? numRows-2+1 : midIndex;
                    index1 = midIndex;
                    output[index1][index2] = s.charAt(i);
                    index1 = 0;
                    index2++;
                    midIndex--;
                }
            }
        }
        String str = "";
        for (int i = 0; i < output.length; i++){
            for (int j = 0; j < output[i].length; j++){
                //System.out.print(output[i][j] + " ");
                if(output[i][j] != null){
                    str+=output[i][j];
                }

            }
           // System.out.println(" ");
        }
        return str;
    }
}

/***
 * 6. Zigzag Conversion
 * Medium
 *
 * 6046
 *
 * 12139
 *
 * Add to List
 *
 * Share
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 *
 *
 * Example 1:
 *
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * Example 3:
 *
 * Input: s = "A", numRows = 1
 * Output: "A"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 1000
 * s consists of English letters (lower-case and upper-case), ',' and '.'.
 * 1 <= numRows <= 1000
 */
