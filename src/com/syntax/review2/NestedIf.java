package com.syntax.review2;

public class NestedIf {

    public static void main(String[] args) {
        /*
         nested if is 1 is statement inside another if statement when we have 1 condition that depends on another
         */

        boolean vaccine=true;
        int dose=0;

        if(vaccine){// outer if
            System.out.println(" How many doses you have?");
            // inner if always depend on outer if
            if(dose==1){
                System.out.println(" you need a  2nd dose");
            }else {
                System.out.println(" you are fully vaccinated");}

        }else {
            System.out.println(" I do not have vaccine");}

    }
}

