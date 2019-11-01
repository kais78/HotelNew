package com.company;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtility {

    public static void saveObject(String filename, Object o, StandardOpenOption... option) {
        Path path = Paths.get(filename);
        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(path, option))) {
            out.writeObject(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object loadObject(String filename) {
        Path path = Paths.get(filename);
        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(path))) {
            return in.readObject();
        } catch (Exception e) {
           // e.printStackTrace();
        }
        return null;
    }

    public static void saveText(String filename, List<String> list, StandardOpenOption... option) {
        Path path = Paths.get(filename);
        try {
            Files.write(path, list, option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<String> loadText(String filename) {
        Path path = Paths.get(filename);
        try {
            return Files.readAllLines(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void removeName(List<Person> personsToRemoveFrom) {
        //tar emot listan, namnet på listan behöver inte vara samma som den som skickar från mainmeny()

        Scanner myScan = new Scanner(System.in);
        String name2 = myScan.nextLine();
        for (Person p : personsToRemoveFrom) {
            if (p.name.equals(name2)) {

                RemovPerson removPerson=new RemovPerson();


                System.out.println(removPerson.phone1);
                personsToRemoveFrom.remove(p);//Vi skickar in objektet p


                /*

                 removPerson.name1=p.name;
                removPerson.phone1=p.phone;
                removPerson.numberOfNights1=p.numberOfNights;
                removPerson.roomChoice1=p.roomChoice;
                System.out.println(removPerson.name1);




                ----------------------------------------------------------
                 persons.indexOf(personsToRemoveFrom.indexOf(p));// from personsToRemoveFrom.indexOf(p);

                Person removedPerson = personsToRemoveFrom.remove(p);

                removPersons.add(removedPerson);





                * */

                break;
            }
        }
        saveObject("person.ser", personsToRemoveFrom);
        /* for (Person p : personsToRemoveFrom) {
            System.out.println(p.name);
        } */

        //System.out.println("Found: " + personsToRemoveFrom.remove(indexOfName));


    }






}
