package com.syntax.review3;

public class SwitchDemo {
    public static void main(String[] args) {

        // World cup and provide winners

        int worldcup=2022;

        switch (worldcup){

            default:// is can be anywhere first middle or end but good practice to put at the end and when it is at the end the break is optional
                System.out.println("Winner is unknown");
                break;

            case 2022:
                System.out.println("Winner is Argentina");
                break;
            case 2018:
                System.out.println("Winner is France");
                break;
            case 2014:
                System.out.println("Winner is Germany");
                break;
        }


    }
}
