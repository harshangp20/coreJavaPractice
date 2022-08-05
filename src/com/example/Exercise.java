package com.example;

public class Exercise {
    public static void main(String[] args) {
        String i = "Harshang C. Prajapati";
        String i2 = "Manthan B. Chauhan";
//        System.out.println(i.compareTo(i2));
        System.out.println(i.contentEquals("Harshang c. Prajapati"));
        System.out.println(i.hashCode());
        System.out.println(i.indexOf("C"));
        System.out.println(i.lastIndexOf("r"));
        System.out.println(i.replace("H","S"));
        //System.out.println(sc.codePointCount(0,9));
    }
}