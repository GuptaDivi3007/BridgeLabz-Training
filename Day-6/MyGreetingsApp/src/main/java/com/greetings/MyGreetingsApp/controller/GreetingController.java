package com.greetings.MyGreetingsApp.controller;

import com.greetings.MyGreetingsApp.model.Greeting;
import com.greetings.MyGreetingsApp.service.GreetingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/greetings")
public class GreetingController {

    private final GreetingService greetingService;

    // Constructor Injection
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // CREATE
    @PostMapping
    public Greeting createGreeting(@RequestBody Greeting greeting) {
        return greetingService.createGreeting(greeting);
    }

    // READ - Get all greetings
    @GetMapping
    public List<Greeting> getAllGreetings() {
        return greetingService.getAllGreetings();
    }

    // READ - Get greeting by ID
    @GetMapping("/{id}")
    public Greeting getGreetingById(@PathVariable int id) {
        return greetingService.getGreetingById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Greeting updateGreeting(@PathVariable int id, @RequestBody Greeting greeting) {
        return greetingService.updateGreeting(id, greeting);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteGreeting(@PathVariable int id) {
        boolean deleted = greetingService.deleteGreeting(id);
        if (deleted) {
            return "Greeting deleted successfully";
        }
        return "Greeting not found";
    }
}