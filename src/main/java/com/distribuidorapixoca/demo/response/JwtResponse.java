package com.distribuidorapixoca.demo.response;

import com.distribuidorapixoca.demo.model.Perfil;
import com.distribuidorapixoca.demo.model.Usuario;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class JwtResponse {

    private Long id;
    private String username;
    private List<String> cargo;
    private String token;

    public JwtResponse(final Usuario usuario,String token) {
        id = usuario.getId();
        username = usuario.getUsername();
        cargo = getCargos(usuario.getPerfis());
        this.token = token;
    }

    private List<String> getCargos(List<Perfil> perfils){
        return perfils.stream().map(perfil -> perfil.getNome().name()).collect(Collectors.toList());
    }
}
