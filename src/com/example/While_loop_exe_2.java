package com.example;

public class While_loop_exe_2 {
    public static void main(String[] args) {

        /*int n=5;
        for (int i = 0;i<n;i++){
            System.out.println(i);
            System.out.println("Java is good language");
            if (i == 2){
                break;
            }
        }
        System.out.println("loop ends here");*/
        /*int i =0;
        do {
            System.out.println(i);
            System.out.println("Java is good language");
            if (i == 2){
                break;
            }
            i++;
        }while (i<5);
        System.out.println("loop ends here");*/


        /*int n=5;
        for (int i = 0;i<n;i++){
        if (i == 2){
            continue;
        }
            System.out.println(i);
            System.out.println("Java is good language");
        }*/

        int i =0;
        do {
            i++;
        if (i == 2){
        continue;
        }
            System.out.println(i);
            System.out.println("Java is good language");
        }while (i<50);
        System.out.println("loop ends here");
    }
}