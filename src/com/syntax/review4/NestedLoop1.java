package com.syntax.review4;

public class NestedLoop1 {
    public static void main(String[] args) {

        for (int i = 0; i <=3; i++) {// will execute 4 times only no inner loop
            System.out.println(i);
            for (int j = 0; j >=3 ; j++) {// condition false will not execute
                System.out.println(j);

            }

        }

        for (int i = 0; i <=3; i++) {// will execute 4 times only no inner loop

            for (int j = 0; j <=3 ; j++) {// condition is true will execute
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
