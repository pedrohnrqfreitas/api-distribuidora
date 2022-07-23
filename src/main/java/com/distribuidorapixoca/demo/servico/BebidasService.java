package com.distribuidorapixoca.demo.servico;

import com.distribuidorapixoca.demo.dto.BebidasDTO;
import com.distribuidorapixoca.demo.model.Bebidas;

import java.util.List;

public interface BebidasService {
    public List<Bebidas> getAllBebidas();
    public BebidasDTO createBebida(BebidasDTO pdt);
    public void deleteBebida(Long id);
    public Bebidas updateBebidaQuant(Long quantidade, Long id);
}
