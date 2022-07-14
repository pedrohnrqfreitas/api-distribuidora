package com.distribuidorapixoca.demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
@Setter
@Getter
public class TabacoDTO {

    private long id;

    private long preco;

    private long quantidade;

    private long grama;

    private String nome;

    private String marca;

}

