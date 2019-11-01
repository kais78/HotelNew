package com.company;

import java.util.ArrayList;

public class MainInpot {


    public static int getretinpot(){

        String inpot;
        do {

            inpot = Main.myScan.nextLine();

            try {
                Integer.parseInt(inpot);
                return Integer.parseInt(inpot);
            } catch (Exception e) {
                System.out.println("Sorry Enter a number typ");
            }

        }while (true) ;

    }

    public void employiss(){
        ArrayList<String>emeployissTem = new ArrayList<>();

        emeployissTem.add("M.same");
        emeployissTem.add("D.alksame");
        emeployissTem.add("S.kald");
        emeployissTem.add("K.alaa");
        emeployissTem.add("R.rame");
        emeployissTem.add("Q.lolo");
        System.out.println(emeployissTem.toString());

    }
}
