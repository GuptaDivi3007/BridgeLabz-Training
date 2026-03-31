package controller;

import model.ContactPerson;
import service.AddressBookService;
import java.util.Scanner;

public class AddressBookController {

    private AddressBookService service = new AddressBookService();
    private Scanner scanner = new Scanner(System.in);

    public void start() {

        System.out.print("Enter Address Book Name: ");
        String bookName = scanner.nextLine();
        service.createAddressBook(bookName);

        addMultiplePersons(bookName);
        deletePerson(bookName);
        searchPerson();
    }

    // UC 5
    private void addMultiplePersons(String bookName) {

        while (true) {
            System.out.print("Add new contact? (yes/no): ");
            if (!scanner.nextLine().equalsIgnoreCase("yes")) break;

            System.out.print("First Name: ");
            String first = scanner.nextLine();

            System.out.print("Last Name: ");
            String last = scanner.nextLine();

            System.out.print("City: ");
            String city = scanner.nextLine();

            System.out.print("State: ");
            String state = scanner.nextLine();

            ContactPerson person = new ContactPerson(
                first, last, "", city, state, "", "", ""
            );

            service.addPerson(bookName, person);
        }
    }

    // UC 4
    private void deletePerson(String bookName) {
        System.out.print("Enter name to delete: ");
        service.deletePerson(bookName, scanner.nextLine());
    }

    // UC 8
    private void searchPerson() {
        System.out.print("Search by City or State: ");
        service.searchByCityOrState(scanner.nextLine());
    }
}
