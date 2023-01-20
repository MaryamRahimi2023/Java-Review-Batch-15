package com.syntax.review4;

public class NestedLoop {
    public static void main(String[] args) {

        // nested loop , loop inside another loop
        // iner loop always depends on the outer loop
        //  controls number of complete iterations

        for (int i = 1; i <=3 ; i++) { // outer loop
            System.out.println(i+" ");
            System.out.print("Hello");

            System.out.println("________________________________");

            for (int j = 1; j <=4 ; j++) {// inner loops
                System.out.print(j+" ");
                System.out.println("Bye");

            }

        }

    }
}
