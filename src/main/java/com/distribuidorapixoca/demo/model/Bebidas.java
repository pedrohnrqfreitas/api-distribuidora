package com.distribuidorapixoca.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "bebida")
@Getter
@Setter
@Entity
public class Bebidas {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "preco")
    private long preco;

    @Column(name = "quantidade")
    private long quantidade;

    @Column(name = "teor")
    private long teor;

    @Column(name = "sabor")
    private String sabor;

    @Column(name = "nome")
    private String nome;

    @Column(name = "marca")
    private String marca;

    @Column(name = "glutem")
    private boolean isglutem;

    @ManyToOne(targetEntity = Categoria.class, optional = false )
    private Categoria categoria;


}
