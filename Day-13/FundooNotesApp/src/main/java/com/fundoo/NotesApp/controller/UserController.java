package com.fundoo.NotesApp.controller;

import com.fundoo.NotesApp.dto.AuthResponse;
import com.fundoo.NotesApp.dto.LoginRequest;
import com.fundoo.NotesApp.dto.RegisterRequest;
import com.fundoo.NotesApp.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/auth")
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@Valid @RequestBody LoginRequest loginRequest) {
        String token = userService.login(loginRequest.getEmail(), loginRequest.getPassword());

        return ResponseEntity.ok(new AuthResponse(token));
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@Valid @RequestBody RegisterRequest registerRequest){
        String token = userService.register(registerRequest.getEmail(), registerRequest.getPassword(), registerRequest.getName());

        return ResponseEntity.status(HttpStatus.CREATED).body(new AuthResponse(token));
    }
}
