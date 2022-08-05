package com.example;

class Base1{
    public Base1(){
        System.out.println("I am constructor");
    }
    public Base1(int x){
        System.out.println("I am an overloaded constructor with the value of x: "+x);
    }
}
class  Derived1 extends Base1{
    public Derived1() {
        //super(5);
        System.out.println("I am derived class constructor");
    }
    public Derived1(int x , int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived with the value of y: "+y);
    }
}
class childofderived extends  Derived1{
    public childofderived(){
        System.out.println("I am child constructor");
    }
    public childofderived(int x,int y,int z){
        super(x,y);
        System.out.println("I am an overloaded childofderived constructor of  with the  value of z: "+z);
    }
}
public class Inheritance_exe {
    public static void main(String[] args) {

        //Base1 b1 = new Base1();
        //Derived1 d1 = new Derived1();
        //Derived1 d1 = new Derived1();
        childofderived e1 = new childofderived(13,24,35);
    }
}
