package com.example;

class MyThr2 extends  Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<3000){
            System.out.println ("Thank You!...Class MyThr2......");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyThr3 extends  Thread{
    @Override
    public void run(){
        //int i = 0;
        while (true) {
            System.out.println("My Thank You!...Class MyThr3....");
        }
    }
}
public class thread_Method {
    public static void main(String[] args) {
        MyThr2 hp = new MyThr2();
        MyThr3 hp2 = new MyThr3();
        hp.start();
        try {
            hp.join();
        }catch (Exception e){
            System.out.println(e);
        }
        hp2.start();
    }
}
