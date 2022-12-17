package com.bridgelabz;

import java.util.*;

public class AddressBookMain {

    public static Contacts input(Scanner scanner) {

        System.out.println("Add details of a person");
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
        Contacts contact = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber);
        return contact;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
         * Adding Contacts details using Constructor of person class
         */
        Contacts contact1 = new Contacts("Vinayak", "Garole", "Ranale", "Nandurbar", "Maharashtra", 425411, "8380867601");
        Contacts contact2 = new Contacts("Sandeep", "Pangare", "Rajale", "Nandurbar", "Maharashtra", 425411, "8380864512");
        Contacts contact3 = new Contacts("Surabhi", "Bhagat", "Kotharud", "Pune", "Maharashtra", 92226, "4849849840");
        Contacts contact4 = new Contacts("Rahul", "Bhosale", "Satara", "Satara", "Maharashtra", 986544, "44948270");
        Contacts contact5 = new Contacts("Suchendra", "Mishra", "Mahur", "Vithol", "Jharakhand", 26556, "2554654");

        /*
         * Adding contacts to different address books by using addContact method means every single address book
         * has multiple contacts
         */
        AddressBook addressBook = new AddressBook();
        addressBook.addContact(new Contacts("Vinayak", "Garole", "Ranale", "Nandurbar", "Maharashtra", 425411, "8380867601"));
        addressBook.addContact(contact2);
        AddressBook addressBook1 = new AddressBook();
        addressBook.addContact(contact3);
        addressBook.addContact(contact4);
        AddressBook addressBook2 = new AddressBook();
        addressBook.addContact(contact5);
        addressBook.addContact(contact4);

        Map<String, AddressBook> map = new HashMap<>();

        map.put("addressBook", addressBook);
        map.put("addressBook1", addressBook1);
        map.put("addressBook2", addressBook2);

        /*
         * Adding Person in the addressbook by calling input function
         */
        addressBook.addContact(input(scanner));
        System.out.println("Enter city you want contacts for");
        String city = scanner.next();
        System.out.println("Enter state you want contacts for");
        String state = scanner.next();

        /*
         * For iterating the map we take a variable e  and iterating over every addressbook in the map and temp is a variable of
         * type AddressBook like we take int a. In temp we are getting values of addressbooks one by one from map further for-each
         * loop to iterate persons in the addressbook and if person city equal to the input city then printing it.
         */
        int count1 = 0;
        int count2 = 0;

        for (Map.Entry<String, AddressBook> e : map.entrySet()) {
            AddressBook temp = e.getValue();

            for (Contacts contact : temp.getAddressbook()) {

                if (contact.getCity().equalsIgnoreCase(city)) {
                    System.out.println("Contacts of person in the same city are ");
                    count1++;
                    temp.printAddressBook(contact);
                } else if (contact.getState().equalsIgnoreCase(state)) {
                    System.out.println("Contacts of person in the same state are ");
                    count2++;
                    temp.printAddressBook(contact);

                }
            }
        }
        System.out.println("Number of persons in the same city in addressbook are: " + count1);
        System.out.println("Number of persons in the same state in addressbook are: " + count2);
    }
}