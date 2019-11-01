package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import static com.company.FileUtility.saveObject;




public class MainMeny {

    static ArrayList<Person> persons = new ArrayList<>();


    public MainMeny() {
        persons = (ArrayList<Person>) FileUtility.loadObject("person.ser");
       // removPersons = (ArrayList<Person>) FileUtility.loadObject("RemovePerson.ser");

        if (persons == null) {
            persons = new ArrayList<>();
        }

    }

    public void printHeader() {
        System.out.println("----------------------------------------");
        System.out.println("|             WELCOME TO                 |");
        System.out.println("|         ** Hotel Heavenly **           |");
        System.out.println("----------------------------------------");
    }

    public void printMenu() {
        System.out.println("Please make a selection:\n" +
                "1. Book a room\n" +
                "2. Remove my booking\n" +
                "3. Show my personal booking\n" +
                "4. For our employeers only: Show all bookings and customers\n" +
                "5. show employiss\n"+
                "6. Help\n" +
                "7. Exit");
    }




    public int getFirstChoice() {

        int userChoice = MainInpot.getretinpot();

        switch (userChoice) {
                case 1:
                    System.out.println("\n" +
                            "--------------------------------------------------------------------------------");
                    makeBooking();
                    return userChoice;//returnerar valet av aanvändaren, t.ex 6
                case 2:
                    System.out.println("\n" +
                            "--------------------------------------------------------------------------------");
                    System.out.println("please enter your name to remove your booking");

                    FileUtility.removeName(persons);//metoden körs i classen services eftersom persons finns endast här


                    return userChoice;//returnerar valet av aanvändaren, t.ex 6

                case 3:
                    System.out.println("\n" +
                            "--------------------------------------------------------------------------------");
                    findName();


                    return userChoice;//returnerar valet av aanvändaren, t.ex 6

                case 4:
                    System.out.println("\n" +
                            "--------------------------------------------------------------------------------");
                    System.out.println("Name of guest" + "             " + "phone number of guest" + "        " + "room type" + "        ");
                    for (Person person : persons) {

                        String roomtype = "";
                        if (person.roomChoice == 1) {
                            roomtype = "Singel room";
                        } else if (person.roomChoice == 2) {
                            roomtype = "doubel room";
                        } else if (person.roomChoice == 3) {
                            roomtype = "Suit";
                        }

                        System.out.println(person.name + "                       " + person.phone + "                     " + roomtype);
                    }


                    //Services.readAllLines();
                    System.out.println("\n" +
                            "--------------------------------------------------------------------------------");
                    return userChoice;//returnerar valet av aanvändaren, t.ex 6
                case 5:
                MainInpot employInpot=new MainInpot();
                employInpot.employiss();
                return userChoice;//returnerar valet av aanvändaren, t.ex 6

                case 6:
                    System.out.println("\n" +
                            "--------------------------------------------------------------------------------");
                    Help.help();

            }
            return userChoice;//returnerar valet av aanvändaren, t.ex 6

    }

    public Room getRoom(int roomChoice) {//test
        switch (roomChoice) {
            case 1:
                System.out.println("\n" +
                        "--------------------------------------------------------------------------------");
                return new SingleRoom();

            case 2:
                System.out.println("\n" +
                        "------------------------------------------------------------------1" +
                        "--------------");
                return new DoubleRoom();

            case 3:
                System.out.println("\n" +
                        "--------------------------------------------------------------------------------");
                return new Suit();

        }
        return null;
    }

     public void findName() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Write your name so we can find your booking in our system please! ");
        String name = myScan.nextLine();

        boolean itsNother=false;

        for (Person p : persons) {
            if (p.name.equals(name)) {

                itsNother=true;

                String roomType = "";

                if (p.roomChoice == 1) {
                    roomType = "single room";
                } else if (p.roomChoice == 2) {
                    roomType = "Double room";
                } else if (p.roomChoice == 3) {
                    roomType = "Suit";
                }

                System.out.println("Booking information\n" +
                        "Name: " + p.name + "\n" +
                        "Phone number: " + p.phone + "\n" +
                        "Roomtype: " + roomType + "\n" +
                        "Number of nights: " + p.numberOfNights + " nights");
                        System.out.println("\n" +
                        "--------------------------------------------------------------------------------");
            }

        }
        if(itsNother==false){

            System.out.println("THIS NAME IS NOT IN LIST");
            System.out.println("\n" +
                    "--------------------------------------------------------------------------------");
        }

     }

     private void makeBooking() {

        try {
            System.out.println("What kind of room do you wish to book,\n" +
                    "please make one of those coming selections:\n" +
                    "1. Single Room\n" +
                    "2. Double Room\n" +
                    "3. Suit");

            Scanner myScan = new Scanner(System.in);
            int roomChoice = myScan.nextInt();
            Room room = getRoom(roomChoice);//Ala Room är ngn sorts Room
            room.printRoomAdvantages();//körs för alla 3 casen
            myScan.nextLine();//rensar ente
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("if you want continue booking the room or change the room type ");
            System.out.println("1-Continue\n2-change type room\n3-Back to main menu");

       int y ;
       y=myScan.nextInt();
            switch (y) {
                case 1:
                    myScan.nextLine();
                    System.out.println("-----------------------------------------------------------------------------------------");
                    System.out.println("please enter your name: ");
                    String name = myScan.nextLine();
                    System.out.println("please enter your phone number: ");
                    String number = myScan.nextLine();
                    System.out.println("Please enter the number of nights you wish to stay in out hotel: ");
                    int numberOfNights = myScan.nextInt();
                    System.out.println("**********");
                    System.out.println("Thank you  " + name + "  !" + "  This is a confirmation that you have booked a  " + room.info);
                    System.out.println();
                    System.out.println("Value for  " + numberOfNights + "  nights  " + room.roomPrice * numberOfNights + "$");
                    room.showInfo();
                    System.out.println();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------");

                    addPerson(name, number, roomChoice, numberOfNights);
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------------------------------------");
                    makeBooking();
                    break;
                case 3:
                    System.out.println("-----------------------------------------------------------------------------------------");
                    //printMenu();
                    break;
            }
        }catch (Exception e){
            System.out.println("Sorry Enter a number typ ");
            makeBooking();
        }
     }
     private void addPerson(String name, String number, int roomChoice, int numberOfNights) {//test
        Person perspnObj = new Person(name,number,roomChoice,numberOfNights);
        persons.add(perspnObj);

    }
    public void save() {
        saveObject("person.ser", persons);
    }
}

