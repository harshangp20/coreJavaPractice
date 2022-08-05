package com.example;

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    public void write(){
        System.out.println("Writing");
    }
    public void refill(){
        System.out.println("Refill");
    }
    public void changeNib(){
        System.out.println("change the nib");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("Monkey is eating...");
    }

    @Override
    public void sleep(){
        System.out.println("Mponkey is Sleeping.....");
    }

    public void jump(){
        System.out.println("Jump");
    }
    public void bite(){
        System.out.println("Bite");
    }
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}
abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelePhone extends TelePhone{
    public void ring(){
        System.out.println("Call is Ringing.....");
    }
    public void lift(){
        System.out.println("Call is Lifting...");
    }
    public void disconnect(){
        System.out.println("Call is Disconnecting....");
    }
    public void hold(){
        System.out.println("call is On Hold....");
    }
}
interface TvRemote{
    void controlvolume();
    void changechannel();
}
interface SmartTvRemote extends TvRemote{
    void changechannelwithyourvoice();
    void controlvolumewithyourvoice();
}
class Tv implements SmartTvRemote{
    @Override
    public void controlvolume() {
        System.out.println("Volume is controlled by Remote!...");
    }
    @Override
    public void changechannel() {
        System.out.println("Channel is changed by Remote!...");
    }
    @Override
    public void controlvolumewithyourvoice() {
        System.out.println("Volume is controlled by Your Voice!...");
    }
    @Override
    public void changechannelwithyourvoice() {
        System.out.println("Channel is Changed by Your Voice!...");
    }
}
public class practice_set_Abstract_classes_And_Interface {
    public static void main(String[] args) {
        //Problem 1
        //FountainPen p = new FountainPen();
        //p.changeNib();
        //p.refill();
        //p.write();

        //Problem 2 And 3
        //Human h = new Human();
        //h.eat();
        //h.sleep();

        //Problem 4
        //TelePhone t = new SmartTelePhone();
        //t.lift();
        //t.disconnect();
        //t.ring();
        //SmartTelePhone st = new SmartTelePhone();
        //st.hold();

        //Problem 5
        //Monkey mc = new Monkey();
        //mc.jump();
        //mc.eat();
        //mc.sleep();
        //Human hn = new Human();
        //hn.jump();

        //Problem 6 And 7

        Tv t = new Tv();
        t.changechannelwithyourvoice();
    }
}
