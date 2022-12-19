package com.bridgelabz;

import java.util.ArrayList;

public class AddressBook {

    ArrayList<Contacts> addressbook = new ArrayList<Contacts>();

    public ArrayList<Contacts> addContact(Contacts contact) {
        this.addressbook.add(contact);
        return this.addressbook;
    }

    public ArrayList<Contacts> getAddressbook() {
        return addressbook;
    }

    public void setAddressbook(ArrayList<Contacts> addressbook) {
        this.addressbook = addressbook;
    }
}