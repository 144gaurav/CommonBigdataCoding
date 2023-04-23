package com.java.datastructure.leetcode;

public class Search2dMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,31));
    }

    static public boolean searchMatrix(int[][] matrix, int target) {
        int rowStart = 0;
        int endRow = matrix.length-1;
        int colStart = 0;
        int endCol = matrix[0].length-1;
        int midRows = 0;
        int midCols = 0;
        if(matrix[0][0]>target)
            return false;

        while(rowStart <= endRow){
             midRows = (endRow + rowStart) /2;
            if(matrix[midRows][0] == target){
                return true;
            }else if(matrix[midRows][0] > target){
                System.out.println("continue : " + "midRows " + midRows + " midcols : " + midCols );
                endRow = midRows-1;
                continue;
            }else if(matrix[midRows][matrix[0].length-1] < target){
                System.out.println("continue : " + "midRows " + midRows + " midcols : " + midCols );
                rowStart = midRows +1;
                continue;
            }else{
                rowStart = midRows + 1;
            }
            while(colStart <= endCol ){
                midCols = (endCol + colStart) /2;
                if(matrix[midRows][midCols] == target){
                    return true;
                }
                else if(matrix[midRows][midCols] < target){
                    System.out.println("inside");
                    colStart = midCols+1;
                }
                else if(matrix[midRows][midCols] > target){
                    System.out.println("inside");
                    endCol = midCols-1;
                }
            }
        }
        return false;
    }
}


/**
 * You are given an m x n integer matrix matrix with the following two properties:
 *
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise.
 *
 * You must write a solution in O(log(m * n)) time complexity.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * Output: true
 * Example 2:
 *
 *
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * Output: false
 *
 *
 * Constraints:
 *
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 100
 * -104 <= matrix[i][j], target <= 104
 **/