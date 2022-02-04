package com.day2;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        //count the particular number in integer
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int num = 2566688;
        while (num>0) {
            int rem = num%10;
            if(rem == n){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}



