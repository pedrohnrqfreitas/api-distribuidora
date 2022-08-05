package com.distribuidorapixoca.demo.controlador;

import com.distribuidorapixoca.demo.request.LoginRequest;
import com.distribuidorapixoca.demo.response.JwtResponse;
import com.distribuidorapixoca.demo.servico.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthControler {

    private final AuthService authService;

    public AuthControler(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<JwtResponse> login(@RequestBody LoginRequest loginRequest) {

        return new ResponseEntity<>(authService.login(loginRequest), HttpStatus.OK);
    }
}
