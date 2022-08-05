package com.example;

interface Bicycle {
    public int a=7121;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface HornBicycle {
    public int a= 7121;
    void blowHornK3g();
    void blowHornmhn();
}
class AvonCycle implements Bicycle,HornBicycle {
    void blowHorn(){
        System.out.println("Horn is Blowing.....");
    }

    @Override
    public void applyBreak(int decrement) {
        System.out.println("Applying the Break....");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Speed is Increasing....");
    }

    @Override
    public void blowHornK3g() {
        System.out.println("K3g pi pi pi......");
    }

    @Override
    public void blowHornmhn() {
        System.out.println("Main hooo Naa pa pa ......");
    }
}
public class Interface {
    public static void main(String[] args) {
        AvonCycle b = new AvonCycle();
        //b.applyBreak(4);
        //b.blowHorn();
        //b.speedUp(5);
        //System.out.println(b);
        b.blowHornK3g();
        b.blowHornmhn();
    }
}
