package com.example;

import java.util.Random;
import java.util.Scanner;

public class exe_2 {
    public static void main(String[] args) {

        String person_plays;
        String comp_plays = "";

        int computer_Int;
        int comp_Point = 0;
        int person_Point = 0;

        Scanner sc = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Let play Rock,Paper,Scissor! Type your move r=Rock,p=Paper,s=Scissor");

        computer_Int = generator.nextInt(3) + 1;

        if (computer_Int == 1) {
            comp_plays = "R";
        } else if (computer_Int == 2) {
            comp_plays = "P";
        }

        if (computer_Int == 3) {
            comp_plays = "S";
        }

        int i = 1;
        while (i <= 3) {
            System.out.println("Enter Your play:");
            person_plays = sc.next();
            person_plays = person_plays.toUpperCase();

            System.out.println("Computer play is:" + comp_plays);

            if (comp_plays.equalsIgnoreCase(person_plays)) {
                System.out.println("It was tie!.....\n");
            } else if (comp_plays.equalsIgnoreCase("R") && (person_plays.equalsIgnoreCase("P"))) {
                System.out.println("paper covers Rock, You Win!......");
                person_Point += 1;
            } else if (comp_plays.equalsIgnoreCase("R") && (person_plays.equalsIgnoreCase("S"))) {
                System.out.println("Rock curses scissor, You Lose!.......");
                comp_Point += 1;
            } else if (comp_plays.equalsIgnoreCase("P") && (person_plays.equalsIgnoreCase("S"))) {
                System.out.println("Scissor cuts paper, You Win!.....");
                person_Point += 1;
            } else if (comp_plays.equalsIgnoreCase("P") && (person_plays.equalsIgnoreCase("R"))) {
                System.out.println("Paper covers Rock, You Lose!....");
                comp_Point += 1;
            } else if (comp_plays.equalsIgnoreCase("S") && (person_plays.equalsIgnoreCase("R"))) {
                System.out.println("Rock curses scissor, You Lose!.....");
                comp_Point += 1;
            } else if (comp_plays.equalsIgnoreCase("S") && (person_plays.equalsIgnoreCase("P"))) {
                System.out.println("Scissor cuts paper, You Win!.....");
                person_Point += 1;
            }
            i++;
        }
        System.out.println("\n");
        if (comp_Point == person_Point) {
            System.out.println();
            System.out.println("it is tie between computer and person!.......");
        } else if (comp_Point > person_Point) {
            System.out.println();
            System.out.println("Computer win this Game!.....");
        } else {
            System.out.println();
            System.out.println("Person win this Game!.....");
        }
    }
}