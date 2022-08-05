package com.example;

import java.util.Scanner;

class Invalid_Input extends  Exception {
    @Override
    public  String toString() {
        return "You have entered Invalid input";
    }
}
class Max_Value extends  Exception{
    @Override
    public  String toString(){
        return "You can`t enter the value which greater then 100K  !..";
    }
}
class Max_Multiprier extends Exception {
   @Override
   public  String toString(){
        return "You can`t Multiplie the value which grater then 7K!..";
    }
}



public class Exercise_Custom_Calc {
    public static void operator_check(String opr) throws Invalid_Input {
        if (opr.equals("+") || opr.equals("-") || opr.equals("*") || opr.equals("/")) {
            return;
        }
        throw new Invalid_Input();
    }
    public static double addition(int x, int y) throws Max_Value {
        int add;
        if (x > 100000 || y > 100000) {
            throw new Max_Value();
        }
        System.out.println("The Addition of the  X: " + x +" &" +" Y: " + y + "Is ");
        add = x + y;
        System.out.println(add);
        return add;
    }
    public static double subtracuiton(int x, int y) throws Max_Value {
        int sub;
        if (x > 100000 || y > 100000) {
            throw new Max_Value();
        }
        System.out.println("The Subtraction of the  X: " + x +" &" +" Y: " + y + "is: ");
        sub = x - y;
        System.out.println(sub);
        return sub;
    }
    public static double multiplication(int x, int y) throws Max_Multiprier {
        int mul;
        if (x > 7000 || y > 7000) {
            throw new Max_Multiprier();
        }
        System.out.println("The Multiplication of the  X: " + x +" &" +" Y: " + y + "is: ");
        mul = x * y;
        System.out.println(mul);
        return mul;
    }
    public static double division(int x, int y) throws ArithmeticException{
        int div;
        if (x > 100000 || y > 100000) {
            throw new ArithmeticException();
        }
            System.out.println("The Division of the  X:" + x + " &" + " Y:" + y + " is:");
            div = x / y;
            System.out.println(div);
            return div;
    }
    public static void main(String[] args){
        System.out.println("Hello And Welcome to the Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Symbol Like:- `+` `-` `*` `/` Are Allowed!");
        String str = sc.next();
        try{
            if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
                operator_check(str);
            }
            else {
                return;
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Enter the value of X:");
        int x = sc.nextInt();
        System.out.println("Enter the value of Y:");
        int y = sc.nextInt();
        if (str.equals("+")){
            try {
                System.out.println(addition(x,y));
            }
            catch (Max_Value e){
                System.out.println(e);
            }
        }
        if (str.equals("-")){
            try {
                System.out.println(subtracuiton(x,y));
            }
            catch (Max_Value e){
                System.out.println(e);
            }
        }
        if (str.equals("*")){
            try {
                System.out.println(multiplication(x,y));
            }
            catch (Max_Multiprier e){
                System.out.println(e);
            }
        }
        if (str.equals("/")){
            try {
                System.out.println(division(x,y));
            }
            catch (ArithmeticException e){
                System.out.println(e);
            }
        }
    }
}