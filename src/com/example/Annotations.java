package com.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@interface MetaAnnotation{
    String name();
    int order();
}
interface a{
    void meth1();
}
class b{

}
 class c extends b{

}
public class Annotations {
    public static void main(String[] args) {

    }
}
