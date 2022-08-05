package com.example;

import  java.util.Scanner;
import java.util.Random;
public class Again_Exe_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0:Rock 1:Paper 2:scissor");
        int user_play = sc.nextInt();

        Random random = new Random();
        int comp_play = random.nextInt(3);

        if (user_play == comp_play){
            System.out.println("Draw");
        }
        else if (user_play == 0 && comp_play ==2 || user_play == 1 && comp_play == 0 || user_play ==2 && comp_play ==1){
            System.out.println("Person win this Game!.......");
        }
        else {
            System.out.println("Computer win this Game!.......");
        }

        if (comp_play == 0){
            System.out.println("Computer chooses Rock!.....");
        }
        else if (comp_play == 1){
            System.out.println("Computer chooses Paper!.....");
        }
        if (comp_play == 2){
            System.out.println("Computer chooses Scissor!.....");
        }
    }
}
