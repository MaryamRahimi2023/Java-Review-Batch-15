package com.syntax.review2;

public class IfStatement {

    public static void main(String[] args) {

        // if statement is a conditional statement.
        // if is a key word and have a specific meaning
        // if(boolean condition){block of codes}
        // relational operators ==, <, <=, >, >=, !=
        // == relational operator and = assign operator

        int day=1;

        if(day==1){
            System.out.println(" it is the first day of the month");}

        day=2;

        if(day==1){ // if (day=1) is wrong because inside the if condition always should be a boolean value true or false
            // not int or other data types
            System.out.println(" it is the first day of the month");}

        String month="December";
        if (month.equals("December"));{
            System.out.println(" It is holidays time");}

        boolean evening=true;
        if(evening==true){
            System.out.println("I have class");}
        //boolean evening=true;
        if(evening){// if datatype is already boolean you do not need to write == because it means evening==evening so
            // we can directly write the variable
            System.out.println("I have class");}


    }
}

