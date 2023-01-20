package com.syntax.review4;

public class NestedLoop3Hw {
    public static void main(String[] args) {

        System.out.println("___________Digital clock_____");

        //Optional HW to practice nested loops:
        //create a digital clock
        //You code should print time starting 00:00 and ending 23:59.

        for (int i = 0; i <24; i++) {
            for (int j = 0; j <=59 ; j++) {

                System.out.print(i+j);
            }
            System.out.println();

        }

        
    }
}
