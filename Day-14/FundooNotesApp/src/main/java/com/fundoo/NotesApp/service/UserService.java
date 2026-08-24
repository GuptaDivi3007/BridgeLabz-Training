package com.fundoo.NotesApp.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    String login(String email, String password);

    String register(String email, String password, String name);
}
