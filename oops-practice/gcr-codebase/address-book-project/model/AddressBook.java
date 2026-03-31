package model;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<ContactPerson> contacts = new ArrayList<>();

    // UC 5 & 7
    public boolean addContact(ContactPerson person) {
        if (contacts.contains(person)) {
            return false;
        }
        contacts.add(person);
        return true;
    }

    // UC 4
    public boolean deleteContact(String firstName) {
        return contacts.removeIf(
            p -> p.getFirstName().equalsIgnoreCase(firstName)
        );
    }

    public List<ContactPerson> getContacts() {
        return contacts;
    }
}
