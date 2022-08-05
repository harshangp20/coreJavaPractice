package com.example;

import java.util.Scanner;

public class cond_exe_1 {
        public static void main(String[] args) {
            //exercise 1
            int a = 10;
            /*if (a = 11)
            {
                System.out.println("I am ||");
            }
            else
            {
                System.out.println("I am not ||");
            }*/

            //exercie 2
            /*byte maths,science,english;
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your Maths marks:");
            maths = sc.nextByte();

            System.out.print("Enter your English marks:");
            english = sc.nextByte();

            System.out.print("Enter your Science marks:");
            science = sc.nextByte();

            float avg = (maths + english + science)/3;
            float total = maths + english + science;
            System.out.println("Your total Marks are:"+total);
            float parcentage = total/3;
            System.out.println("Your percentages are:"+parcentage+"%");

            if (avg>=40 && maths>=33 && english>=33 && science>=3)
            {
                System.out.println("Congratulation,You have been promoted!");
            }

            else
            {
                System.out.println("Sorry,You have not promoted");
            }*/

            //Exercise 3
            /*float income;
            float tax = 0;

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your income per annual:");
            income = sc.nextFloat();

            if (income < 2.5){
                tax = tax + 0;
            }

            else if (income > 2.5f && income <5.5f){
                tax = tax + 0.05f * (income - 2.5f);
            }

            else if (income > 5.5f && income < 10.0f){
                tax = tax + 0.05f * (income - 2.5f);
                tax = tax + 0.02f * (income - 5.5f);
            }

            else if (income > 10.0f ){
                tax = tax + 0.05f * (income - 2.5f);
                tax = tax + 0.02f * (income - 5.5f);
                tax = tax + 0.03f * (income - 10.0f);
            }
            System.out.println("The total tax is paid by employee is:"+tax);*/

            // exercise 4

            /*Scanner sc = new Scanner(System.in);
            int day = sc.nextInt();

            switch (day)
            {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
            }*/

            //Exercise 5

            /*Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Year:");
            float year = sc.nextFloat();

            if (year % 4 == 0){
                System.out.println("Entered year is leap year");
            }
            else{
                System.out.println("Entered year is not leap year");
            }*/

            //Exercise 6

            Scanner sc;
            sc = new Scanner(System.in);
            String website = sc.next();

            if(website.endsWith(".com")) {
                System.out.println("This is Comercial Website");
            }

            else if(website.endsWith(".org")){
                    System.out.println("This is Organizatoinal Website");
            }

            else if(website.endsWith(".in")){
                    System.out.println("This is Indian Website");}
        }
    }
