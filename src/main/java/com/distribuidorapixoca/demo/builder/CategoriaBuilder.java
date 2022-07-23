package com.distribuidorapixoca.demo.builder;

import com.distribuidorapixoca.demo.model.Categoria;

public final class CategoriaBuilder  {

    private Categoria categoria;

    private CategoriaBuilder(){
        categoria = new Categoria();
    }

    public static CategoriaBuilder builder(){
        return new CategoriaBuilder();
    }

    public CategoriaBuilder withNome(String nome){
        categoria.setNome(nome);
        return this;
    }

    public Categoria build(){
        return categoria;
    }
}
