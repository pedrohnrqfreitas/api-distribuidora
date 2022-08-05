package com.distribuidorapixoca.demo.repositorio;

import com.distribuidorapixoca.demo.model.Pod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodRepositorio extends JpaRepository<Pod, Long> {

   Boolean existsByNomeIgnoreCaseAndSaborIgnoreCase(String nome, String sabor);

}
