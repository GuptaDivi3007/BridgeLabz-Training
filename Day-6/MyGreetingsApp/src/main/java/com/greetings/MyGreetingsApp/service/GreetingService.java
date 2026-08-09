package com.greetings.MyGreetingsApp.service;

import com.greetings.MyGreetingsApp.model.Greeting;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GreetingService {

    private final List<Greeting> greetings = new ArrayList<>();
    private int nextId = 1;

    // CREATE
    public Greeting createGreeting(Greeting greeting) {
        greeting.setId(nextId++);
        greetings.add(greeting);
        return greeting;
    }

    // READ - Get all
    public List<Greeting> getAllGreetings() {
        return greetings;
    }

    // READ - Get by ID
    public Greeting getGreetingById(int id) {
        for (Greeting greeting : greetings) {
            if (greeting.getId() == id) {
                return greeting;
            }
        }
        return null;
    }

    // UPDATE
    public Greeting updateGreeting(int id, Greeting updatedGreeting) {
        for (Greeting greeting : greetings) {
            if (greeting.getId() == id) {
                greeting.setName(updatedGreeting.getName());
                greeting.setMessage(updatedGreeting.getMessage());
                return greeting;
            }
        }
        return null;
    }

    // DELETE
    public boolean deleteGreeting(int id) {
        for (Greeting greeting : greetings) {
            if (greeting.getId() == id) {
                greetings.remove(greeting);
                return true;
            }
        }
        return false;
    }
}