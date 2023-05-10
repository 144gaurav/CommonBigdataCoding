package com.visa;

public class CodingTest {
    public static void main(String[] args) {
        System.out.println(palindrom(122221));
    }

    public static boolean palindrom(int num) {
        int check =0;
        while(num >check){
            check = check*10 + num%10;
            num = (num - num%10)/10;
        }
        System.out.println(check);
        System.out.println(num);
    return true;
    }
}
