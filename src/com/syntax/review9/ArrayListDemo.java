package com.syntax.review9;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList aList=new ArrayList<>();
        aList.add(12);
        aList.add(21);
        aList.add(9);
        aList.add(41);

        int size=aList.size();
        System.out.println(size);

        aList.set(0,120);

        int firstElement= (int) aList.get(0);
        System.out.println(firstElement);

        aList.remove(2);

        System.out.println("after remove "+aList);
    }
}
