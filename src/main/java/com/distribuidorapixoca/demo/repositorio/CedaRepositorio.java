package com.distribuidorapixoca.demo.repositorio;

import com.distribuidorapixoca.demo.model.Ceda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CedaRepositorio extends JpaRepository <Ceda, Long> {
    Boolean existsByNomeIgnoreCaseAndMarcaIgnoreCaseAndTipoIgnoreCase
            (String nome, String marca, String tipo);
}
