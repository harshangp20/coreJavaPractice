package com.example;

import java.util.Scanner;

class Exceptionretry  extends Exception{
    @Override
    public String getMessage(){
        return "Error";
    }

}
public class Practise_Que_On_Errors_Exceptions {
    public static void throwexception(int i) throws Exceptionretry{
        if (i<=5){
            throw new Exceptionretry();
        }
    }
    public static void main(String[] args) {
        //Problem 1
        //Syntax error --> int a  = 10
//        int age= 30;
//        int year_born = 2000-30; //Logical error
//        System.out.println(6/0);

        //Problem 2

//        try {
//            int a = 666/0;
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("HeHe");
//        }
//        catch (ArithmeticException e){
//            System.out.println("HiHi");
//        }

        //Problem 3

        int[] a1 = new int[3];
        a1[0] = 4;
        a1[1] = 5;
        a1[2] = 6;

        int i = 0;
        int ind;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (flag && i<5){
            try {
                System.out.println("Enter the value of index: ");
                ind = sc.nextInt();
                System.out.println("the value of marks[index] is "+ a1[ind]);
            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        //Problem 4
        try {
            if (i>=5){
                throw new Exceptionretry();
            }
        }
        catch (Exceptionretry e){
            System.out.println(e.getMessage());
        }
    }
}
