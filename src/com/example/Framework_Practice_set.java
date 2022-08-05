package com.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Framework_Practice_set {
    public static void main(String[] args) {
        //Practice 1

//        ArrayList st = new ArrayList<>();
//        st.add("Harshang");
//        st.add("Samarth");
//        st.add("Manthan");
//        st.add("Jay");
//        st.add("Jatin");
//        st.add("Dhruv");
//        st.add("Krishn");
//        st.add("Rujul");
//        st.add("Raj");
//        st.add("Vishal");
//
//        for (Object o : st) {
//            System.out.println(o);
//        }

        //Practice 2

        Date d = new Date();
        System.out.println(d.getHours()+ ":" + d.getMinutes() + ":" + d.getSeconds());

        //Practise 3

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        //Practise 4

        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:m:s");
        String date = dt.format(dtf);
        System.out.println(date);

        //Practice 5

        HashSet<Integer> i = new HashSet<>();
        i.add(89);
        i.add(27);
        i.add(79);
        i.add(42);
        i.add(92);
        i.add(62);
        System.out.println(i);
    }
}