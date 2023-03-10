package com.syntax.review9;

public class PrivateCustomer {

    private String name;
    private long ssn;

    public PrivateCustomer(String name, long ssn) {
        if(name!=null && !name.isEmpty()){// add some verification,
            this.name=name;
        this.name = name;}

        if(ssn!=0){
            this.ssn=ssn;
        }

    }

    public String getName(){
        return name;
    }
    public long getSsn(){
        return ssn;
    }
}
