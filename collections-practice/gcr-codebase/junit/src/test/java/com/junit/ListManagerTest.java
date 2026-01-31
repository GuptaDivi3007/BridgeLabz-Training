package com.junit;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.ListManager;

public class ListManagerTest {

    private ListManager manager;
    @BeforeEach
    void setUp() {
        manager = new ListManager();
    }
    @Test
    void testAddItem() {
        manager.addItem("Apple");
        assertEquals(1, manager.size());
        assertTrue(manager.contains("Apple"));
    }
    @Test
    void testRemoveItem() {
        manager.addItem("Apple");
        manager.removeItem("Apple");
        assertEquals(0, manager.size());
    }
    @Test
    void testContains() {
        manager.addItem("Banana");
        assertTrue(manager.contains("Banana"));
    }
}
