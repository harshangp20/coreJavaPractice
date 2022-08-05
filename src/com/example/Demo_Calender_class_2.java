package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Demo_Calender_class_2 {
    public static void main(String[] args) {
        Calendar c2 = Calendar.getInstance();
        System.out.println(c2.getTime());
        System.out.println(c2.get(Calendar.DATE));
        System.out.println(c2.get(Calendar.HOUR));
        System.out.println(c2.get(Calendar.SECOND));
        System.out.println(c2.get(Calendar.HOUR_OF_DAY) + ":" + c2.get(Calendar.MINUTE) + ":" + c2.get(Calendar.HOUR) + ":" + c2.get(Calendar.SECOND));
        GregorianCalendar gg = new GregorianCalendar();
        System.out.println(gg.isLeapYear(2019));
    }
}