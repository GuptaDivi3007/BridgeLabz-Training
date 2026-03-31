package repository;

import model.AddressBook;
import java.util.HashMap;
import java.util.Map;

public class AddressBookRepository {

    private Map<String, AddressBook> addressBookMap = new HashMap<>();

    // UC 6
    public void addAddressBook(String name) {
        addressBookMap.putIfAbsent(name, new AddressBook());
    }

    public AddressBook getAddressBook(String name) {
        return addressBookMap.get(name);
    }

    public Map<String, AddressBook> getAllAddressBooks() {
        return addressBookMap;
    }
}
