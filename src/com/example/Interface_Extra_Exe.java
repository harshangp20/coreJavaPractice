package com.example;

interface Animals {
    void eating();
    void sleeping();
}
class Dog implements Animals {
    @Override
    public void eating() {
        System.out.println("Dog is Having the food.......");
    }

    @Override
    public void sleeping() {
        System.out.println("Dog is sleeping......");
    }
}
public class Interface_Extra_Exe {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eating();
        dog.sleeping();
    }
}
