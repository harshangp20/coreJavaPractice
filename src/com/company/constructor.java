package com.company;

class Mymainemployee{
    private int emp_id;
    private int emp_salary;
    private String emp_name;

    //public Mymainemployee(){
    //    emp_id=45;
    //    emp_name="You--Name--Here";
    //}
    public Mymainemployee(String My_name,int My_id,int My_salary){
        emp_id=My_id;
        emp_name =My_name;
        emp_salary =My_salary;
    }
    public String getName(){return emp_name;}
    public void setName(String n){
        emp_name =n;
    }

    public int getEmp_salary() {return emp_salary;}
    public void setEmp_salary(int S){
        emp_salary = S;
    }
    public int getId(){return emp_id;}
    public void setId(int a){
        emp_id = a;
    }
}

public class constructor {
    public static void main(String[] args) {

        Mymainemployee harshang = new Mymainemployee("Jatin",7122,25000);

        //harshang.setName("Harshang");
        System.out.println(harshang.getName());
        //harshang.setId(7121);
        System.out.println(harshang.getId());
        System.out.println(harshang.getEmp_salary());
    }
}
