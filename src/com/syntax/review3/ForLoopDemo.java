package com.syntax.review3;

public class ForLoopDemo {
    public static void main(String[] args) {

        for (int i = 10; i >5 ; i--) {
            System.out.print(i+" ");
        }
        for (int c = 5; c <=1 ; c--) {
            System.out.print("happy");
        }

        System.out.println("***************");

        for (int j =1 ; j <=10 ; j++) {
            System.out.println("9 * "+j+" = "+(9 * j));

        }
        for (int h = 1; h <=6 ; h++) {
            if(h%2==0){
                System.out.println("Even number "+h);
            }

        }
    }
}
