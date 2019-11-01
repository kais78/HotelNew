package com.company;

import java.io.Serializable;
import java.util.Date;


public class Person implements Serializable {
    public String name;
    public String phone;
    public int roomChoice;
    public int numberOfNights;




    public Person(String name, String phone, int roomChoice,int numberOfNights) {
        this.name = name;
        this.phone = phone;
        this.roomChoice = roomChoice;
        this.numberOfNights=numberOfNights;

    }

}
