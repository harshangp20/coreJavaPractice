package com.example;

public class Rectangle {
    private int Height;
    private int Breadth;

    public Rectangle(int height, int breadth) {
        Height = height;
        Breadth = breadth;
    }

    public Rectangle() {
        Height = 4;
        Breadth = 5;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getBreadth() {
        return Breadth;
    }

    public void setBreadth(int breadth) {
        Breadth = breadth;
    }
}
