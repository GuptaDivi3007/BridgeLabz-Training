package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.junit.PerformanceTask;

public class PerformanceTaskTest {
    PerformanceTask task = new PerformanceTask();

    @Test
  
    void testLongRunningTask() throws InterruptedException {

        String result = task.longRunningTask();
        assertEquals("Task Completed", result);
    }
}
