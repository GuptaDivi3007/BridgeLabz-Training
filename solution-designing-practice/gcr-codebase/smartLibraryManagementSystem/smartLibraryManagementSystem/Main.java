package smartLibraryManagementSystem;

public class Main {
    public static void main(String[] args) {

        LibraryCatalog catalog = LibraryCatalog.getInstance();

        User student = UserFactory.createUser("student", "Nova");
        User faculty = UserFactory.createUser("faculty", "Ms. Smith");
        User guest = UserFactory.createUser("guest", "Wilson");
        student.showRole();
        faculty.showRole();
        guest.showRole();

        catalog.addObserver(student);
        catalog.addObserver(faculty);
        catalog.addObserver(guest);
        Book book = new Book.BookBuilder("Design Patterns").author("GoF").edition("2nd").genre("Software Engineering").build();
        catalog.addBook(book);

        student.reserveBook();
        guest.reserveBook();
    }
}

