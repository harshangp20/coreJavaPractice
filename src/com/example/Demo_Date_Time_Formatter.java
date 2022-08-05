package com.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo_Date_Time_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E -- H:m a");
        String date = dt.format(dtf);
        System.out.println(date);
    }
}
