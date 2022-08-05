package com.example;

public class Finally_Block {
    public static int greet(){
        try {
//            int a = 76;
//            int b = 0;
//            int c = a/b;
//            return c;
            int b =10, bc=0;
            for(int i =0; i<b ;i++){
                bc = b / i;
                System.out.println(bc);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is End of the function");
        }
        return 0;
    }
    public static void main(String[] args) {
        int mac = greet();
        System.out.println(mac);
    }
}
