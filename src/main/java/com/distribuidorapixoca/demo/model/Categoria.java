package com.distribuidorapixoca.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Table(name = "categoria")
@Getter
@Setter
@Entity
public class Categoria {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "categoria",fetch = FetchType.EAGER)
    private List<Bebidas> bebidas;
}
