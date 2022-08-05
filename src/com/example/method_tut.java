package com.example;

public class method_tut {

    static void multiplication(int n) {
        System.out.println("The table for "+ n +" is:");
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d \n", n, i, n * i);
        }
    }

    static void pattern1(int n){
        for (int i =0;i<n;i++){
            for (int j =0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static int sumrec(int n){
        if (n==1){
            return 1;
        }
        return  n + sumrec(n-1);
    }

    static void pattern_rev(int n){
        for (int i =1;i<=n;i++){
            for (int j =i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static int fibonaci_recu(int n){
        /*if(n==1){
            return  0;
        }
        else if (n==2){
            return 1;
        }*/
        if(n==1 || n==2){
            return  n-1;
        }
        else {
            return fibonaci_recu(n-1) + fibonaci_recu(n-2);
        }
    }

    static int avg (int ...arr){
        int sum=0;
        int total = 0;
        for (int element:arr) {
            sum += element;
            total= sum/element;
        }
        return  total;
    }

    static void pattern_rec(int n){
        if (n>0){
            pattern_rec(n-1);

            for (int i = 0; i < n; i++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }

    static void pattern1_rec(int n){
        if (n>0){
            for (int i = 0 ; i < n; i++){
                System.out.print(" *");
            }
            System.out.println();
            pattern1_rec(n-1);
        }
    }

    static float farenhit_converter(float y){
        float f;
        f=((y*9/5)+32);
        System.out.println(f);
        return f;
    }

    public static void main(String[] args) {

        //Problem 1

        //multiplication(10);

        //Problem 2

        //pattern1(10);

        //problem 3

        //int n=5;
        //System.out.println(sumrec(n));

        //Problem 4

        //pattern_rev(5);

        //Problem 5

        //int number=7;
        //System.out.println(fibonaci_recu(number));

        //Problem 6

        //System.out.println("the avg of entered data is:"+avg(30,30,30));

        //Problem 7

        //pattern_rec(4);

        //Problem 8

       pattern1_rec(5);

        //Practise 9

        /*float x=5.0f;
        farenhit_converter(x);*/

    }
}