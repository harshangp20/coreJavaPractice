package com.example;

public class loop_exe_1 {
    public static void main(String[] args) {
         int n = 5;
            for (int i = 1; i<n;i++){
            for(int j =i;j<n;j++){
                System.out.print("  ");
           }
            for (int j =1;j<i;j++)    {
                System.out.print("* ");
            }
             for (int j =1;j<=i;j++) {

                 System.out.print("* ");
             }
                 System.out.println();
        }
            for (int i = 1; i<=n;i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print("  ");
                }
                for (int j = i; j < n; j++) {
                    System.out.print("* ");
                }
                for (int j = i; j <= n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

         //Exercise 2

       /* int n = 4;
        int sum=0;
        for (int i=0;i<n;i++){
            sum = sum +(2*i);
        }
        System.out.println("sum of 4 even numbers:"+sum);
     */

        //exercise 3

        /*int n = 5;
        for (int i=1; i<=10;i++){
            System.out.printf( "%d X %d = %d\n",n,i,n*i);
        }*/

        //Exercise 4
       /* int n = 10;
        for (int i=10; i>=1;i--) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        } */

        //Exercise 5

        /*
        int n = 5;
        int factorial = 1;
        for (int i=1;i<=n;i++)
        {
            factorial = factorial  * i;
            i++;
        }
        System.out.println("Factorial of given Numbers:"+factorial);     */

        //Exercise 6

        /*int i=1;
        int n =5;
        int factorial = 1;
        while (i<=n) {
            factorial *= i;
            i++;
        }

            System.out.println(factorial);
           */
        //Exercise 7

        /*int n = 8;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
           sum +=  n * i;
        }
        System.out.println(sum);*/
    }
    }