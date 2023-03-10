package com.syntax.review8;

public class InsuranceTest {
    public static void main(String[] args) {


        // we can not create an abstract class object coz it is uncompleted
        // we can achieve it indirectly by creating the child class object and call the methods

        Insurance carPolicy = new CarPolicy("I969696", "John Smith", 75.89, 30);

        carPolicy.getInsurance();
        System.out.println(carPolicy.calculateCoverage());

        Insurance petPolicy = new PetPolicy("I969696", "John Smith", 7, 30);
        petPolicy.getInsurance();
        System.out.println(petPolicy.calculateCoverage());

        Insurance [] policies={new CarPolicy("I969696", "John Smith", 75.89, 30),
                new PetPolicy("I969696", "John Smith", 7, 30)};

        for (Insurance policy:policies) {
            policy.getInsurance();
            System.out.println(policy.calculateCoverage());

        }

    }

}
