package com.java.datastructure.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i < numRows ; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0 ; j < i+1 ; j++){
                int x = 1;
                if(i>=2 && j > 0){
                    int adder = j >= result.get(i-1).size() ? 0 : result.get(i-1).get(j);
                    System.out.println("i : " + i + "  j: " + j);
                    x = result.get(i-1).get(j-1) + adder;
                }
                list.add(x);
            }
            result.add(list);
        }

        return result;
    }
}


/**

 Given an integer numRows, return the first numRows of Pascal's triangle.

 In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:




 Example 1:

 Input: numRows = 5
 Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 Example 2:

 Input: numRows = 1
 Output: [[1]]


 Constraints:

 1 <= numRows <= 30
 */