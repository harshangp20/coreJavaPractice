package com.example;

import java.lang.Object;
public class Demo_Object {
    public static void main(String[] args) {
        Object obj = new Object();
        Object ab = new Object();
        System.out.println(obj.hashCode());
        String abc = ab.toString();
        System.out.println(abc);
//        obj.notify();
    }
}
