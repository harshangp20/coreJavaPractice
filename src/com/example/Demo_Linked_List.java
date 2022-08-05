package com.example;

import java.util.LinkedList;

public class Demo_Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer>   l2= new LinkedList<>();

        l2.add(5);
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(11);
        l2.add(9);
        l2.add(52);
        l2.add(11);
        l2.addLast(6);
        l2.addFirst(727);
        for(int i=0;i<l2.size();i++) {
            System.out.print(l2.get(i));
            System.out.print(",");
        }
    }
}
