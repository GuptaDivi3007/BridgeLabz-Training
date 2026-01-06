import java.util.*;

public class PhoneContactOrganizer {

    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();

        try {
            addContact(contacts, "Rohan", "9876543210");
            addContact(contacts, "Aditi", "9123456789");
            addContact(contacts, "Karan", "9876543210"); // duplicate
        }
        catch (InvalidPhoneNumberException e) {
            System.out.println(e.getMessage());
        }

        searchContact(contacts, "9123456789");
        deleteContact(contacts, "9876543210");
        displayContacts(contacts);
    }

    public static void addContact(List<Contact> contacts, String name, String phone)
            throws InvalidPhoneNumberException {

        if (!phone.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Invalid phone number: " + phone);
        }

        for (Contact c : contacts) {
            if (c.phoneNumber.equals(phone)) {
                System.out.println("Duplicate contact not allowed: " + phone);
                return;
            }
        }

        contacts.add(new Contact(name, phone));
        System.out.println("Contact added: " + name);
    }

    public static void deleteContact(List<Contact> contacts, String phone) {
        Iterator<Contact> itr = contacts.iterator();
        while (itr.hasNext()) {
            if (itr.next().phoneNumber.equals(phone)) {
                itr.remove();
                System.out.println("Contact deleted: " + phone);
                return;
            }
        }
        System.out.println("Contact not found: " + phone);
    }

    public static void searchContact(List<Contact> contacts, String phone) {
        for (Contact c : contacts) {
            if (c.phoneNumber.equals(phone)) {
                System.out.println("Found: " + c.name + " - " + c.phoneNumber);
                return;
            }
        }
        System.out.println("Contact not found: " + phone);
    }

    public static void displayContacts(List<Contact> contacts) {
        System.out.println("Contact List:");
        for (Contact c : contacts) {
            System.out.println(c.name + " : " + c.phoneNumber);
        }
    }

    public static class Contact {

        String name;
        String phoneNumber;

        Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }

    public static class InvalidPhoneNumberException extends Exception {
        InvalidPhoneNumberException(String message) {
            super(message);
        }
    }
}
