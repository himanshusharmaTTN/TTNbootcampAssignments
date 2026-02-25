package com.example.SpringSecurity.controller;

import com.example.SpringSecurity.Config.JwtUtil;
import com.example.SpringSecurity.Repository.UserRepo;
import com.example.SpringSecurity.model.User;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserRepo repo;
    private final PasswordEncoder encoder;
    private final JwtUtil jwtUtil;
    private final AuthenticationManager authManager;

    public AuthController(UserRepo repo,
                          PasswordEncoder encoder,
                          JwtUtil jwtUtil,
                          AuthenticationManager authManager) {
        this.repo = repo;
        this.encoder = encoder;
        this.jwtUtil = jwtUtil;
        this.authManager = authManager;
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        repo.save(user);
        return "User registered";
    }

    @PostMapping("/login")
    public String login(@RequestBody User req) {

        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        req.getEmail(), req.getPassword()));  // 🔥 change here

        return jwtUtil.generateToken(req.getEmail());
    }
}