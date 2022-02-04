package com.sumathi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi Sumathi");
        System.out.println("please enter your marks");
        Scanner marks = new Scanner(System.in);
        int s_marks = marks.nextInt();
        System.out.println("your marks is " + s_marks);

        /*
        Data types(primitive-> which we cant break into further more)
        int n = 6;
        byte b = 2;
        float f = 6.8f;
        double d = 456.99999999;
        long l = 56.9999L;
        char c = 'A';
        boolean b= true

        casting
        int cast = (int)(f);
        byte castB = (byte)(257);
         */
    }
}

