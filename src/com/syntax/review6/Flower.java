package com.syntax.review6;

public class Flower {

    // attributes, properties

    String color, name;
    int price;
    static boolean pretty;// static variable can be called by class name

    // behaviour

    void smell(){
        System.out.println(name+" smells good");// method is a block of codes to perform a particular task
        // and when we need them we can call them
    }
    void  bloom(){
        System.out.println(name+" flower bloom");
    }
    void grow(){
        System.out.println(name+" flower grows");
    }
}
