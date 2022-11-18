package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {


    private ArrayList<Contacts> ContactList;            // Declearing Arraylist

    public AddressBook() {
        ContactList = new ArrayList<Contacts>();        // Initaillizing Arraylist
    }

    // Creating a Method and Adding object in a Arraylist
    public void addContact(Contacts createPerson) {
        System.out.println("Adding a New Contacts for " + createPerson.firstName);
        ContactList.add(createPerson);
    }

    public void editContact()                // Creating a Method and Edit with Switch Statement
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name of Contacts to Edit it");
        String cName = sc.nextLine();
        Contacts editContact = ContactList.get(cName.indexOf(cName));
        if (editContact.getFirstName().equals(cName)) {

            System.out.println("Which Details You Would Like To Edit ?");
            System.out.println("Press - 1 for First Name \nPress - 2 for Last Name \n"
                    + "Press - 3 for Address \nPress - 4 for City \nPress - 5 for State \nPress - 6 for Zip \n"
                    + "Press - 7 for Phone No. \nPress - 8 for Email");

            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Enter New First Name");
                    sc.nextLine();
                    String fName = sc.nextLine();
                    editContact.setFirstName(fName);
                    System.out.println("Update a Sucessfully " + fName);
                    break;

                case 2:
                    System.out.println("Enter New Last Name");
                    sc.nextLine();
                    String lName = sc.nextLine();
                    editContact.setLastName(lName);
                    System.out.println("Update a Sucessfully " + lName);
                    break;

                case 3:
                    System.out.println("Enter New Address");
                    sc.nextLine();
                    String address = sc.nextLine();
                    editContact.setAddress(address);
                    System.out.println("Update a Sucessfully " + address);
                    break;

                case 4:
                    System.out.println("Enter New City");
                    sc.nextLine();
                    String city = sc.nextLine();
                    editContact.setCity(city);
                    System.out.println("Update a Sucessfully " + city);
                    break;

                case 5:
                    System.out.println("Enter New State");
                    sc.nextLine();
                    String state = sc.nextLine();
                    editContact.setState(state);
                    System.out.println("Update a Sucessfully " + state);
                    break;

                case 6:
                    System.out.println("Enter New Zip");
                    int zip = sc.nextInt();
                    editContact.setZip(zip);
                    System.out.println("Update a Sucessfully " + zip);
                    break;

                case 7:
                    System.out.println("Enter New Phone Number");
                    String phoneNumber = sc.nextLine();
                    editContact.setPhoneNumber(phoneNumber);
                    System.out.println("Update a Sucessfully " + phoneNumber);
                    break;

                case 8:
                    System.out.println("Enter New Email");
                    sc.nextLine();
                    String email = sc.nextLine();
                    editContact.setEmail(email);
                    System.out.println("Update a Sucessfully " + email);
                    break;

                default:
                    System.out.println("No Edit");
                    return;


            }
        } else {
            System.out.println("No such contact");
        }
    }

    public Contacts getContactInput()                    // Getting a Input from User
    {


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

        Contacts contact = new Contacts(firstName, lastName, address, city, state, email, phoneNumber, zip);
        return contact;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to the Address Book System");
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        AddressBook AD = new AddressBook();                    // Creating a Object of Main Class
        while (true)                                                // Checking a Choice with Switch Statement
        {
            System.out.println("1.Adding Contacts \n2.Update \n3.Exit");
            System.out.println("Enter a Your Choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Contacts Contact = AD.getContactInput();
                    AD.addContact(Contact);

                    System.out.println("Contacts Added Successfully");
                    break;

                case 2:
                    AD.editContact();
                    System.out.println("Contacts Updated Successfully");
                    break;

                case 3:
                    System.out.println("Thank You We are Exiting");
                    return;

                default:
                    System.out.println("Sorry You are Type Wrong Choice");
            }
        }
    }
}