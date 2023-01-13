package com.syntax.review3;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {

        /* ask user to enter a browser and then based on the browser on the---> execute codes */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your favorite browser:");
        String Browser=scan.nextLine();

        switch (Browser.toLowerCase()){

            case "chrome":
                System.out.println("Test case executed in "+Browser);
                break;
            case "safari":
                System.out.println("Test case executed in "+Browser);
                break;
            case "microsoft edge":
                System.out.println("Test case executed in "+Browser);
                break;
            default:{
                System.out.println("Test Case is unknown");
            }
        }


    }
}
