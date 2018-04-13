package me.soulyana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Person aPerson = new Person();

        System.out.println("What is your first name?");
        aPerson.setFirstName(scan.nextLine());

        System.out.println("What is your last name?");
        aPerson.setLastName(scan.nextLine());

        System.out.println("What is your phone number?");
        aPerson.setPhoneNum(scan.nextLine());

        System.out.println("What is your email address?");
        aPerson.setEmail(scan.nextLine());

        System.out.println("It's great to meet you " + aPerson.getFirstName() + " " + aPerson.getLastName() +
        "! Can I call you " + aPerson.getFirstName() + "? Your phone number is " + aPerson.getPhoneNum() +
        ", and your email address is " + aPerson.getEmail() + " .");
    }
}
