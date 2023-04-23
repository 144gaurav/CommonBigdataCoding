package com.java.datastructure.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ValidSoduko {
    public static void main(String[] args) {

    }

    static boolean isValidSudoku(char[][] board) {
        Map<String,String> map = new HashMap<>();
        char c = '.';
        int[][][] sub = new int[3][3][10];
        int subRowIndex = 0;
        int subColIndex = 0;
        for(int i =0 ; i< board.length; i++){
            int[] arr = new int[10];
            for(int j = 0 ; j < board[0].length ; j ++){
                if(i%3 == 0)
                    subRowIndex++;
                if(j%3 == 0)
                    subColIndex++;
                System.out.println("i : " + i +  " j: " + j + " value : " + board[i][j]);
                String value = String.valueOf(board[i][j]);
                if(board[i][j] !=c){
                    if(sub[subRowIndex][subColIndex][Integer.parseInt(String.valueOf(board[i][j]))] == 0){
                        sub[subRowIndex][subColIndex][Integer.parseInt(String.valueOf(board[i][j]))] = 1;
                    }
                    else{
                        return false;
                    }

                    if(arr[Integer.parseInt(String.valueOf(board[i][j]))] == 0){
                        System.out.println("Inside row if with value : " + board[i][j]);
                        arr[Integer.parseInt(String.valueOf(board[i][j]))] = 1;
                    }
                    else{
                        return false;
                    }
                    if(!map.containsKey(j + value)){
                        map.put(j + value,String.valueOf(board[i][j]));
                    }
                    else {
                        System.out.println("i : " + i +  " j: " + j + " value : " + board[i][j]);
                        System.out.println("map" + map);
                        return false;
                    }
                }
            }
        }
        return true;
    }



    public static boolean isValidSudoku1(char[][] board) {
        int N = 9;

        // Use hash set to record the status
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];
        for (int r = 0; r < N; r++) {
            rows[r] = new HashSet<Character>();
            cols[r] = new HashSet<Character>();
            boxes[r] = new HashSet<Character>();
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                char val = board[r][c];

                // Check if the position is filled with number
                if (val == '.') {
                    continue;
                }

                // Check the row
                if (rows[r].contains(val)) {
                    return false;
                }
                rows[r].add(val);

                // Check the column
                if (cols[c].contains(val)) {
                    return false;
                }
                cols[c].add(val);

                // Check the box
                int idx = (r / 3) * 3 + c / 3;
                if (boxes[idx].contains(val)) {
                    return false;
                }
                boxes[idx].add(val);
            }
        }
        return true;
    }
}


/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 *
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 *
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 */
