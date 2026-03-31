package com.junit;

import org.junit.jupiter.api.*;

import com.junit.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    
    private Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    @DisplayName("Test Addition")
    void testAdd() {
        assertEquals(5, calculator.add(4, 1));
        assertEquals(5, calculator.add(3, 2));
        assertEquals(5, calculator.add(-4, 9));
    }
    @Test
    @DisplayName("Test Subtraction")
    void testSubtract() {
        assertEquals(-1, calculator.subtract(4, 5));
        assertEquals(0, calculator.subtract(0, 0));
        assertEquals(-9, calculator.subtract(0, 9));
    }
    @Test
    @DisplayName("Test Multiplication")
    void testMultiply() {
        assertEquals(6, calculator.multiply(1, 6));
        assertEquals(0, calculator.multiply(0, 8));
        assertEquals(-28, calculator.multiply(-4, 7));
    }
    @Test
    @DisplayName("Test Division")
    void testDivide() {
        assertEquals(5.0, calculator.divide(10, 2));
        assertEquals(7.0, calculator.divide(35, 5));
    }
    @Test
    @DisplayName("Test Division by Zero")
    void testDivideByZero() {
        IllegalArgumentException exception = 
            assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
        assertEquals("Division by zero", exception.getMessage());
    }
}
