package com.distribuidorapixoca.demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class CedaDTO {

    private long id;

    private long preco;

    private long unidade;

    private long quantidade;

    private long unidade_caixa;

    private String tipo;

    private String nome;

    private String marca;
}
