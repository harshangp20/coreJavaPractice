package com.example;
class MyEmployee {
    private int emp_id;
    private String emp_name;

    public String getName(){
        return emp_name;
    }
    public void setName(String n){
        emp_name =n;
    }
    public int getId(){
        return emp_id;
    }
    public void setId(int a){
        emp_id = a;
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee harshang = new MyEmployee();
        harshang.setName("Harshang Prajapati");
        System.out.println(harshang.getName());
        harshang.setId(7121);
        System.out.println("My collage Enrollment No is:"+harshang.getId());
    }
}
