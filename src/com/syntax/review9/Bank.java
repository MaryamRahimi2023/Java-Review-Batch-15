package com.syntax.review9;

public class Bank {
    public static void main(String[] args) {

        Customer c=new Customer();
       // c.name="Maryam"; no access to private variable and assign anything to it
        c.setName("Maryam");
        System.out.println("Name of the customer is "+c.getName());
        c.setSsn(78659548);
        System.out.println(c.getSsn());

        PrivateCustomer pC=new PrivateCustomer("Maryam",1234567);
        System.out.println("Private client name "+pC.getName());
        System.out.println("Private client ssn "+pC.getSsn());

    }
}
