package com.syntax.review7;

public class Overloading {// we can overload method with different access modifiers

    private void hello(){
        System.out.println("hello");
    }
    private void hello(String name){
        System.out.println("Hello "+name);

    }
    static void bye(){
        System.out.println("Bye");
    }
    static void bye(String name){
        System.out.println("Bye "+name);
    }
}
