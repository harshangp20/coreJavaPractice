package com.example;

import java.util.*;
public class Demo_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);

        l1.add(5);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(11);
        l1.add(9);
        l1.add(52);
        l1.add(11);
        l1.addAll(0,l2);
        //isEmpty returns is array empty or not
        //System.out.println(l1.isEmpty());
        //
        System.out.println(l1.hashCode());
//        System.out.println(l1.set(3,121));
//        System.out.println(l1.remove(4));
//        System.out.println(l1.contains(3));
//        System.out.println(l1.indexOf(52));
//        System.out.println(l1.lastIndexOf(11));
        //l1.clear();
        for(int i=0;i<l1.size();i++) {
            System.out.print(l1.get(i));
            System.out.print(",");
        }
    }
}