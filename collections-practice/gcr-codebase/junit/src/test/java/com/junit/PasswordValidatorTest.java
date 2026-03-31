package com.junit;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.PasswordValidator;

public class PasswordValidatorTest {

    private PasswordValidator validator;
    @BeforeEach
    void setUp() {
        validator = new PasswordValidator();
    }
    // ✅ Valid password
    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Password1"));
    }
    // ❌ Too short
    @Test
    void testShortPassword() {
        assertFalse(validator.isValid("Pass1"));
    }
    // ❌ No uppercase
    @Test
    void testNoUppercase() {
        assertFalse(validator.isValid("password1"));
    }
    // ❌ No digit
    @Test
    void testNoDigit() {
        assertFalse(validator.isValid("Password"));
    }
    // ❌ Null password
    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null));
    }
}
