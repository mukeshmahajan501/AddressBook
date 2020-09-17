package com.company;

import java.util.Scanner;

public class AddressBook {
    Scanner input = new Scanner(System.in);

    Person addPerson() {
        Person person = new Person();
        System.out.print("Enter First name: ");
        String firstName = input.next();

        System.out.print("Enter Last name: ");
        String lastName = input.next();

        System.out.print("Enter Address: ");
        String address = input.next();

        System.out.print("Enter City: ");
        String city = input.next();

        System.out.print("Enter state: ");
        String state = input.next();

        System.out.print("Enter Zip: ");
        int zip = input.nextInt();

        System.out.print("Enter phone number: ");
        String phoneNum = input.next();

        person.setPerson(firstName, lastName, address, city, state, zip, phoneNum);
        return person;
    }
}
