package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.junit.EvenNumber;

public class EvenNumberTest {

    private EvenNumber even = new EvenNumber();
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven(int number) {

        if (number % 2 == 0) {
            assertTrue(even.isEven(number));
        } else {
            assertFalse(even.isEven(number));
        }
    }
}

