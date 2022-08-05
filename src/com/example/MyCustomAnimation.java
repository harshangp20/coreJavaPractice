package com.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//
//@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.METHOD)
@interface MyCustomAnimation {
    public class Myclass {

        @MyCustomAnimation()
        public void sayHello() {
            System.out.println("My custom annotation");
        }

        public static void main(String[] args) throws Exception {

        }
    }
}