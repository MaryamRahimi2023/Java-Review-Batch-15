package com.syntax.review2;

public class IfElse {

    public static void main(String[] args) {

        // if statement
        // if(boolean condition){ if block of code A}
        // }else{ s block of code B)

        int num = 12;
        if (num > 100) {
            System.out.println(num + " is greater than a 100");
        } else {
            System.out.println(num + " is less than 100");
        }

        String expectedButton = "Enrol today";
        if (expectedButton.equals("Enrol Today")) // Today is uppercase so if condition false
        {
            System.out.println("Test Case Passed");
        }else{
            System.out.println(" Test Case Failed");}

    }
}

