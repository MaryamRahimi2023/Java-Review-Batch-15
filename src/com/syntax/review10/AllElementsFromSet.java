package com.syntax.review10;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AllElementsFromSet {
    public static void main(String[] args) {

        Set<String> qaJobs=new LinkedHashSet<>();
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("Api Tester");
        qaJobs.add("Database Tester");
        System.out.println(qaJobs);

        // how to get all values from set

        // 1- enhanced for loop

        for (String qa:qaJobs){
            System.out.println(qa);
        }
        System.out.println("*********************");
        // 2- Iterator interface has 3 methods hasNext(), next(), remove()

        Iterator<String> qa= qaJobs.iterator();
        while (qa.hasNext()){
            String qa1= qa.next();
            System.out.println(qa1);
        }



    }
}
