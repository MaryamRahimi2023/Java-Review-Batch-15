package com.syntax.review3;

public class LogicalOperator {
    public static void main(String[] args) {

        // user should be able to enter username and password and log in button displayed and clickable

        boolean Displayed=true;
        boolean Clickable=true;

        if(Displayed && Clickable){
        System.out.println("Test case passed");
        }else{
            System.out.println("Test case failed");
        }

        boolean Displayed1=true;
        boolean Clickable1=false;

        if(Displayed1 && Clickable1){// in logical AND if one condition is false then the 2nd iteration will print
            System.out.println("Test case passed");
        }else{
            System.out.println("Test case failed");}

        // after login dashboard will be displayed or welcome message is there

        boolean dashboard=true;
        String message="Welcome admin";

        if( dashboard || message.equals("Welcome admin")){
            System.out.println("User is successfully logged in");
        }else {
            System.out.println(" User is not logged in");
        }

        boolean dashboard1=false;
        String message1="Welcome admin";

        if( dashboard1 || message1.equals("Welcome admin")){// in logical OR if only one condition is true the system will print the first message
            System.out.println("User is successfully logged in");
        }else {
            System.out.println(" User is not logged in");
        }

        boolean dashboard2=false;
        String message2="Hello";

        if( dashboard2 || message2.equals("Welcome admin")){// in logical OR if both condition are false the system will print the 2nd iteration
            System.out.println("User is successfully logged in");
        }else {
            System.out.println("User is not logged in");
        }

        // ! reverse the conditions
        // If the checkbox is not selected should be selected before submitting

        boolean box=true;// already the checkbox is selected by default so here the box check is true
        System.out.println(!true);// if the checkbox ,is not checked so means not true then will click on it and submit button will be unavailable

        boolean agreeCheckBoxSelected=true;// check box is checked
        if(!agreeCheckBoxSelected){
            System.out.println("I am clicking on checkbox");}
        System.out.println("I am clicking on submit button");

        boolean agreeCheckBoxSelected1=false;

        if (!agreeCheckBoxSelected1){
            System.out.println("I am clicking on checkbox");
        }
        System.out.println("I am clicking on submit button");
}

}
