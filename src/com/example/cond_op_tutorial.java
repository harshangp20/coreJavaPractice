package com.example;

public class cond_op_tutorial
    {
        public static void main(String[] args)
        {
            boolean b = true;
            boolean a = true;

            System.out.println("For AND Operator");
            if (a && b)
            {
                System.out.println("Y");
            }
           else

            {
                System.out.println("N");
            }
            System.out.println("For OR operatoe");
            if (a || b)
            {
                System.out.println("Y");
            }
            else
            {
                System.out.println("N");
            }
            System.out.println("For NOT operator");
            if (a != b)
            {
                System.out.println("Y");
            }
            else
            {
                System.out.println("N");
            }
        }
}
