package com.example;
interface MyCamera1 {
    void takingSnap();
    void recordingVideo();
    static void greet(){
        System.out.println("Good Morning......");
    }
    default void recording4KVideo(){
        greet();
        System.out.println("Recording The 4K Videos....");
    }
}
interface MyWifi1 {
    String[] getNetwork();
    void connectNetwork(String network);
}
class MyCellPhone1 {
    void calling(long myphonenumber) {
        System.out.println("Calling a Number... " + myphonenumber);
    }
    void pickcall() {
        System.out.println("Connecting.....");
    }
}
class MySmartPhone1 extends MyCellPhone1 implements MyCamera1,MyWifi1 {
    @Override
    public void takingSnap(){
        System.out.println("Capturing the Photos....");
    }
    @Override
    public void recordingVideo(){
        System.out.println("Recording the videos...");
    }

    //@Override
    //public  void recording4KVideo(){
    //    System.out.println("Capturing the snaps and Recording The 4K Videos....");
    //}
    @Override
    public String[] getNetwork() {
        String[] networkList={"Harshang","Samarth","Jay"};
        return networkList;
    }

    @Override
    public void connectNetwork(String network) {
        System.out.println("Coneecting To the Network..."+network);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        MyCamera1 cam = new MySmartPhone1();
        cam.recording4KVideo();
    }
}
