package com.example;
import java.util.Scanner;

public class condition_op_tuto_2
    {
        public static void main(String[] args) {
            int age;
            System.out.print("Enter Your age:");
            Scanner sc = new Scanner(System.in);
            age = sc.nextInt();

            if (age > 56)
            {
                System.out.println("You are experienced=");
            }

            else if (age > 46) {
                System.out.println("You are semi-experienced");
            }

            else if (age > 36) {
                System.out.println("You are semi-- experienced");
            }


            else
            {
                System.out.println("You are not Experienced");
            }

        }
    }
