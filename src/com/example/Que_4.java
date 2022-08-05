package com.example;

import java.util.Scanner;

public class Que_4 {
    public static void main(String[] args) {
        System.out.println("Enter Number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println("It is even Number!...");
        }
        else {
            System.out.println("It is odd number!...");
        }
    }
}
