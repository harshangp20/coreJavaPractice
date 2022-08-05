package com.example;

import java.util.Random;
import java.util.Scanner;

class game{
    public int RD,no_ofguesses=0,guess;
    public game(){
        Random rd = new Random();
        RD = rd.nextInt(100);
    }

    public void user_input(int num){
        guess = num;
    }

    public boolean correct(){
        if (RD>guess) {
            System.out.println("You have enter the smaller Number");
            no_ofguesses += 1;
            return false;
        }
        else if (RD<guess){
            System.out.println("You have enter the bigger Number");
            no_ofguesses +=1;
            return false;
        }
        else{
            System.out.println("You have enter the correct Number");
            no_ofguesses +=1;

            System.out.println("Number of currect gueeses are:"+no_ofguesses);
            return true;
        }
    }
}
public class Exe_3_oop_edition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        game gm = new game();
        System.out.println("Guess the Number:");
        gm.user_input(sc.nextInt());
        while (!gm.correct()){
            System.out.println("Guess a Number:");
            gm.user_input(sc.nextInt());
        }
    }
}
