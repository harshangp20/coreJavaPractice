package com.example;

import java.util.Scanner;

public class Exception_Using_Nested_try_Catch {
    public static void main(String[] args) {
        int[] b = new int[3];
        b[0] = 4;
        b[1] = 5;
        b[2] = 6;

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Enter Any Number of Index: ");
            int num = sc.nextInt();
            try {
                System.out.println("Welcome to the Nested Try Catch Block!");
                try {
                    System.out.println(b[num]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry This Array index does not exist!");
                    System.out.println("Exception in Level 2!");
                }
            }
            catch (Exception c) {
                System.out.println("Exception in level 1!");
                System.out.println(c);
            }
        }
        System.out.println("Thanks for usnig This Code!");
    }
}
