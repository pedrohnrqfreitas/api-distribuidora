package com.distribuidorapixoca.demo.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Data
@Table(name = "perfil")
public class Perfil implements GrantedAuthority {

    @Id
    private int id;
    @Enumerated(EnumType.STRING)
    private EnumPerfil nome;

    public Perfil() {}

    public Perfil(EnumPerfil nome){
        this.nome = nome;
    }

    @Override
    public String getAuthority() {
        return this.nome.name();
    }
}
