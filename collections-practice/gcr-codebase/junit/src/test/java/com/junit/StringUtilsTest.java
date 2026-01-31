package com.junit;

import org.junit.jupiter.api.*;

import com.junit.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    
    @Test
    @DisplayName("Test Reverse Method")
    void testReverse() {
        assertEquals("dlroW olleH", StringUtils.reverse("Hello World"));
        assertEquals("657", StringUtils.reverse("756"));
        assertNull(StringUtils.reverse(null));
        assertEquals("", StringUtils.reverse(""));
    }
    @Test
    @DisplayName("Test Palindrome Method")
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("racecar"));
        assertTrue(StringUtils.isPalindrome("A man a plan a canal Panama"));
        assertTrue(StringUtils.isPalindrome("45654"));
        assertFalse(StringUtils.isPalindrome("hello"));
        assertFalse(StringUtils.isPalindrome(null));
    }
    @Test
    @DisplayName("Test Uppercase Method")
    void testToUpperCase() {
        assertEquals("WELLO BUBBLE", StringUtils.toUpperCase("Wello Bubble"));
        assertEquals("PYTHON", StringUtils.toUpperCase("python"));
        assertNull(StringUtils.toUpperCase(null));
        assertEquals("", StringUtils.toUpperCase(""));
    }
}
