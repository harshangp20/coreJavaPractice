package com.example;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius can not be Negative";
    }
    @Override
    public String getMessage(){
        return "Radius can not be Negative";
    }
}
public class Exception_Using_Throws {
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result= Math.PI * r * r;
        return  result;
    }
    public static int divide(int a, int b ) throws ArithmeticException{
        int result;
        result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
//            int c = divide(6,3);
//            System.out.print("Answer is Ready:");
//            System.out.println(c);
            double ar = area(1);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println("Throws an Exception!");
        }
    }
}
