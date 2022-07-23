package com.distribuidorapixoca.demo.builder;

import com.distribuidorapixoca.demo.model.Ceda;

public final class CedaBuilder {

    private Ceda ceda;

    private CedaBuilder(){
        ceda = new Ceda();
    }

    public static CedaBuilder builder(){
        return new CedaBuilder();
    }

    public CedaBuilder withNome(String nome){
        ceda.setNome(nome);
        return this;
    }

    public CedaBuilder withPreco(Long preco){
        ceda.setPreco(preco);
        return this;
    }

    public CedaBuilder withQuantidade(Long quantidade){
        ceda.setQuantidade(quantidade);
        return this;
    }

    public CedaBuilder withUnidadeCaixa(Long unidadeCaixa){
        ceda.setUnidade_caixa(unidadeCaixa);
        return this;
    }

    public CedaBuilder withTipo(String tipo){
        ceda.setTipo(tipo);
        return this;
    }

    public CedaBuilder withMarca(String marca){
        ceda.setMarca(marca);
        return this;
    }


    public Ceda build(){
        return ceda;
    }
}
