package com.example;

class  Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String GetName() {
        return name;
    }

    public void SetName(String n) {
        name = n;
    }
}
class cellphone {
        public void calling(){
        System.out.println("Calling.....");
    }
        public void ringing(){
        System.out.println("Ringing.....");
    }
        public void messaging(){
        System.out.println("Messaging.....");
    }
}

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int parameter(){
        return 4*side;
    }
}

class rectangle{
        int l;
        int b;
        public int area() {
            return l*b;
        }
        public int parameter(){
            return 2*(l+b);
        }
}

class tommy{
    public void run(){
        System.out.println("A player is Running from the Enemy");
    }
    public void fire(){
        System.out.println("A Player is firing on the Enemy");
    }
    public void shoot(){
        System.out.println("A Player is shooting on the Enemy");
    }
}

class circle{
    float r;
    public float area(){
        return 3.14f*r*r;
    }
    public float circumference(){
        return 2*3.14f*r;
    }
}
public class Class_tutorial {
    public static void main(String[]args) {

        //Problem 1

        /*Employee harshang = new Employee();

        harshang.SetName("Harshang");
        harshang.salary = 233;

        System.out.println(harshang.GetName());
        System.out.println(harshang.getSalary());

        //Problem 2

        cellphone redmi = new cellphone();

        redmi.calling();
        redmi.messaging();
        redmi.ringing();

        //Problem 3

        square sq = new square();
        sq.side =3;
        System.out.println(sq.area());
        System.out.println(sq.parameter());

        //Problem 4

        rectangle rc = new rectangle();
        rc.l=5;
        rc.b=4;

        System.out.println(rc.area());
        System.out.println(rc.parameter());

        //Problem 5

        tommy player = new tommy();

        player.fire();
        player.run();
        player.shoot();         */

        //Problem 6

        circle radius = new circle();
        radius.r=5;

        System.out.println("The area of circle is : "+radius.area());
        System.out.println("The circumference of circle is: "+radius.circumference());
    }
}
