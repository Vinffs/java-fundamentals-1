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

        double average = km * pricePerKm;
        String resultText = "The price of your ticket is: € ";

        if(age < 18) {
            double finalPrice = average - (km * costKmMinor);
            System.out.println(resultText + String.format("%.2f", finalPrice));

        } else if (age > 65) {
            double finalPrice = average - (km * costKmSenior);
            System.out.println(resultText + String.format("%.2f", finalPrice));

        } else {
            System.out.println(resultText + String.format("%.2f", average));
        }
        scan.close();
    }
}
