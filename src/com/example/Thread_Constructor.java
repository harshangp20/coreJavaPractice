package com.example;

class MyThr extends  Thread{
    public  MyThr(String name){
        super(name);
    }
    @Override
    public void run(){
        while (true) {
            System.out.println("I am Thread");
        }
    }
}
public class Thread_Constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Harhsang");
        MyThr t2 = new MyThr("Manthan");
        t1.start();
        t2.start();
        System.out.println("The id of the Thread  t1 is: "+ t1.getId());
        System.out.println("The Name of the Thread t1 is: "+ t1.getName());
        System.out.println("The id of the Thread t2is: "+ t2.getId());
        System.out.println("The id of the Thread t2 is: "+ t2.getName());
    }
}