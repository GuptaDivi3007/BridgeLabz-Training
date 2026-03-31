package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.UserRegistration;

public class UserRegistrationTest {

    private UserRegistration registration;

    @BeforeEach
    void setUp() {
        registration = new UserRegistration();
    }

    // ✅ Valid registration
    @Test
    void testValidRegistration() {
        assertTrue(registration.registerUser("Navya", "navya@test.com", "secret123"));
    }

    // ❌ Invalid username
    @Test
    void testInvalidUsername() {

        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("", "test@test.com", "secret123");
        });
    }
    @Test
    void testInvalidEmail() {

        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("Navya", "test.com", "secret123");
        });
    }
    @Test
    void testInvalidPassword() {

        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("Navya", "test@test.com", "123");
        });
    }
}
