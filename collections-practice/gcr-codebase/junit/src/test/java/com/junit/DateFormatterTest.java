package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.DateFormatter;

public class DateFormatterTest {

    private DateFormatter formatter;

    @BeforeEach
    void setUp() {
        formatter = new DateFormatter();
    }
    @Test
    void testValidDate() {
        String result = formatter.formatDate("2025-01-30");
        assertEquals("30-01-2025", result);
    }
    @Test
    void testInvalidDateFormat() {

        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("30/01/2025");
        });
    }
    @Test
    void testInvalidDateValue() {

        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("2025-13-40");
        });
    }
}

