package com.syntax.review9;

public class Customer { // encapsulation means binding the variables with the methods that other class can not have access on
    // them as they are private variables, but we can act upon them through the getter and setter methods after creating the obj of this class
    // to protect out data
    private String name;
    private long ssn;

    public void setName(String name){// we can also use constructor as well to initialize the instance variables instead
        // of our setters and just need two getter
        if(name!=null && !name.isEmpty()){// add some verification
            this.name=name;
        }
    }

    public String getName(){
        return name;
    }
    public void setSsn(long ssn){
        if(ssn!=0){
            this.ssn=ssn;
        }
    }
    public long getSsn(){// make methods public to access it and perform certain actions as defined on the private variables
        return ssn;
    }
}
