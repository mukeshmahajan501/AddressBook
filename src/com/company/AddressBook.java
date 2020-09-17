package com.company;

import java.util.LinkedList;
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

    LinkedList<Person> editPerson(LinkedList<Person> addressBook) {
        System.out.print("Enter First Name to edit : ");
        String firstName = input.next();
        System.out.print("Enter Last Name: ");
        String lastName = input.next();


        boolean flag = false;
        for (Person person : addressBook) {
            System.out.print(person.getFirstName() + " " + person.getLastName());
            if (firstName.equals(person.getFirstName()) && lastName.equals(person.getLastName())) {
                System.out.println("\n1. Address" +
                        "\n2. City" +
                        "\n3. State" +
                        "\n4. Zip" +
                        "\n5. Phone Number" +
                        "\n Enter your choice: ");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter Updated Address: ");
                        String address = input.next();
                        person.setAddress(address);
                        break;

                    case 2:
                        System.out.print("Enter Updated City: ");
                        String city = input.next();
                        person.setCity(city);
                        break;

                    case 3:
                        System.out.print("Enter Updated State: ");
                        String state = input.next();
                        person.setState(state);
                        break;

                    case 4:
                        System.out.print("Enter Updated Zip: ");
                        int zip = input.nextInt();
                        person.setZip(zip);
                        break;

                    case 5:
                        System.out.print("Enter Updated Phone Number: ");
                        String phoneNum = input.next();
                        person.setPhoneNum(phoneNum);
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
                flag = true;
                System.out.println("Editing done.");
            }
            if (flag == false) {
                System.out.println("Details not found.");
            }
        }
        return addressBook;
    }
}
