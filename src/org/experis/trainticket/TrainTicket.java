package org.experis.trainticket;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please insert mileage (km): ");
        int km = scan.nextInt();

        System.out.print("Please insert your age: ");
        int age = scan.nextInt();

        double pricePerKm = 0.21;
        double costKmMinor = pricePerKm * 0.20;
        double costKmSenior = pricePerKm * 0.40;

        if(age < 18) {
            double finalPrice = (km * pricePerKm) -  (km * costKmMinor);
            System.out.println("The price of your ticket is: € " + String.format("%.2f", finalPrice));

        } else if (age > 65) {
            double finalPrice = (km * pricePerKm) -  (km * costKmSenior);
            System.out.println("The price of your ticket is: € " + String.format("%.2f", finalPrice));
        } else {
            double finalPrice = km * pricePerKm;
            System.out.println("The price of your ticket is: € " + String.format("%.2f", finalPrice));
        }

    }
}
