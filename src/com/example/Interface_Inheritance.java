package com.example;

interface sampleInterface{
    void math1();
    void math2();
}
interface childInterface extends sampleInterface{
    void math3();
    void math4();
}
class MySampleClass implements childInterface{
    @Override
    public void math1() {
        System.out.println("Meth1....");
    }
    public void math2() {
        System.out.println("Meth2....");
    }
    public void math3() {
        System.out.println("Meth3....");
    }
    public void math4() {
        System.out.println("Meth4....");
    }
}
public class Interface_Inheritance {
    public static void main(String[] args) {
        MySampleClass cs = new MySampleClass();
        cs.math1();
        cs.math2();
        cs.math3();
        cs.math4();
    }
}
