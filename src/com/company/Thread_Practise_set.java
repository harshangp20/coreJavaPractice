package com.company;

class Practise13 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println ("Good Morning!");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
class Practise13b extends Thread {
    @Override
    public void run() {
//        while (true) {
//            try{
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Welcome!");
//        }
    }
}
public class Thread_Practise_set {
    public static void main(String[] args) {
        Practise13 ha1 = new Practise13();
        Practise13b ha2 = new Practise13b();
//        ha1.setPriority(6);
//        ha2.setPriority(9);
        System.out.println(ha1.getPriority());
        System.out.println(ha2.getPriority());
        System.out.println(ha2.getState());
        //Problem 1 and 2
//        ha1.start();
          ha2.start();
        System.out.println(ha2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
