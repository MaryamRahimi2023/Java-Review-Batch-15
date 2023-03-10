package com.syntax.review6;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Hello";// String class methods which are already defined in String class are defined method also and if we create a method is user defined method
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(1));
        String newString=str.concat(" friends");
        System.out.println(newString);
        System.out.println(str);

        // will print the first Hello coz String is a immutable object whenever we assain it to new method new object will create
        /* An immutable object is an object whose state cannot be modified after it is created. This means that once an instance of
        an immutable object is created, its properties cannot be changed.
        Instead, if a change is required, a new instance of the object must be created with the updated properties.
         */
        str=str.toLowerCase();
        System.out.println(str);

        // String Builder is a mutable object
        /* A mutable object is an object whose state can be modified after it is created.
        This means that once an instance of a mutable object is created, its properties can be changed.
        */

        //check if length of the String is more than 0

        boolean empty=str.isEmpty();
        System.out.println(empty);

        String str1="  Review B15   ";
        //remove any leading or trailing white spaces
        String newStr1=str1.trim();

        System.out.println(str1);
        System.out.println(newStr1);
    }
}
