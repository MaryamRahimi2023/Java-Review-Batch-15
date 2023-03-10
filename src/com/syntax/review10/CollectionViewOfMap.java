package com.syntax.review10;

import java.util.*;
import java.util.Set;

public class CollectionViewOfMap {
    public static void main(String[] args) {

        Map<String,Double> grocery =new LinkedHashMap<>();
        grocery.put("Milk",5.99);// entry object is Key+Value
        grocery.put("Eggs",6.50);
        grocery.put("Bread",2.99);
        grocery.put("Tea",4.99);
        grocery.put("Tomato",2.99);// same value is allowed in map but not same Key
        grocery.put("Cucumber",2.99);
        grocery.put("Cucumber",4.99);

        Set<String> keys=grocery.keySet();
        // from map, we will store our map in a uniques collection set so to use the collection interface methods

        for (String key : keys) {
            System.out.print(key+ "=" +grocery.get(key)+" ");
            // Milk=5.99 Eggs=6.5 Bread=2.99 Tea=4.99 Tomato=2.99 Cucumber=4.99
        }
        System.out.println("**************************");

        Iterator<String> iter=keys.iterator();
        while (iter.hasNext()){
            // how to print keys+value
            String key=iter.next();
            System.out.print(key+ "=="+grocery.get(key)+" ");// get(key) means get(Milk) and we know in map we have this method if we provide the ket it will give us the value
            // Milk==5.99 Eggs==6.5 Bread==2.99 Tea==4.99 Tomato==2.99 Cucumber==4.99

            // how to print only keys
            System.out.print(key+" ");
            // Milk Eggs Bread Tea Tomato Cucumber
        }

        System.out.println("************************");

        Collection<Double> values=grocery.values();

        for (Double value : values) {
            // how to print values
            System.out.print(value+" ");
            // 5.99 6.5 2.99 4.99 2.99 4.99

        }

    }
}
