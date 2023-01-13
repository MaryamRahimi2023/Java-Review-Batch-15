package com.syntax.review3;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int i=1;

        while (i<=4){
            System.out.println("Hello");
            i++;
        }
        // let's ask the user if she is tired as long as user is noy tired we will say lets study java
        Scanner scan=new Scanner(System.in);
        System.out.println("Are you tired");
        boolean tired=scan.nextBoolean();

        while (!tired){
            System.out.println("This is great");
            System.out.println("let's study Java");
            System.out.println("Are you tired");
            tired=scan.nextBoolean();

        }

    }
}
