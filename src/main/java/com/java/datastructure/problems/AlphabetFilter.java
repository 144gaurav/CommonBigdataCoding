package com.java.datastructure.problems;

import java.util.Arrays;
import java.util.List;

public class AlphabetFilter {
    final static List<Character> vowelList = Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'});
    public static void main(String[] args) {
        System.out.println("filter_vowels : " + filter_vowels("agauravbhartia"));
        System.out.println("filter_consonents : " + filter_consonents("agauravbhartia"));
    }

    public static String filter_vowels(String str){
        char[] sb = str.toCharArray();
        StringBuffer finalStr = new StringBuffer();
        for(int i=0;i<sb.length;i++){
            if(!vowelList.contains(sb[i])){
                finalStr.append(sb[i]);
               // sb.replace(i,i+1,"");
              //  i--;
            }
        }
        return finalStr.toString();
    }

    public static String filter_consonents(String str){
        char[] sb = str.toCharArray();
        StringBuffer finalStr = new StringBuffer();
        for(int i=0;i<sb.length;i++){
            if(vowelList.contains(sb[i])){
                finalStr.append(sb[i]);
                // sb.replace(i,i+1,"");
                //  i--;
            }
        }
        return finalStr.toString();
    }
}
