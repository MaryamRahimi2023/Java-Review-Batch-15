package com.syntax.review8;

public class Furniture {

    public void assemble(){//overriden
        System.out.println("Furniture needs to be assembled");

    }
    public void comfort(){
        System.out.println("Furniture needs to be comfortable");
    }
    private void use(){
        System.out.println("used by humans");
    }
    public static void breaks(){
        System.out.println("it breaks");
    }
}
class Chair extends Furniture{
    public void comfort(){//overriding
        System.out.println(" Not every chair is comfortable");
    }
   // @Override
    private void use(){// we are not overriding method use coz private does not participate in incarcerate here just declare here as well for its own
        System.out.println("used by humans to set");
    }

   // @Override
    public static void breaks(){// we can not override static method
        System.out.println("Chair class break method");
    }
    protected void loveSeat(){
        System.out.println("This is the best chair");
    }
}
class Table extends Furniture{







    @Override
    public void comfort() {// access modifier must be the same or higher the parent class method in overriding
        System.out.println("Table cannot be comfortable");
    }
    protected void buildTable(){// the child class own behaviour
        System.out.println("We blala blabla");
    }
    void buildTable (String material){// this is overloading method
        System.out.println("we build table from "+material);
    }
}
