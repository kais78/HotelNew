package com.company;


public abstract class Room {
    protected Float roomPrice;
   // public String TaybeRomm;

    protected String info;
    public abstract void showInfo();

    enum roomOptions {
        TV,
        Aircondition,
        Internet,
        Bathroom,
        TwoBeds,
        Breakfast,
        Minibar,
        Computer,
        Jacuzzi,
        SharedBathroom,
        KingSizeBed

    }

    public roomOptions[] roomAdvantages;




    public void printRoomAdvantages() {
        System.out.println("     advantages" + info + "\n");
        for (roomOptions i : roomAdvantages) {
            System.out.println(i);
        }
        System.out.println("Price :" + roomPrice + "$" + " for the day");
    }
}
