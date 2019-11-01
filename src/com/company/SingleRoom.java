package com.company;
public class SingleRoom extends Room {

    public SingleRoom() {
        roomPrice = 100F;
        info = " single room ";
        roomAdvantages = new roomOptions[]{

                roomOptions.TV,
                roomOptions.Internet,
                roomOptions.Aircondition,
                roomOptions.SharedBathroom


        };
    }
    @Override
    public void showInfo() {
        System.out.println("check-in time:8:00, chck-out time:3:00");

    }


}
