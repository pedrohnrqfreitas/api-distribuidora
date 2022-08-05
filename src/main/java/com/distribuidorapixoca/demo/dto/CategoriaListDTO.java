package com.distribuidorapixoca.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoriaListDTO {
    public long getPreco;
    private long id;
    private String nome;

    public CategoriaListDTO (Long id, String nome){
        this.id = id;
        this.nome = nome;
    }
}
