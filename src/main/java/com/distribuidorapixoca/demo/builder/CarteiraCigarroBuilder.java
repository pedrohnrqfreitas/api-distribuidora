package com.distribuidorapixoca.demo.builder;

import com.distribuidorapixoca.demo.model.CarteiraCigarro;

public final class CarteiraCigarroBuilder {

    private CarteiraCigarro carteiraCigarro;

    private CarteiraCigarroBuilder(){
        carteiraCigarro = new CarteiraCigarro();
    }

    public static CarteiraCigarroBuilder builder(){
        return new CarteiraCigarroBuilder();
    }

    public CarteiraCigarroBuilder withPreco(Long preco){
        carteiraCigarro.setPreco(preco);
        return this;
    }

    public CarteiraCigarroBuilder withUnidade(Long unidade){
        carteiraCigarro.setUnidade(unidade);
        return this;
    }

    public CarteiraCigarroBuilder withQuantidade(Long quantidade){
        carteiraCigarro.setQuantidade(quantidade);
        return this;
    }

    public CarteiraCigarroBuilder withNome(String nome){
        carteiraCigarro.setNome(nome);
        return this;
    }

    public CarteiraCigarroBuilder withMarca(String marca){
        carteiraCigarro.setMarca(marca);
        return this;
    }



    public CarteiraCigarro build(){
        return carteiraCigarro;
    }
}
