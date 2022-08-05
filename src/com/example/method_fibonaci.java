package com.example;

public class method_fibonaci {
    static int fibonaci(int count){
        int no1 = 0;
        int no2 = 1;
        int no3 ;

        System.out.println(no1 + "\n" + no2);
       // System.out.println(no1);
        //System.out.println(no2);
        for(int i=0;i<count;i++){
            no3 = no1 + no2;
            System.out.println(no3);
            no1 = no2;
            no2 = no3;
        }
        return count;
    }
    public static void main(String[] args) {
        int a =5;
        System.out.println("The fibonaci series are "+fibonaci(a));
    }
}
