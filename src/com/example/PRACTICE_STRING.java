package com.example;


public class PRACTICE_STRING
    {
        static public void main(String[]args)
        {
            //problem 1
            String name="PRAJAPATI CHANDRAKANT BHAI";
            System.out.println(name.toLowerCase());

            //problem 2
            String sub = "DATABASE MANAGEMENT SYSTEM";
            System.out.println(sub.replace(' ','_'));

            //problem 3
            String fname = "Dear <|Name|>, Thanks a lot";
            fname = fname.replace("<|Name|>","Harshang");
            System.out.println(fname);

            //problem 4
            String new_string = "Hyyy there is  double and three spaces";
            System.out.println(new_string.indexOf("  "));
            System.out.println(new_string.indexOf("   "));

            //problem 5
            String comment ="Dear Harry,\n\tThis java course is Nice.\n\tThanks!";
            System.out.println(comment);


        }
    }
