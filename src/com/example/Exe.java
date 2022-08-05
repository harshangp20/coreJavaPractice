package com.example;

import java.util.Scanner;

public class Exe {
    public static void main(String[] args) {
        String hd=" Harshang";
        String hp="Harshang Prajapati";
        System.out.println(hp.charAt(10));
//        System.out.println(hd.compareTo(hp));
//        System.out.println(hp.endsWith("ti"));
//        System.out.println(hp.length());
        String result = hp.concat(hd);
        System.out.println(result);
        if(hp.equals(hd)){
            System.out.println("Both Strings are Same!");
        }
        else{
            System.out.println("Both Strings are different!");
        }
        String str= hd.substring(1,9);
        System.out.println(str);
    }
}
