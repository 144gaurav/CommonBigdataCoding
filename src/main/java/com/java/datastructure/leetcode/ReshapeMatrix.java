package com.java.datastructure.leetcode;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4}};
        int[][] output = matrixReshape(mat,2,2);
        System.out.println(output.length);
        System.out.println(output[0].length);
    }



    static  int[][] matrixReshape(int[][] mat, int r, int c) {
        int length1 = mat.length;
        int length2 = mat[0].length;
        if(r*c != length1*length2)
        {
            return mat;
        }
            int m = 0;
            int n = 0;
            int[][] output = new int[r][c];
            for(int i=0 ; i<length1 ; i++){
                for(int j=0 ; j < length2 ; j ++){
                    output[m][n] = mat[i][j];
                    n++;
                    if(n == c){
                        n = 0;
                        m++;
                    }
                }
            }
            return output;
    }
}



/**
 In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

 You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

 The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

 If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.



 Example 1:


 Input: mat = [[1,2],[3,4]], r = 1, c = 4
 Output: [[1,2,3,4]]
 Example 2:


 Input: mat = [[1,2],[3,4]], r = 2, c = 4
 Output: [[1,2],[3,4]]


 Constraints:

 m == mat.length
 n == mat[i].length
 1 <= m, n <= 100
 -1000 <= mat[i][j] <= 1000
 1 <= r, c <= 300
 **/