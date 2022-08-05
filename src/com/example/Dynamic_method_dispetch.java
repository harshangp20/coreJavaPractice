package com.example;
class phone{
    public void time(){
        System.out.println("Showing time........");
    }
    public void on(){
        System.out.println("Phon is turning on......");
    }
}
class smartphone extends phone{
    public void Music(){
        System.out.println("Playing Music........");
    }

    @Override
    public void on() {
        System.out.println("Smartphone is turning on......");
    }
}
public class Dynamic_method_dispetch {
    public static void main(String[] args) {
        phone xiomi = new smartphone();
        xiomi.on();
        ((smartphone) xiomi).Music();
        phone Nokia = new phone();
        Nokia.on();
        Nokia.time();
    }
}
