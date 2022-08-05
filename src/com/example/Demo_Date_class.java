package com.example;

import java.util.Date;

public class Demo_Date_class {
    public static void main(String[] args) {
//        Date d = new java.sql.Date(122,1,15);
        Date d = new Date();
        System.out.println(d);
        System.out.println("Prints Mili second till 1970:- " + d.getTime());
        System.out.println(d.getSeconds());
        System.out.println(d.getMinutes());
        System.out.println(d.getHours());
        System.out.println(d.getDay());
        System.out.println(d.getDate());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
    }
}
