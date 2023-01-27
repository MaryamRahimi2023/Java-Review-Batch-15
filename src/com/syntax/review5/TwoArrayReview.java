package com.syntax.review5;

public class TwoArrayReview {

    public static void main(String[] args) {
//                       col1.col2.col3
        int[][] array =  {{1, 2, 3},//0 row
                         {11, 12, 13},//1 row
                         {20, 21, 22},//2 row
                         {100, 101} //3 row
        };

        //getting all values from 2D array
        for (int[] arr : array) {// iterates over arrays
            for (int num : arr) {// iterate over each element
                if (num % 2 == 0) {
                    System.out.print(num + ",");
                }
            }
            System.out.println();
        }

        // getting all values from 2D array using regular for loop

        for (int row = 0; row < array.length; row++) {// outer loop iterates over rows here is 4 row with size 3 arrays
            // coz it starts from zero so we cant print array 4 we can only put until array[3]
            for (int col = 0; col < array[row].length; col++) {// iterates over each column
                // array[row] means array[3] so means number of all arrays we have here from array0-array3

                // I want to print values only from odd rows
                if (row % 2 != 0) {
                    System.out.print(array[row][col] + ",");
                }
            }
            System.out.println();
        }

        System.out.println(" ----------------------------------  ");
        int numberOfArrays=array.length;
        System.out.println(numberOfArrays);

        int numberOfElementsIn1Array=array[0].length;
        System.out.println(numberOfElementsIn1Array);

        int numberOfElemetsIn4Array=array[3].length;
        System.out.println(numberOfElemetsIn4Array);

        //access 2 1
        System.out.println(array[2][1]); //2 1

    }
}
