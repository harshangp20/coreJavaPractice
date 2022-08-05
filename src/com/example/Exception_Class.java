package com.example;

import java.util.Scanner;

class MyExcepion extends Exception{
    @Override
    public String toString() {
        return "I am tostring";
    }
    @Override
    public String getMessage(){
        return "I am to getmessage";
    }
}
public class Exception_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = sc.nextInt();
        if (a<99){
            try {
                    throw new MyExcepion();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                    System.out.println(e.toString());
                    e.printStackTrace();
                    System.out.println("finished");
                }
            }
        System.out.println("Yes finished");
        }
    }
