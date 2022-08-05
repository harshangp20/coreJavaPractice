package com.example;

interface MyCamera {
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
interface MyWifi {
    String[] getNetwork();
    void connectNetwork(String network);
}
class MyCellPhone {
    void calling(long myphonenumber) {
        System.out.println("Calling a Number... " + myphonenumber);
    }
    void pickcall() {
        System.out.println("Connecting.....");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera,MyWifi {
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
public class Interface_Practice {
    public static void main(String[] args) {
     //MyCellPhone nokia = new MyCellPhone();
     //nokia.calling(8128187748L);
     //nokia.pickcall();
     MySmartPhone xiomi = new MySmartPhone();
     //xiomi.takingSnap();
     //xiomi.recordingVideo();
     //String[] sc = xiomi.getNetwork();
     //for (String item:sc) {
     //    System.out.println(item);
     //}
     //xiomi.calling(8128187748L);
     xiomi.recording4KVideo();
    }
}
