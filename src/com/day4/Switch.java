package com.day4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String dept = sc.next();
        switch (name) {
            case "sumathi":
                System.out.println("Hi Sumathi");
                break;
            case "phani":
                System.out.println("Hi Phani");

                switch (dept){
                    case "it":
                        System.out.println("IT dept");
                        break;
                    case "ps":
                        System.out.println("Police dept");
                        break;
                }
                break;
            default:
                System.out.println("HI User");
        }
    }
}
