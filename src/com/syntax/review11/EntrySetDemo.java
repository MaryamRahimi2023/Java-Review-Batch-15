package com.syntax.review11;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo {

    public static void main(String[] args) {

        Map<String,Double> fruitMap= new HashMap<>();
        fruitMap.put("Apple",12.5);
        fruitMap.put("Banana",4.9);
        fruitMap.put("Pear",5.6);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",15.5);
        fruitMap.put("Dragon Fruit",10.6);

        // print only those elements which the letter a or e in their name and their price is more than 8 dollars

        var entrySet=fruitMap.entrySet();
        for (Map.Entry<String, Double> entry : entrySet) {
            String key=entry.getKey();
            if((key.contains("a") || key.contains("e")) && entry.getValue()>8){
                System.out.println(entry);
            }

        }


    }
}
