package com.shopsphere.auth.controller;

import com.shopsphere.auth.dto.AuthResponse;
import com.shopsphere.auth.dto.RegisterRequest;
import com.shopsphere.auth.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "Auth Service is UP and running!";
    }

    @PostMapping("/register")
    public AuthResponse register(@RequestBody RegisterRequest request) {
        return authService.registerUser(request);
    }
}