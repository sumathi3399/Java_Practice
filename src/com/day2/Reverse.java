package com.day2;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int op = 0;
        while (num > 0){
            int rem = num %10;
            op = op*10 +rem;
            num = num/10;
        }
        System.out.println(op);

    }
}
