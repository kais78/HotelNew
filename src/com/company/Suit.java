package com.company;

public class Suit extends Room {

    public Suit() {
        roomPrice = 200F;
        info = " suit ";
        roomAdvantages = new roomOptions[] {
                roomOptions.TV,
                roomOptions.Internet,
                roomOptions.Bathroom,
                roomOptions.Jacuzzi,
                roomOptions.Breakfast,
                roomOptions.KingSizeBed,
                roomOptions.Minibar,
                roomOptions.Computer,
                roomOptions.Aircondition
        };//hämtar från enumet roomOptions

    }

    @Override
    public void showInfo() {
        System.out.println("check-in time:8:00, chck-out time:5:00");
    }
}
