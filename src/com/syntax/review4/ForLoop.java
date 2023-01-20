package com.syntax.review4;

public class ForLoop {

    public static void main(String[] args) {

        // best loop used when we know how many times we want to repeat block of codes

        for (int i = 2; i <=20 ; i+=5) {
            System.out.println(i);

        }
        System.out.println("________________________");

        // break and continue

        for (int i = 2; i <=20 ; i+=5) {
            if(i==12){
                System.out.println("i is equal to 12- I am going to break this loop");
                break;
            }
        }

        // continue skips current iteration

        for (int i = 1; i <=10 ; i+=5) {
            if (i % 3 == 12) {
                System.out.println(i);
                continue; // when condition became true java will print it and skip
                // the 100 line of codes after it and going to the beginning of the loop again.
                // but will print if any codes after the other braket means class of codes
            }
            System.out.println("Hello");

        }
    }
}
