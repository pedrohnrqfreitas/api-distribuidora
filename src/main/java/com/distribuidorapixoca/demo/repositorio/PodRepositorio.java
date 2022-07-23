package com.distribuidorapixoca.demo.repositorio;

import com.distribuidorapixoca.demo.model.Pod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PodRepositorio extends JpaRepository<Pod, Long> {

   Pod findByNomeAndSabor(String nome, String sabor);

}
