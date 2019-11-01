package com.company;

import java.awt.desktop.PrintFilesEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

public static Scanner myScan =new Scanner(System.in);

    public static void main(String[] args) {




        MainMeny mainMeny = new MainMeny();
        mainMeny.printHeader();

        int mainMenuChoice = 0;
        while (mainMenuChoice != 7) {
            mainMeny.printMenu();
            mainMenuChoice = mainMeny.getFirstChoice();//get från return-svaret från funktionen getFirstChoice
        }
        mainMeny.save();
    }

}
