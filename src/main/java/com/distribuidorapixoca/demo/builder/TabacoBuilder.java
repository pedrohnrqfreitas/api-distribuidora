package com.distribuidorapixoca.demo.builder;

import com.distribuidorapixoca.demo.model.Tabaco;

public final class TabacoBuilder {

    private Tabaco tabaco;

    private TabacoBuilder(){
        tabaco = new Tabaco();
    }

    public static TabacoBuilder builder(){
        return new TabacoBuilder();
    }

    public TabacoBuilder withNome(String nome){
        tabaco.setNome(nome);
        return this;
    }

    public TabacoBuilder withPreco(Long preco){
        tabaco.setPreco(preco);
        return this;
    }

    public TabacoBuilder withQuantidade(Long quantidade){
        tabaco.setQuantidade(quantidade);
        return this;
    }

    public TabacoBuilder withGrama(Long grama){
        tabaco.setGrama(grama);
        return this;
    }

    public TabacoBuilder withMarca(String marca){
        tabaco.setMarca(marca);
        return this;
    }


    public Tabaco build(){
        return tabaco;
    }
}
