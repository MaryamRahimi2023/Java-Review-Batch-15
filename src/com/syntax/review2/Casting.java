package com.syntax.review2;

public class Casting {

    public static void main(String[] args) {

        /* Casting-convert 1 datatype into another
         1. widening/implicit/automatic-  smaller store in bigger box
         (byte->short->int->long->float->double)
         2. narrowing/explicit/manual   - bigger value store in smaller box
         (double->float->long->int->short->byte)
        */

        //widening
        double d=5;
        System.out.println(d);

        // narrowing mostly used with non-primitive values casting
        // int i=5.0; java will not take the responsibility to change bigger data to smaller coz of data loss
        // so if we want to do it manually we should write as follows:

        int i=(int)5.0;

        int num=128;
        byte b=(byte)num;
        System.out.println(b);

    }
}
