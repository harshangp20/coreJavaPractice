package com.example;

class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double SurfaceArea(){
        return ((2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius))  ;
    }
    public double Volume(){
        return  Math.PI * radius * radius * height ;
    }

    /*public class Rectangle{
        private int Height;
        private int Breadth;

        public int getHeight() {
            return Height;
        }
        
        public int getBreadth() {
            return Breadth;
        }
        
        public Rectangle(){
            Height =4;
            Breadth =5;
        }
        
        public Rectangle(int height, int breadth) {
            Height = height;
            Breadth = breadth;
        }

    }*/
}

    class Sphre{
    private int radius;

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }
        public double surfacearea(){
            return  4 * Math.PI * radius * radius ;
        }
        public double volume(){
            return ((4) * Math.PI *( radius * radius *radius)) / 3 ;
        }

    }
public class Exe_Access_modifiers_constructor {
    public static void main(String[] args) {

        //cylinder Mycylinder = new cylinder();
        //Mycylinder.setRadius(9);
        //System.out.println(Mycylinder.getRadius());
        //Mycylinder.setHeight(12);
        //System.out.println(Mycylinder.getHeight());

       /* //Problem 1
        cylinder Mycylinder = new cylinder();

        Mycylinder.setHeight(5);
        System.out.println(Mycylinder.getHeight());
        Mycylinder.setRadius(7);
        System.out.println(Mycylinder.getRadius());
        //Problem 2

        System.out.println("Surface area of cylinder:"+Mycylinder.SurfaceArea());
        System.out.println("Volume of cylinder"+Mycylinder.Volume()); */

        //Problem 4

/*        Rectangle rc = new Rectangle();
        System.out.println(rc.getHeight());
        System.out.println(rc.getBreadth());


        //Problem 5

        Sphre sp = new Sphre();
        sp.setRadius(4);
        System.out.println(sp.getRadius());

        System.out.println("Surface area: "+sp.surfacearea());
        System.out.println("Volume: "+sp.volume());
 */
    }
}
