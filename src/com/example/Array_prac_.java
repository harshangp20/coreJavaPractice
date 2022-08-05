package com.example;
public class Array_prac_ {
    public static void main(String[] args) {
        /*int [] marks = new int[5];
        marks[0] = 100;
        marks[1] = 48;
        marks[2] = 88;
        marks[3] = 57;
        marks[4] = 28;

        System.out.println(marks[4]);*/

        int [] marks ={100,30,40,50,60};

        //for (int i =0 ;i<marks.length ;i++){
        //System.out.println(marks[i]);
        //}
        System.out.println("Normal for loop--->");
        for(int i =marks.length - 1; i>=0;i--){
            System.out.println(marks[i]);
        }

        System.out.println("For each loop");
        for (int element:marks) {

            System.out.println(element);
        }
    }
}
