package com.distribuidorapixoca.demo.builder;

import com.distribuidorapixoca.demo.model.Pod;

public final class PodBuilder {

    private Pod pod ;

    private PodBuilder(){
        pod = new Pod();
    }

    public static PodBuilder builder(){
        return new PodBuilder();
    }

    public PodBuilder withNome(String nome){
        pod.setNome(nome);
        return this;
    }
    public PodBuilder withPreco(Long preco){
        pod.setPreco(preco);
        return this;
    }

    public PodBuilder withSabor(String sabor){
        pod.setSabor(sabor);
        return this;
    }

    public PodBuilder withQuantidade(Long quantidade){
        pod.setQuantidade(quantidade);
        return this;
    }

    public PodBuilder withMarca(String marca){
        pod.setMarca(marca);
        return this;
    }

    public PodBuilder withPuffs(Long puffs){
        pod.setPuffs(puffs);
        return this;
    }

    public PodBuilder withIsDescatavel(Boolean isDescatavel){
        pod.setDescartavel(isDescatavel);
        return this;
    }





    public Pod build(){

        return pod ;
    }
}
