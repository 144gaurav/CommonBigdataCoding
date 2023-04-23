package com.java.datastructure.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class TestSol {
    public static void main(String[] args) {
        int [] nums1 = {3,3};
        System.out.println(isValid("()[]{}"));
    }

    public  static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i =0 ; i < c.length ; i++){
            if(c[i] == ')' && stack.size() > 0 && stack.peek() == '('){
                stack.pop();
            }
            else if(c[i] == ']' && stack.size() > 0 && stack.peek() == '['){
                stack.pop();
            }
            else if(c[i] == '}' && stack.size() > 0 && stack.peek() == '{'){
                stack.pop();
            }
            else{
                stack.push(c[i]);
            }
        }
        System.out.println(stack);
    return stack.empty();
    }
}
