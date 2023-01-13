package com.syntax.review2;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        // we need scanner to get input from the user
        // scanner a non-primitive datatype
        // input is just a variable name could be anything

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=input.nextInt();// to capture int value
        System.out.println("Are you tired");
        boolean tired=input.nextBoolean();// to capture boolean
        System.out.println("What is your name");
        String name=input.next(); // to capture String until space

    }
}
