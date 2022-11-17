package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    private ArrayList<Contacts> ContactList;

    public AddressBook() {
        ContactList = new ArrayList<Contacts>();
    }

    public void addContact(Contacts createPerson) {
        System.out.println("Adding a New Contact for " + createPerson.firstName);
        ContactList.add(createPerson);
    }

    public Contacts getContactInput() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter the Address: ");
        String address = sc.nextLine();
        System.out.println("Enter the City: ");
        String city = sc.nextLine();
        System.out.println("Enter the State: ");
        String state = sc.nextLine();
        System.out.println("Enter the Zip: ");
        int zip = sc.nextInt();
        System.out.println("Enter the Phone No: ");
        String phoneNumber = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the Email: ");
        String email = sc.nextLine();

        Contacts contact = new Contacts(firstName, lastName, address, city, state, email, zip, phoneNumber);
        return contact;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to the Address Book System");
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        AddressBook AD = new AddressBook();

        while (true) {
            System.out.println("1.Adding Contact \n2.Exit");
            System.out.println("Enter a Your Choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Contacts contact = AD.getContactInput();
                    AD.addContact(contact);

                    System.out.println("Contact Added Successfully ");
                    break;

                case 2:
                    System.out.println("Thank You We are Exiting");
                    return;

                default:
                    System.out.println("Sorry You are Type Wrong Choice");
            }
        }
    }
}