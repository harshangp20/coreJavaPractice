package com.example;

import java.util.Scanner;

class circle1{
    int radius;

    public int getRadius() {
        return radius;
    }
    public  circle1(){
        System.out.println("I am circle`s Non Permiterized Constructor!....");
    }

    public circle1(int r) {
        System.out.println("I am circle`s Permiterized Constructor!....");
        this.radius = r;
    }
    public double area1(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends circle1{
    int height;

    public int getHeight() {
        return height;
    }

    public  Cylinder1(int r, int h){
        super (r);
        System.out.println("I am Cylinder`s peramiterized Constructor");
        this.height=h;
    }
    public double volume1(int h){
        return Math.PI*this.radius*this.radius*height;
    }
}

class Rectangle1{
    public int length;
    public int width;

    public Rectangle1(){
        System.out.println("This is Rrectangle`s Non-Perametrised constructor");
    }
    public Rectangle1(int length, int width)
        {
            System.out.println("This is Rectangle`s Perameterised Constructor");
            this.length = length;
            this.width = width;
        }
    public int getLength() {
            return length;
        }
    public void setLength(int length) {
            this.length = length;
        }

    public int getWidth() {
            return width;
        }

    public void setWidth(int width) {
            this.width = width;
        }
    public int area(int l,int w) {
        return (l * w);
    }
}

class Cuboid extends Rectangle1{
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cuboid() {
    }

    public Cuboid(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    public int volume(int length, int width, int height) {
        return length*width*height;
    }
}
public class Inheritance_tutorial {
    public static void main(String[] args) {
        //Problem 1
        //circle1 c = new circle1(12);
        //Cylinder1 C = new Cylinder1(34,2);

        //Problem 2
        /* Cuboid C1 = new Cuboid();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Cuboid: ");
        int length =sc.nextInt();
        System.out.println("Enter the Width of Cuboid: ");
        int width =sc.nextInt();
        System.out.println("Enter the height of Cuboid: ");
        int height =sc.nextInt();

        System.out.println(C1.volume(sc.nextInt(), sc.nextInt(), sc.nextInt())); */

        Rectangle1 R1 = new Rectangle1();
        Scanner RC = new Scanner(System.in);
        System.out.println("Enter The length of Rectangle: ");
        int length = RC.nextInt();
        System.out.println("length = " + length);
        System.out.println("Enter The Width of Rectangle: ");
        int width = RC.nextInt();
        System.out.println("width = " + width);
        int area = R1.area(length, width);
        System.out.println("Area: " + area);
    }
}
