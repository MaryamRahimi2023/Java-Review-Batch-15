package com.syntax.review7;

public class Methods {

    void hello(){
        System.out.println("Hello");


    }
    void sayHello(String name){
        System.out.println("Hello "+name);
    }
// create a method that returns the largest number between given 2 integer value

    int findLargest(int num1, int num2){
        if(num1>num2){
            return num1;
        }else {
            return num2;
        }
    }

    // create a methods that returns an average value of 2decimal numbers

    private double findAverage(double num1,double num2){
        return (num1+num2/2);
    }
    // create a method that returns a reverse String from given String

    protected String reverseString(String str){

        String reverse=new StringBuilder(str).reverse().toString();

        return reverse;

        //OR

        /*StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();// to print as string if we remove string then we can call like below*/

    }

    // create a method that will return a min value from given array

   public static int minFromArray(int [] array){// two modifiers access modifier and non access modifier
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<i){
                min=array[i];
            }
        }return min;
    }
    public static void main(String[] args) {

        String name="Mohammad";
        int characters=name.length();// by int method that we are calling now we can save the return int value print or reuse it
        System.out.println(characters);

        Methods obj=new Methods();
        obj.sayHello("Mohammad");// void method only print but not returning something to can store and reuse it

        System.out.println("______________________________");

        int largest=obj.findLargest(100,200);// by int method that we are calling now and have a return we can save the return int value print or reuse it
        System.out.println("The largest number is "+largest);

        System.out.println(obj.findAverage(10,30));// by int method that we are calling now from the above we can save the return int value print or reuse it
        double average= obj.findAverage(10,30);
        System.out.println(average);


        System.out.println(obj.reverseString("Java"));

        /*StringBuilder reverse=obj.reverse("Hello");
        System.out.println(reverse);*/

        String myString="Batch 15";
        boolean empty=myString.toUpperCase().isEmpty();// false the return so return is a boolean
        char character=myString.trim().charAt(2); //t the return is a char, so we should save it in a char type variable box
        System.out.println(character);


        int [] array={10,49,89,60};// inside the methods usually we have no sout or print just the logic to be common
        Methods.minFromArray(array);
        int minimum=minFromArray(array);// statistic methods we can call just by calling their name inside the same class and by name of class generally
        System.out.println("Min number ="+minimum);


    }
}
