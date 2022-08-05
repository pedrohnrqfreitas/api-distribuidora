package com.distribuidorapixoca.demo.dto;

import com.distribuidorapixoca.demo.model.Bebidas;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BebidasDTO {

    private long id;

    private long preco;

    private long quantidade;

    private long teor;

    private String sabor;

    private String nome;

    private String marca;

    private boolean isglutem;

    private Long categoria_id;

    public BebidasDTO(Bebidas bebida) {
        this.id = bebida.getId();
        this.nome = bebida.getNome();
        this.sabor = bebida.getSabor();
        this.quantidade = bebida.getQuantidade();
        this.preco = bebida.getPreco();
        this.teor = bebida.getTeor();
        this.marca = bebida.getMarca();
        this.isglutem = bebida.isIsglutem();
        this.categoria_id = bebida.getCategoria().getId();


    }

}
