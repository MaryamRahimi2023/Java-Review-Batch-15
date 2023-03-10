package com.syntax.review8;

public class Store {

    public static void main(String[] args) {

        // Run time polymorphism

        Furniture chair = new Chair();// Upcasting
        chair.assemble();// during the run time java will make decide as per the object class first so this is polymorphism
        // (check first the child class if there is a method for assemble will take that if not then go to the parent class)
        chair.comfort();

        Furniture table=new Table();
        table.comfort();// Run time polymorphism
        table.assemble();

       Table t =new Table();
       t.comfort();// calling methods of class by creating the obj
       t.assemble();

        t.buildTable();


       // compile polymorphism archived through method overloading due the methods signature

        t.buildTable("Wood");


        // for static method class name
        Chair.breaks();
        Furniture.breaks();

        Furniture chair1=new Chair();
        table.comfort();
        table.assemble();

        // proof that method breaks is not overriden

        chair1.breaks();// since the static method can not be ovrriden so, it will exacuted it from parent class
        // this is also not right way to call static method with obj name should be called by class name


    }


}
