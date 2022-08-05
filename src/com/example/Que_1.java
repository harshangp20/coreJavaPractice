package com.example;
interface Animal{
    void eating();
    void sleeping();
}
interface Wild_Animal {
    void roaring();
    void hunting();
}
class Tiger implements Animals, Wild_Animal {
    @Override
    public void eating() {
        System.out.println("Tiger is eating..");
    }

    @Override
    public void sleeping() {
        System.out.println("Tiger is sleeping...");
    }

    @Override
    public void hunting() {
        System.out.println("Tiger is Hunting hunt...");
    }

    @Override
    public void roaring() {
        System.out.println("Tiger is Roaring");
    }
}
public class Que_1 {
    public static void main(String[] args) {
        Tiger tiger_baby = new Tiger();
        tiger_baby.eating();
    }
}