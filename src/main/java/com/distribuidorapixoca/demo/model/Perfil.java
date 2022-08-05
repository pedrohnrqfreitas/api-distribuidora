package com.distribuidorapixoca.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table(name = "perfil")
@Getter
@Setter
public class Perfil implements GrantedAuthority{

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
