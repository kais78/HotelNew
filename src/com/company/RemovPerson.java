package com.company;

import java.io.Serializable;

public class RemovPerson implements Serializable {
    public String name1;
    public String phone1;
    public int roomChoice1;
    public int numberOfNights1;




    public RemovPerson(String name1, String phone1, int roomChoice1,int numberOfNights1) {
        this.name1 = name1;
        this.phone1 = phone1;
        this.roomChoice1 = roomChoice1;
        this.numberOfNights1=numberOfNights1;

    }

    public RemovPerson() {

    }
}
