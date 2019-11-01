package com.company;

public class DoubleRoom extends Room {
    /**
     *This class contains the specifications of the room and this class extends from class Room
     */
    public DoubleRoom() {

        roomPrice = 150F;
        info = " double room ";
        roomAdvantages = new roomOptions[]{
                roomOptions.TV,
                roomOptions.Internet,
                roomOptions.TwoBeds,
                roomOptions.Bathroom,
                roomOptions.Aircondition,


        };
    }

    /**
     * *
     */
    @Override
    public void showInfo() {
        System.out.println("check-in time:8:00, chck-out time:3:00");
    }
}

