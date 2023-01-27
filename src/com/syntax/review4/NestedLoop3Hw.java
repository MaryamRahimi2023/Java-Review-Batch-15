package com.syntax.review4;

public class NestedLoop3Hw {
    public static void main(String[] args) {

        System.out.println("___________Digital clock_____");

        //Optional HW to practice nested loops:
        //create a digital clock
        //You code should print time starting 00:00 and ending 23:59.

        for (int h1 = 0; h1 <=2 ; h1++) {// this is for 1st digit of the hour like 1 o clock, so it goes from 0-2 like 0-2
            for (int h2 = 0; h2 <=9 ; h2++) {// this is for 2nd digit of hours like 0-9
                if (h1==2 && h2>3){//when 1st digit of hours equals to 2 and 2nd digit greater than 3 hours reached to break the loop coz we have until 23
                    break;
                }
                for (int m = 0; m <=59 ; m++) {
                    if(m<10){// if minutes smaller than 10 print a zero
                        System.out.println( h1+ ""+h2+":0"+m);
                    }else {
                        System.out.println(h1 + "" + h2 + ":" + m);// print the rest of hours
                    }
                }

            }

        }
    }
}
