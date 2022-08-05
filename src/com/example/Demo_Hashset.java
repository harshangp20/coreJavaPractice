package com.example;

import java.util.HashSet;

public class Demo_Hashset {
    public static void main(String[] args) {
        HashSet <Integer> mhs = new HashSet<>(8,10.f);
        mhs.add(89);
        mhs.add(29);
        mhs.add(78);
        mhs.add(31);
        mhs.add(79);
        mhs.add(79);
        mhs.add(99);
        mhs.add(49);
        mhs.add(39);
        System.out.println(mhs);
    }
}
