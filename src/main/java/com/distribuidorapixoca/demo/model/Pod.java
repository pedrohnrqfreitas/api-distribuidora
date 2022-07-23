package com.distribuidorapixoca.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pod")
@Getter
@Setter
public class Pod {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "preco")
    private long preco;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sabor")
    private String sabor;

    @Column(name = "quantidade")
    private long quantidade;

    @Column(name = "marca")
    private String marca;

    @Column(name = "puffs")
    private long puffs;

    @Column(name = "descartavel")
    private boolean isDescartavel;

}

