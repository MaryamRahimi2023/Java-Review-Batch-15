package com.syntax.review11;

import java.util.HashMap;
import java.util.Map;
public class EntrySetDemo1 {

    public static void main(String[] args) {

        Map<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 12.5);
        fruitMap.put("Banana", 4.9);
        fruitMap.put("Pear", 5.6);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 15.5);
        fruitMap.put("Dragon Fruit", 10.6);
        fruitMap.forEach((key,value)->System.out.println(key+" "+value));// a simple way to go through each map element

        // Remove only those elements which the letter a or e in their name and their price is more than 8 dollars

        // we can not use enhanced loop or normal for loop coz of indexing problem during the run time if we want to remove

        /*Set<Map.Entry<String,Double>> entries=fruitMap.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            String key= entry.getKey();
            if((key.contains("a") || key.contains("e")) && entry.getValue()>8);
        } */

        // instead we use lambda and removeif method

        fruitMap.entrySet().removeIf((entry->(entry.getKey().contains("a")||entry.getKey().contains("e"))&&entry.getValue()>8));
        System.out.println(fruitMap);
    }
}
