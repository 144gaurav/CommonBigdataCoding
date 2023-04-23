package com.java.datastructure.leetcode;

public class DemoSol {
    public static void main(String[] args) {
        //System.out.println();
        System.out.println(solution("digit"));
    }

    public static String solution(String s) {

//        System.out.println(Integer.valueOf('a')); //97
//        System.out.println(Integer.valueOf('z'));// 122
//        System.out.println(Integer.valueOf('A'));// 65
//        System.out.println(Integer.valueOf('Z')); //90
//        System.out.println(Integer.valueOf('1'));
//        System.out.println(Integer.valueOf('9'));//57
//        System.out.println(Integer.valueOf('0'));//48
        char c = s.charAt(0);
        if ( Integer.valueOf(c) >=65  && Integer.valueOf(c) <= 90){  // please fix condition
            return "upper";
        } else if(Integer.valueOf(c) >=97  && Integer.valueOf(c) <= 122){  // please fix condition
            return "lower";
        } else if (Integer.valueOf(c) >=48  && Integer.valueOf(c) <= 57){  // please fix condition
            return "digit";
        } else {
            return "other";
        }
    }
}
