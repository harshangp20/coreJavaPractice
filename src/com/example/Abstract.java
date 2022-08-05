package com.example;

abstract class Parents1{
    public Parents1() {
        System.out.println("Main 1 Constructor huu");
    }
    public void sayHello() {
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child1 extends Parents1 {
    @Override
    public void greet() {
        System.out.println("Good Morning!.....");
    }
    @Override
    public void greet2() {
        System.out.println("Good Afternoon!....");
    }
}
class Child2 extends Child1 {
    public void greet3() {
        System.out.println("Hello");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Child2 c2 = new Child2();
         c2.greet2();
        }
    }
