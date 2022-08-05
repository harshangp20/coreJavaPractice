package com.example;

class A{
    public int a;
    public int hp( ){
        return 4;
    }
    public  void meth2(){
        System.out.println("I am method 2 of A class");
    }
}
class B extends A{
    @Override
    public  void meth2(){
        System.out.println("I am method 2 of B class");
    }
    public void meth3(){
        System.out.println("I am method 3 of B class");
    }
}
public class Inheritance_overriding {
    public static void main(String[] args) {
        A a =new A();
        a.meth2();

        B b= new B();
        b.meth2();
    }
}
