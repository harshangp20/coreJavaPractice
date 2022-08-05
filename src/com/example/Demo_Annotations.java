package com.example;

@FunctionalInterface
interface function{
    void meth();
    //void meth2();
}
class Phone extends MySmartPhone{
    @Override
    public void recording4KVideo() {
        //System.out.println("Recording 8K video");
    }
    @Deprecated
    public int sum(int x,int y){
        int z;
        return z=x+y;
    }
}
public class Demo_Annotations {
    @SuppressWarnings( "Deprication" )
    public static void main(String[] args) {
//        System.out.println("This is Main method");
        Phone p = new Phone();
        p.recording4KVideo();
        p.sum(5,6);
        System.out.println(p);
    }
}
