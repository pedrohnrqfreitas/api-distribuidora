package com.distribuidorapixoca.demo.servico;

import com.distribuidorapixoca.demo.dto.CedaDTO;
import com.distribuidorapixoca.demo.model.Ceda;
import com.distribuidorapixoca.demo.repositorio.CedaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CedaServico {

    private CedaRepositorio cedaRepositorio;

    public CedaServico(CedaRepositorio cedaRepositorio){this.cedaRepositorio = cedaRepositorio;}

    public List<Ceda> getAllCedas(){
        List<Ceda> cedas = cedaRepositorio.findAll();
        return cedas;
    }

    public CedaDTO createCedas(CedaDTO pdt){
        Ceda cedaEntidade = new Ceda();
        cedaEntidade.setPreco(pdt.getPreco());
        cedaEntidade.setQuantidade(pdt.getQuantidade());
        cedaEntidade.setUnidade_caixa(pdt.getUnidade_caixa());
        cedaEntidade.setTipo(pdt.getTipo());
        cedaEntidade.setNome(pdt.getNome());
        cedaEntidade.setMarca(pdt.getMarca());
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
