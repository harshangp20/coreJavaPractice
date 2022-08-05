package com.example;

public class method {
     int logic(int x,int y){
        int z;

        if (x>y){
            z=x+y;
        }
        else{
            z = (x+y)*5;
        }

        return z;
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;

        method sum = new method();
        c = sum.logic(a,b);
        System.out.println(c);

        int a1 = 15;
        int b1 = 12;
        int c1;

        c1 = sum.logic(a1,b1);
        System.out.println(c1);
    }
}
