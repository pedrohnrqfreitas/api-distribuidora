package com.distribuidorapixoca.demo.dto;

import com.distribuidorapixoca.demo.model.Categoria;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
@Getter
@Setter
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

}
