package com.example;

public class Exe_of_Initialization_Block {
    public void meth(){
        System.out.println("This is method");
    }
    {
        System.out.println("This is instance Block!.....");
    }

    public void Exe_of_Initialization_Block() {
        System.out.println("I am constructor");
    }
    static {
        System.out.println("I am static");
    }


    public static void main(String[] args) {
//        System.out.println("Hello World!...");
        Exe_of_Initialization_Block e = new Exe_of_Initialization_Block();
        e.Exe_of_Initialization_Block();
        e.meth();
    }
}
