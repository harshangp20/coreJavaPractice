package com.example;

import java.util.ArrayDeque;

public class Demo_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ArrayDeque<Integer> ad2 = new ArrayDeque<>();
        ad2.add(32);
        ad2.add(48);
        ad2.add(78);
//        ad2.add(29);
//        ad2.add(191);
//        ad2.addFirst(11);
//        ad2.addLast(59);

        ad.add(23);
        ad.add(88);
        ad.add(37);
       // ad.add(46);

        System.out.println(ad.peekFirst());
//        ad.removeFirst();
//        ad2.removeLast();
        //ad2.pollFirst();
        System.out.println(ad2);
        //System.out.println(ad);
    }
}
