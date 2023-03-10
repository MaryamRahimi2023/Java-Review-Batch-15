package com.syntax.review10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

        Map<String,Double> grocery =new HashMap<>();
        grocery.put("Milk",5.99);// entry object is Key+Value
        grocery.put("Eggs",6.50);
        grocery.put("Bread",2.99);
        grocery.put("Tea",4.99);
        grocery.put("Tomato",2.99);// same value is allowed in map but not same Key
        grocery.put("Cucumber",2.99);
        grocery.put("Cucumber",4.99);// will take one key but update the value to 4.99 if print
        grocery.put(null,null);

        double teaPrice=grocery.get("Tea");// will print the value of this key 4.99
        System.out.println(teaPrice);

        System.out.println(grocery);// {Tea=4.99, Tomato=2.99, Cucumber=4.99, Eggs=6.5, Milk=5.99, Bread=2.99}
        int size= grocery.size();
        System.out.println("Number of entry objects = "+size);// Number of entry objects = 6

        Map<String,Double> grocery1 =new LinkedHashMap<>();
        grocery1.putAll(grocery);

        System.out.println("Order is preserved "+grocery1);
        // Order is preserved {Tea=4.99, Tomato=2.99, Cucumber=4.99, Eggs=6.5, Milk=5.99, Bread=2.99}

        Map<String,Double> grocery2 =new TreeMap<>();
        grocery2.putAll(grocery);
        grocery2.putAll(grocery1);
        System.out.println("Size ="+grocery2.size());//Size =6
        System.out.println("Sorted order "+grocery2);
       // Sorted order {Bread=2.99, Cucumber=4.99, Eggs=6.5, Milk=5.99, Tea=4.99, Tomato=2.99}

        // if we put (null,null) then:
        //TreeMap uses a red-black tree data structure to maintain the keys in sorted order,
        // and null cannot be used as a key because it cannot be compared to other keys. so we will get runtime error
    }
}
