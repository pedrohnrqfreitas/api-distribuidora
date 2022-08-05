package com.distribuidorapixoca.demo.dto;

import com.distribuidorapixoca.demo.model.CarteiraCigarro;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarteiraDeCigarroDTO {

    private Long id;
    private Long preco;
    private Long unidade;
    private Long quantidade;
    private String nome;
    private String marca;

    public CarteiraDeCigarroDTO(final CarteiraCigarro carteiraCigarro){
        id = carteiraCigarro.getId();
        preco = carteiraCigarro.getPreco();
        unidade = carteiraCigarro.getUnidade();
        quantidade = carteiraCigarro.getQuantidade();
        nome = carteiraCigarro.getNome();
        marca = carteiraCigarro.getMarca();
    }
}
