package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone deviceOne;
        deviceOne = new CellPhone();
        CellPhone deviceTwo = new CellPhone();

        // Populating device 1's info
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        deviceOne.setSerialNumber(serialNumber);
        scanner.nextLine(); // scanner buffer

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();
        deviceOne.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        deviceOne.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        deviceOne.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        deviceOne.setOwner(owner);

        // Populating device 2's info
        System.out.print("What is the serial number? ");
        serialNumber = scanner.nextInt();
        deviceTwo.setSerialNumber(serialNumber);
        scanner.nextLine(); // scanner buffer

        System.out.print("What model is the phone? ");
        model = scanner.nextLine();
        deviceTwo.setModel(model);

        System.out.print("Who is the carrier? ");
        carrier = scanner.nextLine();
        deviceTwo.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        phoneNumber = scanner.nextLine();
        deviceTwo.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        owner = scanner.nextLine();
        deviceTwo.setOwner(owner);

        display(deviceOne);
        display(deviceTwo);

        deviceOne.dial(deviceTwo.getPhoneNumber());
        deviceTwo.dial(deviceOne.getPhoneNumber());

        scanner.close();
    }

    public static void display(CellPhone device) {
        System.out.println("Cell Phone Info: ");
        System.out.println("Serial number: " + device.getSerialNumber());
        System.out.println("Model: " + device.getModel());
        System.out.println("Carrier: " + device.getCarrier());
        System.out.println("Phone number: " + device.getPhoneNumber());
        System.out.println("Owner: " + device.getOwner());
    }
}
