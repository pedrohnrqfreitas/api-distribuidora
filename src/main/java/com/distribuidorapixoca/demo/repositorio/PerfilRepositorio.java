package com.distribuidorapixoca.demo.repositorio;

import com.distribuidorapixoca.demo.model.EnumPerfil;
import com.distribuidorapixoca.demo.model.Perfil;
import lombok.extern.java.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PerfilRepositorio extends JpaRepository<Perfil, Long> {
    Optional<Perfil> findByNome (EnumPerfil enumPerfil);
}
