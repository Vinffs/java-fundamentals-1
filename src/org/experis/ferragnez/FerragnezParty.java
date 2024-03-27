package org.experis.ferragnez;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FerragnezParty {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] invitedGuests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary " +
                "Blasi","Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        System.out.print("Good Evening! May I have your name? ");

        String nameToCheck = scan.nextLine().toUpperCase();

        // Methods to check if nameToCheck is included in the invitedGuests array

        // Method 1 -> asList method
        List<String> namesList = Arrays.asList(invitedGuests);
        namesList.replaceAll(String::toUpperCase);

        if(namesList.contains(nameToCheck)) {
            System.out.println("This way please!");
        } else {
            System.out.println("My apologies, your name is not on the list. I can't let you in.");
        }

        scan.close();
    }
}
