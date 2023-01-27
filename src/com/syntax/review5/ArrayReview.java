package com.syntax.review5;

public class ArrayReview {

    public static void main(String[] args) {

        int a=10;

        int [] arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;

        //System.out.println(arr[3]);
        // run time error due to out of bound means we only have until 2 it starts from zero, so it can not print arr 3
        System.out.println("Size of the array ="+arr.length);

        // to get all value from the array?
        //arr[0]; arr[1]; arr[2];    manually

        // here we can print all values by formula

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");// here I am accessing my arrays using indexes
        }

        System.out.println();

        String [] colors={"black", "white", "red", "purple", "blue"};
        // anytime we have arrays we can use enhanced for loop

        for (String arr1:colors) {// one disadvantage of this loop is just going one direction
            // not vise versa like going ------------> not this way <------------
            System.out.print(arr1+",");// here I am accessing my array by enhanced for loop
            // without indexes just storing in arr1 and print
        }
        System.out.println();

        System.out.println("________printing in reverse_________");

        for (int i = colors.length-1; i >=0 ; i--) {// we say -1 coz the elements of my array are 5
            // but the indexes are 4 so in case of vise versa printing we -1
            System.out.print(colors[i]+",");
        }




    }
}
