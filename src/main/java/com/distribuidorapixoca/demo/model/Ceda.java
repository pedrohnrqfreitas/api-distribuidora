package com.distribuidorapixoca.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table (name = "ceda")
@Getter
@Setter
@Entity
public class Ceda {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "preco")
    private long preco;

    @Column(name = "quantidade")
    private long quantidade;

    @Column(name = "unidade_caixa")
    private long unidade_caixa;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "nome")
    private String nome;

    @Column(name = "marca")
    private String marca;
}
