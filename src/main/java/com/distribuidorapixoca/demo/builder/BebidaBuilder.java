package com.distribuidorapixoca.demo.builder;

import com.distribuidorapixoca.demo.model.Bebidas;
import com.distribuidorapixoca.demo.model.Categoria;

public final class BebidaBuilder {

    private Bebidas bebidas;

    private BebidaBuilder(){
        bebidas = new Bebidas();
    }

    public static BebidaBuilder builder(){
        return new BebidaBuilder();
    }

    public BebidaBuilder withPreco(Long preco){
        bebidas.setPreco(preco);
        return this;
    }

    public BebidaBuilder withQuantidade(Long quantidade){
        bebidas.setQuantidade(quantidade);
        return this;
    }

    public BebidaBuilder withTeor(Long teor){
        bebidas.setTeor(teor);
        return this;
    }

    public BebidaBuilder withSabor(String sabor){
        bebidas.setSabor(sabor);
        return this;
    }


    public BebidaBuilder withNome(String nome){
        bebidas.setNome(nome);
        return this;
    }


    public BebidaBuilder withMarca(String marca){
        bebidas.setMarca(marca);
        return this;
    }

    public BebidaBuilder withCategoria(Categoria categoria){
        bebidas.setCategoria(categoria);
        return this;
    }

    public BebidaBuilder withIsglutem(Boolean isglutem){
        bebidas.setIsglutem(isglutem);
        return this;
    }


    public Bebidas build(){
        return  bebidas;
    }

}
