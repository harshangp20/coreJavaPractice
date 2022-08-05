package com.example;

public class method_exe2 {
    static int change2(int[] arr) {
        arr[0] = 42;

        return 0;
    }
    static int change(int x){
        x=52;
        return x;
    }
     static void tellajoke(){
        System.out.println("Hey i found a new word"+"\n"+"plagarisum!!");
    }

    static void foo(){
        System.out.println("Hello bro Good morning");
    }

    static void foo(int x){
        System.out.println("Hello bro "+x+" Good morning");
    }

    static void foo(int x,int y){
        System.out.println("Hello bro "+x+" Good morning");
        System.out.println("Hello bro "+y+" Good morning");
    }

    static void foo(int x,int y,int z){
        System.out.println("Hello bro "+x+" Good morning");
        System.out.println("Hello bro "+y+" Good morning");
        System.out.println("Hello bro "+z+" Good morning");
    }
    public static void main(String[] args) {
        //tellajoke();

        //int a=98;
        //change(a);
        //System.out.println(a);

        //int [] marks ={91,95,59,78,89};
        //change2(marks);

        //ystem.out.println(marks[0]);
        foo();
        foo(35);
        foo(56,67);
        foo(78,45,88);
    }
}
