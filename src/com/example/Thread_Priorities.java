package com.example;

class MyThr1 extends  Thread{
    public  MyThr1(String name){
        super(name);
    }
    @Override
    public void run(){
        while (true) {
            System.out.println("Thank You!..." + this.getName());
        }
    }
}
public class Thread_Priorities {
    public static void main(String[] args) {
        MyThr1 mt1 = new MyThr1("Harshang1");
        MyThr1 mt2 = new MyThr1("Harshang2");
        MyThr1 mt3 = new MyThr1("Harshang3");
        MyThr1 mt4 = new MyThr1("Harshang4");
        MyThr1 mt5 = new MyThr1("Harshang5 (Most Important)!...");

        mt5.setPriority(Thread.MAX_PRIORITY);
        mt1.setPriority(Thread.MIN_PRIORITY);
        mt2.setPriority(Thread.MIN_PRIORITY);
        mt3.setPriority(Thread.MIN_PRIORITY);
        mt4.setPriority(Thread.MIN_PRIORITY);

        mt5.start();
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
    }
}
