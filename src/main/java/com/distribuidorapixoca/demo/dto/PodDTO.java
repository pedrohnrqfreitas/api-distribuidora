package com.distribuidorapixoca.demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;


public class PodDTO {
    private long id;
    private long preco;
    private String nome;
    private String sabor;
    private String marca;
    private long puffs;
    private boolean isDescartavel;

    private Long quantidade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPreco() {
        return preco;
    }

    public void setPreco(long preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public long getPuffs() {
        return puffs;
    }

    public void setPuffs(long puffs) {
        this.puffs = puffs;
    }

    public boolean getIsDescartavel() {
        return isDescartavel;
    }

    public void setIsDescartavel(boolean descartavel) {
        isDescartavel = descartavel;
    }

    public boolean isDescartavel() {
        return isDescartavel;
    }

    public void setDescartavel(boolean descartavel) {
        isDescartavel = descartavel;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }
}
