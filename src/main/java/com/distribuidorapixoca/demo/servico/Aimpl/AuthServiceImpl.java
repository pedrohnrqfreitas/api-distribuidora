package com.distribuidorapixoca.demo.servico.Aimpl;

import com.distribuidorapixoca.demo.model.Usuario;
import com.distribuidorapixoca.demo.request.LoginRequest;
import com.distribuidorapixoca.demo.response.JwtResponse;
import com.distribuidorapixoca.demo.servico.AuthService;
import com.distribuidorapixoca.demo.util.jwt.JwtUtil;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    private final UserDetailsService userDetailsService;

    public AuthServiceImpl(AuthenticationManager authenticationManager, JwtUtil jwtUtil, UserDetailsService userDetailsService) {
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
        this.userDetailsService = userDetailsService;
    }

    @Override
    public JwtResponse login(LoginRequest loginRequest) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
            SecurityContextHolder.getContext().setAuthentication(authentication);
        } catch (Exception exception) {
            throw new IllegalStateException(exception.getMessage());
        }

        Usuario usuario = (Usuario) userDetailsService.loadUserByUsername(loginRequest.getUsername());

        String token = jwtUtil.generateToken(usuario);

        return new JwtResponse(usuario,token);

    }
}
