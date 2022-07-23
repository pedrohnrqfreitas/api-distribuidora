package com.distribuidorapixoca.demo.servico;

import com.distribuidorapixoca.demo.dto.CedaDTO;
import com.distribuidorapixoca.demo.model.Ceda;

import java.util.List;

public interface CedaServico {
    public List<Ceda> getAllCedas();
    public CedaDTO createCedas(CedaDTO pdt);
    public void deleteCeda(Long id);
    public Ceda updateCedaQuant(Long quantidade, Long id);
}
