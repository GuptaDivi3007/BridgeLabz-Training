package com.junit;

public class PerformanceTask {

    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);

        return "Task Completed";
    }
}
