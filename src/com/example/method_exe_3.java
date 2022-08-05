package com.example;

public class method_exe_3 {
    static int sum (int ...arr){
        int sun=0;
        int avg =0;
        for (int element:arr) {
            sun += element;
        }
        return  sun;
        //return avg;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to varargs tutorial");
        //System.out.println("The Sum of nothing is "+ sum());
        System.out.println("number`s avg is :"+ sum(30,30,30));
        //System.out.println("The Sum of 4 and 5 is "+ sum(4,5));
        //System.out.println("The Sum of 3, 4 and 5 is "+ sum(3,4,5));
        //System.out.println("The Sum of 2,3,4 and 5 is "+ sum(2,3,4,5));
        //System.out.println("The Sum of 1,2,3,4 and 5 is "+ sum(1,2,3,4,5));
    }
}
