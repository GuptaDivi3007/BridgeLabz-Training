package service;

import model.AddressBook;
import model.ContactPerson;
import repository.AddressBookRepository;

public class AddressBookService {

    private AddressBookRepository repository = new AddressBookRepository();

    // UC 6
    public void createAddressBook(String name) {
        repository.addAddressBook(name);
    }

    // UC 5 & 7
    public void addPerson(String bookName, ContactPerson person) {
        AddressBook book = repository.getAddressBook(bookName);
        if (!book.addContact(person)) {
            System.out.println("Duplicate contact not allowed");
        }
    }

    // UC 4
    public void deletePerson(String bookName, String name) {
        AddressBook book = repository.getAddressBook(bookName);
        if (!book.deleteContact(name)) {
            System.out.println("Contact not found");
        }
    }

    // UC 8
    public void searchByCityOrState(String value) {
        repository.getAllAddressBooks().forEach((bookName, book) -> {
            book.getContacts().stream()
                .filter(p ->
                    p.getCity().equalsIgnoreCase(value) ||
                    p.getState().equalsIgnoreCase(value))
                .forEach(ContactPerson::display);
        });
    }
}
