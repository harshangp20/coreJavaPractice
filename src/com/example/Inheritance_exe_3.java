package com.example;

class ekclass{
    int a;

    public int getA() {
        return a;
    }

    public ekclass(int a){
        this.a=a;
    }
    public int returnone(){
        return 1;
    }
}
class doclass extends ekclass{
    doclass(int c){
        super (c);
        System.out.println("I am  constructor ");
    }
}
public class Inheritance_exe_3 {
    public static void main(String[] args) {
        ekclass e = new ekclass(466);
        doclass f = new doclass(55);
        System.out.println(f.getA());
        System.out.println(e.getA());
    }
}