package com.syntax.review1;

public class WhatIf {

    public static void main(String[] args) {

        int a=10;
        int b=20;

        String c="Hello";
        String d="Java";

        System.out.println(a+b+c+d);
        System.out.println(a+c+d+b);
        System.out.println(c+d+a+b);// HelloJava+a(10) String+int+connecting and became a big String and
        // + acts like concatenate and connect b(20) to it.

        System.out.println(c+d+(a+b));// now we can add

        //Arithmetic Operations: +,-,*,/,%


    }
}
