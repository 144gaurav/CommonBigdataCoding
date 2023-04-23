package com.java.datastructure.leetcode;

public class DemoSol1 {
    public static void main(String[] args) {
        //System.out.println();
        int [] arr = {5,2,0,1,6,4,8,3,7};
        System.out.println(solution("cdeenetpi",arr));
    }

    public static String solution(String S, int[] A) {
        // Implement your solution here
        int len =S.length();
        String[] game = new String[1000];
        StringBuffer sb = new StringBuffer();
        int index = 0;
        sb.append(String.valueOf(S.charAt(0)));
        for(int i=0 ; i<len; i++){
            sb.append(S.charAt(A[index]));
            index = A[index];
            if(A[index] == 0)
                break;
        }
        return sb.toString();
    }
}
