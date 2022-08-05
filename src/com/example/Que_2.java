package com.example;

public class Que_2 {
    public static int factorial(int a){
        if (a==0){
            return 1;
        }
        return (a*factorial(a-1));
    }
    public static void main(String[] args) {
        int fac=1,num=4;
        fac=factorial(num);
        System.out.println("Factorial of given number: "+num+" is "+fac);
    }
}
