package com.distribuidorapixoca.demo.repositorio;

import com.distribuidorapixoca.demo.model.CarteiraCigarro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteiraDeCigarroRepositorio extends JpaRepository <CarteiraCigarro, Long>{
    Boolean existsByNomeIgnoreCaseAndMarcaIgnoreCase
            (String nome, String marca);
}
