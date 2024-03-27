package org.experis.trainticket;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please insert mileage (km): ");
        int km = scan.nextInt();
        System.out.print("Please insert your age: ");
        int age = scan.nextInt();

        System.out.println(km);
        System.out.println(age);
    }
}
