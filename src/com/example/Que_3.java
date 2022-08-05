package com.example;

public class Que_3 {
    static int fibonaci_method(int count){
        int number1 = 0;
        int number2 = 1;
        int number3 ;

        System.out.println(number1 + "\n" + number2);
        for(int i=0;i<count;i++){
            number3 = number1 + number2;
            System.out.println(number3);
            number1 = number2;
            number2 = number3;
        }
        return count;
    }
    public static void main(String[] args) {
        int a =11;
        System.out.println("The fibonaci series are "+fibonaci_method(a));
    }
}
