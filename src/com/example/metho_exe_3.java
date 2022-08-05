package com.example;

public class metho_exe_3 {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    static int factorial_alternative(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i=1;i<=n;i++){
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int x=6;
        System.out.println("The factorial of given number"+factorial(x));
        System.out.println("The factorial of given number"+factorial_alternative(x));

    }
}
