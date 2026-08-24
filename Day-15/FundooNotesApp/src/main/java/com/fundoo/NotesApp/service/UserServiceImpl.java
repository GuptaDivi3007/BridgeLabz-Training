package com.fundoo.NotesApp.service;

import com.fundoo.NotesApp.entity.User;
import com.fundoo.NotesApp.repository.UserRepository;
import com.fundoo.NotesApp.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public String login(String email, String password){
        User user = userRepository.findByEmail(email).orElseThrow(
                ()-> new IllegalArgumentException("Invalid email or password")
        );
        if(!passwordEncoder.matches(password, user.getPasswordHash())){
            throw new IllegalArgumentException("Invalid email or password");
        }
        return jwtUtil.generateToken(String.valueOf(user.getUserId()), user.getEmail());
    }

    @Override
    public String register(String email, String password, String name){
        if(userRepository.findByEmail(email).isPresent()){
            throw new IllegalArgumentException("Email already registered");
        }
        User user = new User();
        user.setEmail(email);
        user.setPasswordHash(passwordEncoder.encode(password));
        user.setName(name);

        User saved = userRepository.save(user);

        return jwtUtil.generateToken(String.valueOf(saved.getUserId()), saved.getEmail());
    }
}
