package com.example;

//interface DemoAno {
//    void meth1();
//    void meth2();
//}
//@FunctionalInterface
interface HelpTo{
    void helper1();
    void helper2();
}
//class AnonyDemo implements DemoAno{
//    public void display(){
//        System.out.println("Hello");
//    }
//    @Override
//    public void meth1() {
//        System.out.println("I a meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth2");
//    }
//}
public class Demo_Anonymous {
    public static void main(String[] args) {
//        AnonyDemo ad = new AnonyDemo();
//        ad.meth1();
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am Also method1 !..");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am Also method 2 !..");
//            }
//        };
//        obj.meth1();
        HelpTo ht = new HelpTo() {
            @Override
            public void helper1() {
                System.out.println("I am helper 1");
            }
            @Override
            public void helper2() {
                System.out.println("I am helper 2");
            }
        };
        ht.helper1();
//        HelpTo ht2 =(x)->{
//            System.out.println("I am method from Lambda "+x);
//        };
//        ht2.helper1(121);
    }
}