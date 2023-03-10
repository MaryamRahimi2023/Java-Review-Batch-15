package com.syntax.review8;

import com.syntax.review7.Car;
import com.syntax.review7.Tesla;

public class CarTest {

    public static void main(String[] args) {

      Bmw bmw= new Bmw("BMW","X7");
       bmw.start();
       System.out.println(bmw.drive("smoothly"));

        Car car=new Car("SomeCar","SomeModel");

        car.start();
        car.drive(75);

         Tesla tesla=new Tesla("Tesla","S",2022,350,"electric",true);
         tesla.start();// override method from Tesla class is executed
         tesla.drive(75);// comes from parent class
         tesla.haveAutopilot();// comes from Tesla class

        // Runtime polymorphism archived through method overriding, in polymorphism we talk about methods or behaviours not the variables

        // casting is two type widening(Implicit) and narrowing (Explicit)-used with primitives
        // upcasting and down-casting - use with non primitives

        Car bmw1=new Bmw("BMW","X77");// upcasting
        bmw1.start();
        bmw1.drive(100);
        bmw1.drive("Miami",120);

        //Bmw car1=new Car("BMW","X77"); // down-casting not available by default unless we force or explicitly
        if(bmw1 instanceof Bmw){
        Bmw bmw2=(Bmw)bmw1;}//how to down-casting if we need, here we are creating the obj of bmw class inside bmw







    }
}
