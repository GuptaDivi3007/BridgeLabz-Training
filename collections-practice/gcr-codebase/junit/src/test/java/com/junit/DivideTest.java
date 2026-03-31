package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.Divide;

public class DivideTest {

    private Divide divide;

    @BeforeEach
    void setUp() {
        divide = new Divide();
    }
    @Test
    void testDivideByZero() {

        assertThrows(ArithmeticException.class, () -> {
            divide.divide(10, 0);
        });
    }
    @Test
    void testDivideNormalCase() {

        int result = divide.divide(10, 2);
        assertEquals(5, result);
    }
}
