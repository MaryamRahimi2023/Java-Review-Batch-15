package com.syntax.review9;

public interface Drawable {// is collection of abstract methods

     public static final String TOOL="Pencil"; // in interface, we can only have public static final variables by default
    // and so it if final we should assignee vale to variables we can not have any other variable in interface
    // no constructor in interface as well but must be in inheritance

    void draw();// in interface all methods bt default are public abstract

    //above about interface was before java 8, and we could achieve 100% abstraction with it
    // after java 8 static and default methods were added to the Interface which improved achieving abstraction from 0-100%
    // java people add default to provide flexibility that other child classes do not affect it while changing a method,
    // and static we can call by its name in same class and by class name in different class
    default void print(){
        System.out.println("We are drawing object using +TOOL");

    }
    static void erase(){
        System.out.println("All drawing are erasable");

    }
}abstract class Shape{
   public String color; // inside in abstract class we can have any access modifier
   protected double width, length;

    public Shape(String color, double width, double length) {
        this.color = color;
        this.width = width;
        this.length = length;
    }
    public abstract double calculateArea();
}
class Rectangle extends Shape implements Drawable{
    public Rectangle(String color, double width, double length) {
        super(color, width, length);

    }
    public double calculateArea(){
        return length*width;
    }
    @Override
    public void draw() {
        System.out.println("I am drawing rectangle");
    }
}
class Square implements Drawable{
    @Override
    public void draw() {
        System.out.println("I am drawing Square");
    }
}
