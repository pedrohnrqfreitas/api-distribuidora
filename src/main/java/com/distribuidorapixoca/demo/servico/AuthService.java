package com.distribuidorapixoca.demo.servico;

import com.distribuidorapixoca.demo.model.Usuario;
import com.distribuidorapixoca.demo.request.LoginRequest;
import com.distribuidorapixoca.demo.response.JwtResponse;

public interface AuthService {
    JwtResponse login(LoginRequest loginRequest);
}
