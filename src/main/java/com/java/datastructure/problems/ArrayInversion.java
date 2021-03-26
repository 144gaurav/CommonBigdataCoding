package com.java.datastructure.problems;

public class ArrayInversion  {
    public static void main(String[] args) {

        int [] arr = {1,200,30,4,34};
        int result = calculate_array_inversion_value(arr);
        System.out.println("Array Inversion Value :" + result);

    }

    public static int calculate_array_inversion_value(int[] arr){
        int result =0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j])
                    result = result+1;
            }
        }
        return result;
    }
}
