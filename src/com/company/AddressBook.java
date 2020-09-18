package com.company;
import java.util.LinkedList;
import java.util.Scanner;

public class AddressBook {
    Scanner input = new Scanner(System.in);

    //Add multiple person in address book.
    public Person addPerson (LinkedList<Person> addressBook) {
        Person person = new Person();
        System.out.print("Enter First name: ");
        String firstName = input.next();

        System.out.print("Enter Last name: ");
        String lastName = input.next();

        if(duplicateEntry(firstName, lastName, addressBook) == true) {
            System.out.println("Entry already exits.");
        } else {
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

        }
        return person;
    }

    //Check for duplicate entry
    boolean duplicateEntry(String firstName, String lastName, LinkedList<Person> addressBook) {
        boolean result = false;
        for (Person person: addressBook){
            if (firstName.equals(person.getFirstName()) && lastName.equals(person.getLastName())) {
                result = true;
            }
        }
        return result;
    }

    //Edit person details in address book.
    LinkedList<Person> editPerson(LinkedList<Person> addressBook){
        System.out.print("Enter First Name to edit : ");
        String firstName = input.next();
        System.out.print("Enter Last Name: ");
        String lastName = input.next();

        int temp = 0;
        for(Person p : addressBook){
            System.out.print(p.getFirstName()+" "+p.getLastName());
            if(firstName.equals(p.getFirstName()) && lastName.equals(p.getLastName())){
                System.out.println("\n1. Address" +
                        "\n2. City" +
                        "\n3. State" +
                        "\n4. Zip" +
                        "\n5. Phone Number"+
                        "\n Enter your choice: ");
                int choice = input.nextInt();
                switch (choice){
                    case 1:
                        System.out.print("Enter Updated Address: ");
                        String address = input.next();
                        p.setAddress(address);
                        break;

                    case 2:
                        System.out.print("Enter Updated City: ");
                        String city = input.next();
                        p.setCity(city);
                        break;

                    case 3:
                        System.out.print("Enter Updated State: ");
                        String state = input.next();
                        p.setState(state);
                        break;

                    case 4:
                        System.out.print("Enter Updated Zip: ");
                        int zip = input.nextInt();
                        p.setZip(zip);
                        break;

                    case 5:
                        System.out.print("Enter Updated Phone Number: ");
                        String phoneNum = input.next();
                        p.setPhoneNum(phoneNum);
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
                temp = 1;
                System.out.println("Editing done.");
            }
            if (temp == 0){
                System.out.println("Details not found.");
            }
        }
        return addressBook;
    }

    //Delete person in address book.
    LinkedList<Person> deletePerson(LinkedList<Person> addressBook){
        System.out.print("Enter First Name to delete record: ");
        String firstName = input.next();
        System.out.print("Enter Last Name: ");
        String lastName = input.next();
        int temp = 0;
        for(Person person : addressBook){
            if(firstName.equals(person.getFirstName()) && lastName.equals(person.getLastName())){
                addressBook.remove(person);
                System.out.println("Deletion Done.");
                temp = 1;
                break;
            }
        }
        if (temp == 0){
            System.out.println("Details not found.");
        }
        return addressBook;
    }
}