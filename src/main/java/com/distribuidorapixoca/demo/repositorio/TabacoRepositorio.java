package com.distribuidorapixoca.demo.repositorio;

import com.distribuidorapixoca.demo.model.Tabaco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TabacoRepositorio extends JpaRepository<Tabaco,Long> {
}
