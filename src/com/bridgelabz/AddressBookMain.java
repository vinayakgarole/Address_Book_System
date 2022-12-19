package com.bridgelabz;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBookMain {

    public static Contacts getInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add details of a person you want to edit");

        System.out.println("Please provide first name");
        String firstName = scanner.next();

        System.out.println("Please provide Last name");
        String lastName = scanner.next();

        System.out.println("Please provide address");
        String address = scanner.next();

        System.out.println("Please provide city");
        String city = scanner.next();

        System.out.println("Please provide state");
        String state = scanner.next();

        System.out.println("Please provide zip");
        int zip = scanner.nextInt();

        System.out.println("Please provide phone number");
        String phoneNumber = scanner.next();

        System.out.println("Please provide email");
        String email = scanner.next();

        Contacts contact = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
        return contact;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
         * Adding Contacts details using Constructor of person class
         */
        Contacts contact1 = new Contacts("Vinayak", "Garole", "Ranale", "Nandurbar", "Maharashtra", 425411, "8380867601", "vinayakgarole10@gamil.com");
        Contacts contact2 = new Contacts("Sandeep", "Pangare", "Rajale", "Nandurbar", "Maharashtra", 425411, "8380864512", "aegag@jef.com");
        Contacts contact3 = new Contacts("Surabhi", "Bhagat", "Kotharud", "Pune", "Maharashtra", 92226, "4849849840", "dsaef@gmail.com");
        Contacts contact4 = new Contacts("Rahul", "Bhosale", "Satara", "Satara", "Maharashtra", 986544, "44948270", "fbzb@gmail.com");
        Contacts contact5 = new Contacts("Suchendra", "Mishra", "Mahur", "Vithol", "Jharakhand", 26556, "2554654", "dthbdthb@gamil.com");
        Contacts contact6 = new Contacts("Sumit", "Kumar", "Bandra", "Bandra", "Maharashtra", 462156, "4849849", "dgthd@gamil.com");

        /*
         * Adding contacts to different address books by using addContact method means every single address book
         * has multiple contacts
         */
        AddressBook addressBook = new AddressBook();
        addressBook.addContact(contact1);
        addressBook.addContact(contact2);
        addressBook.addContact(contact3);
        addressBook.addContact(contact4);
        addressBook.addContact(contact5);
        addressBook.addContact(contact6);
        Contacts contact = getInput();
        addressBook.addContact(contact);

        /*
         * Taking a new list of type Contact named as sortedaddressbook. In this we are sorting the contacts
         * Using their first name in alphabetically manner using Comparator and comparing by getting first name.
         */
        List<Contacts> sortedByCity = addressBook.getAddressbook().stream().sorted(Comparator.comparing(Contacts::getCity)).collect(Collectors.toList());

        List<Contacts> sortedByZipCode = addressBook.getAddressbook().stream().sorted(Comparator.comparing(Contacts::getZip)).collect(Collectors.toList());

        List<Contacts> sortedByState = addressBook.getAddressbook().stream().sorted(Comparator.comparing(Contacts::getState)).collect(Collectors.toList());
        /*
         * Printing the different sorted list one by one
         */
        System.out.println("Contacts sorted by City are : ");
        sortedByCity.forEach(System.out::println);
        System.out.println();
        System.out.println("Contacts sorted by State are : ");
        sortedByState.forEach(System.out::println);
        System.out.println();
        System.out.println("Contacts sorted by ZipCode are : ");
        sortedByZipCode.forEach(System.out::println);
        System.out.println();
        System.out.println();

        /*
         * Multiple sorting is done by using thenComparing keyword in this we are sorting by city and state
         * both simultaneously
         */

        List<Contacts> sortedByCityAndState = addressBook.getAddressbook().stream().sorted(Comparator.comparing(Contacts::getCity).thenComparing(Contacts::getState)).collect(Collectors.toList());

        /*
         * Printed the sorted list by city and state both
         */
        System.out.println("Contacts which are sorted by city and state : ");
        sortedByCityAndState.forEach(System.out::println);
        System.out.println();

        /*
         * Another way to do multiple sorting by using multiple fields
         */
        Comparator<Contacts> compareByCity = Comparator.comparing(Contacts::getCity);
        Comparator<Contacts> compareByState = Comparator.comparing(Contacts::getState);
        Comparator<Contacts> compareByZipCode = Comparator.comparing(Contacts::getZip);


        // Sorting on multiple fields (3-level) using Method Reference

        List<Contacts> sortedByCityStateAndZipCode = addressBook.getAddressbook().stream().sorted(compareByZipCode.thenComparing(compareByState).thenComparing(compareByCity)).collect(Collectors.toList());

        /*
         * Printing the Multiple fields sorted Contact list using for-each loop
         */
        System.out.println("Contacts which are sorted by city,state and zipcode are : ");
        sortedByCityStateAndZipCode.forEach(System.out::println);
    }
}