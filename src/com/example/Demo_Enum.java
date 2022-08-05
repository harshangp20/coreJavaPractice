package com.example;


enum Color{
    RED("red"), BLUE("blue"), PINK("pink") ;

    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
public class Demo_Enum {
    public static void main(String[] args) {
        Color c1 = Color.BLUE;

        System.out.println("Blue Enum name:"+c1.name());
        System.out.println("Blue Enum value:"+ c1.getValue());

        for (Color color:Color.values()){
            System.out.println("Enum value:"+ color.name());
        }
    }
}
