package com.distribuidorapixoca.demo.repositorio;

import com.distribuidorapixoca.demo.model.Bebidas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BebidaRepostorio extends JpaRepository <Bebidas, Long> {
    Boolean existsByNomeIgnoreCaseAndMarcaIgnoreCaseAndSaborIgnoreCase
            (String nome, String marca, String sabor);
}
