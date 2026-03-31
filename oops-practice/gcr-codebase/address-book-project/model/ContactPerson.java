package model;

import java.util.Objects;

public class ContactPerson {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public ContactPerson(String firstName, String lastName,
                         String address, String city,
                         String state, String zip,
                         String phoneNumber, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    // Used for duplicate check
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ContactPerson)) return false;
        ContactPerson other = (ContactPerson) obj;
        return firstName.equalsIgnoreCase(other.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName.toLowerCase());
    }

    public void display() {
        System.out.println(
            firstName + " " + lastName +
            ", " + city +
            ", " + state +
            ", " + phoneNumber
        );
    }
}
