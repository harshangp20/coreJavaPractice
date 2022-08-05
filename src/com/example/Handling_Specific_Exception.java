package com.example;

import java.util.Scanner;

public class Handling_Specific_Exception {
    public static void main(String[] args) {
        int [] a = new int[3];
        a[0] = 25;
        a[1] = 6;
        a[2] = 23;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Index No.");
        int ind = sc.nextInt();

        System.out.println("Enter The Number you want to divide the value with ");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index entered is: "+ a[ind]);
            System.out.println("The value at array-value/number is: "+ a[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println(" ArithmeticException Error occured!...");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Error occured!...");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some Other Error occured!...");
            System.out.println(e);
        }
    }
}
