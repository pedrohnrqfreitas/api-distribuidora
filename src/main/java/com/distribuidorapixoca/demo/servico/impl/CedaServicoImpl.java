package com.distribuidorapixoca.demo.servico.impl;

import com.distribuidorapixoca.demo.builder.CedaBuilder;
import com.distribuidorapixoca.demo.dto.CedaDTO;
import com.distribuidorapixoca.demo.model.Ceda;
import com.distribuidorapixoca.demo.repositorio.CedaRepositorio;
import com.distribuidorapixoca.demo.servico.CedaServico;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CedaServicoImpl implements CedaServico {

    private CedaRepositorio cedaRepositorio;

    public CedaServicoImpl(CedaRepositorio cedaRepositorio){this.cedaRepositorio = cedaRepositorio;}

    public List<Ceda> getAllCedas(){
        List<Ceda> cedas = cedaRepositorio.findAll();
        return cedas;
    }

    public CedaDTO createCedas(CedaDTO pdt){
        Ceda cedaEntidade = CedaBuilder.builder().withNome(pdt.getNome()).withMarca(pdt.getMarca()).withTipo(pdt.getTipo()).withUnidadeCaixa(pdt.getUnidade_caixa()).withQuantidade(pdt.getQuantidade()).withPreco(pdt.getPreco()).build();
        cedaRepositorio.save(cedaEntidade);
        return pdt;
    }

    public void deleteCeda(Long id){cedaRepositorio.deleteById(id);}

    public Ceda updateCedaQuant(Long quantidade, Long id){
        Optional<Ceda> ceda = cedaRepositorio.findById(id);
        Ceda novaceda = new Ceda();
        if (ceda.isPresent()){
            novaceda = ceda.get();
            novaceda.setQuantidade(quantidade);
            cedaRepositorio.save(novaceda);
        }
        return novaceda;
    }
}
