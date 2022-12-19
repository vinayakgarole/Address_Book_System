package com.bridgelabz;

import java.util.ArrayList;

public class AddressBook {

    ArrayList<Contacts> addressBook = new ArrayList<Contacts>();

    public ArrayList<Contacts> addContact(Contacts contact) {
        this.addressBook.add(contact);
        return this.addressBook;
    }

    public ArrayList<Contacts> getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(ArrayList<Contacts> addressBook) {
        this.addressBook = addressBook;
    }
}