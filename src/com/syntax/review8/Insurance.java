package com.syntax.review8;

public abstract class Insurance {

    // can we have variable inside the class-Yes with no restriction with access modifiers

    public static String company="Geico";

    protected String policyNumber;
     String policyHolder;

     private String ssn; // they can not be accessed outside the class so no usage here


    // Can I have constructor inside abstract class -Yes to initialize my instance variables

    public Insurance(String policyNumber, String policyHolder) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
    }

    public void getInsurance(){
        System.out.println("we need to get insurance");// concrete or completed method with return

    }
    public abstract double calculateCoverage();// uncompleted method abstract which is not implemented yet
}
class CarPolicy extends Insurance{

    double premium;
    int age;
    CarPolicy(String policyNumber, String policyHolder,double premium,int age){
        super(policyNumber,policyHolder);
        this.premium=premium;
        this.age=age;
    }
    // to provide implementation we need to follow rules of overriding

    @Override
    public double calculateCoverage() {
        if (age < 20) {
            return premium * 2;
        } else if (age < 40) {
            return premium * 0.5;
        } else {
            return premium *0.2;
        }
    }
}
class PetPolicy extends Insurance{

    int numberOfPets;// class own features
    double premium;
    public PetPolicy(String policyNumber, String policyHolder,int numberOfPets,
    double premium) {
        super(policyNumber, policyHolder);
        this.numberOfPets=numberOfPets;
        this.premium=premium;
    }

    // implementation of the abstract method which was incomplete in parent class and now implemented and completed here
    @Override
    public double calculateCoverage() {
        if (numberOfPets>2){
            return premium*2;
        }else if (numberOfPets>5){
            return premium*3;
        }else {
            return premium*5;
        }

    }
}