package com.distribuidorapixoca.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table (name = "carteiraCigarro")
@Getter
@Setter
@Entity
public class CarteiraCigarro {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "preco")
    private long preco;

    @Column(name = "unidade")
    private long unidade;

    @Column(name = "quantidade")
    private long quantidade;

    @Column(name = "nome")
    private String nome;

    @Column(name = "marca")
    private String marca;



}
