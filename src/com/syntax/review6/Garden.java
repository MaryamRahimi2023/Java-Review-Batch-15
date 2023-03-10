package com.syntax.review6;

public class Garden {

    public static void main(String[] args) {
        //static String str;// can not use static for local variable inside main method str is declared so it is a local variable
        // local variables are created inside a method, a block of codes, if condition or  etc
        Flower flower=new Flower();// another word for creating obj is instantiating the class obj it called instance too
        flower.color="red";
        flower.name="rose";
        flower.price=10;
        System.out.println(Flower.pretty);// if we change anything in one pretty will change all coz it is common with all flowers
        System.out.println(flower.pretty);// can be access this way to but not the right way usually calling by class name

        flower.smell();
        flower.bloom();
        flower.grow();

        Flower flower1=new Flower();
        //accessing variable of flower class
        flower1.color="pink";
        flower1.name="gulab";
        flower1.price=20;

        //accessing method of flower class
        flower1.smell();
        flower1.bloom();
        flower1.grow();
    }
}
