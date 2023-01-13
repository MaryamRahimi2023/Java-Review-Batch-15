package com.syntax.review2;

public class IfElseIf {

    public static void main(String[] args) {

        // when we have more conditions to test
        // if statement
        // if(boolean condition){ if block of code A
        // }else if(boolean condition){ else if block of code B
        //}else if(boolean condition){else if code block C}

        /*
         check homework
         if you completed more than 25-> great job
         if you completed more than >20 -> good job
         if you completed more than >10-> ok job
         if you completed more than >5-> not good job
         */

        int homework=30;
        if(homework>25){
            System.out.println("great job");}
        else if(homework>20){
            System.out.println("good job");}
        else if(homework>10){
            System.out.println("Ok job");}
        else if(homework>5){
            System.out.println("not good job");}

        int homework1=30;// we should put the codes logically in order not bottom to top
        if(homework>5){
            System.out.println("not good job");} // java is going down and checking one by one if conditions
        else if(homework>10){
            System.out.println("ok job");}
        else if(homework>20){
            System.out.println("good job");}
        else if(homework>30){
            System.out.println("great job");}
        System.out.println("___________________________________________________________________________________");
        // why I need more if else block to check more conditions
        String browser="chrome";
        if (browser.equals("chrome")){
            System.out.println("Test case executed on chrome browser");}
        else if(browser.equals("safari")){
            System.out.println("Test case executed on safari browser");}
        else if(browser.equals("firefox")){
            System.out.println("Test case executed on firefox browser");}
        else {// when non of the conditions are true, code comes to else block
            System.out.println("browser is not supported");}
    }
}

