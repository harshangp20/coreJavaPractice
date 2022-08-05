package com.example;

import java.util.ArrayList;
import java.util.Scanner;

class MyGeneric<T1,T2>{
    int value=344;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int value, T1 t1,T2 t2) {
        this.value = value;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
public class Demo_Generics {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        ArrayList arrayList = new ArrayList<>();
//        arrayList.add("String");
//        arrayList.add(54);
//        arrayList.add(643);
        //arrayList.add(new Scanner(System.in));

        //int a = (int)arrayList.get(0);
        //System.out.println(a);
        MyGeneric<String, Integer> g1=new MyGeneric<>(344,"My String",45);
        String string = g1.getT1();
//        int i1 = g1.getT2();
        int i1= g1.getValue();
        System.out.println(string +" "+ i1);
    }
}
