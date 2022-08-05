package com.example;
class Employee1{
    int id1;
    String name1;
    int salary1;
public void printline1(){
    System.out.println("My id is "+id1);
    System.out.println("My Name is "+name1);
        }
public int getsalary1(){
    return salary1;
}
    }
public class exe_of_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 harshang = new Employee1();
        Employee1 samarth = new Employee1();

        harshang.id1=121;
        harshang.name1="Harshang";
        harshang.salary1=36;

        harshang.printline1();

        int salary1= harshang.getsalary1();
        System.out.println("my salary is " + salary1 );

        samarth.id1=221;
        samarth.name1="Samarth";
        samarth.salary1=25;

        samarth.printline1();
        int salary2 =samarth.getsalary1();
        System.out.println("My salary is "+salary2);

    }
}