package com.example;

class C1{
    public int a=10;
    protected int b=20;
    int c=30;
    private int d=40;
    void math(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class AccessModifiers2 {
    public static void main(String[] args) {
        C1 c = new C1();
        //c.math();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        //System.out.println(c.d);
    }
}
