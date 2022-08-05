package com.example;

public class Try_Catch_Block {
    public static void main(String[] args) {
        int a = 1000;
        int b = 2;
        int c ;
        try {
            c = a/b;
            System.out.println(c);
        }
        catch (Exception e1){
            System.out.println("Sorry I can`t found Answer The Reason is Here : ");
            System.out.println(e1);
        }
        System.out.println("The End of the Program!..... ");
    }
}
