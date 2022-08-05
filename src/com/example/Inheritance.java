package com.example;

class Base{
    public int x;

    public int getX() {
        return x;
    }
    public void  setX(int x) {
        this.x = x;
        System.out.println("I am in base and setting x now");
    }

    public void Base() {
        System.out.println("I am constructor");
    }
}
class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        //Setting data fronm Base class
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());

        //Setting data from derived class
        Derived d = new Derived();
        d.setX(4);
        System.out.println(d.getX());
    }
}
