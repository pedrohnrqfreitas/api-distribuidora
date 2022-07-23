package com.distribuidorapixoca.demo.servico.impl;

import com.distribuidorapixoca.demo.builder.BebidaBuilder;
import com.distribuidorapixoca.demo.dto.BebidasDTO;
import com.distribuidorapixoca.demo.model.Bebidas;
import com.distribuidorapixoca.demo.model.Categoria;
import com.distribuidorapixoca.demo.repositorio.BebidaRepostorio;
import com.distribuidorapixoca.demo.repositorio.CategoriaRepositorio;
import com.distribuidorapixoca.demo.servico.BebidasService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BebidasServicoImpl implements BebidasService {

    private BebidaRepostorio bebidaRepostorio;
    private CategoriaRepositorio categoriaRepositorio;

    public BebidasServicoImpl(BebidaRepostorio bebidaRepostorio, CategoriaRepositorio categoriaRepositorio){
        this.bebidaRepostorio = bebidaRepostorio;
        this.categoriaRepositorio = categoriaRepositorio;
    }

    public List<Bebidas> getAllBebidas(){

        return bebidaRepostorio.findAll();
    }


    public BebidasDTO createBebida(BebidasDTO pdt){
        Optional<Categoria> categoria = categoriaRepositorio.findById(pdt.getCategoria_id());
        if (categoria.isPresent()){
            Bebidas bebidaEntidade = BebidaBuilder.builder().withIsglutem(pdt.isIsglutem()).withMarca(pdt.getMarca()).withNome(pdt.getNome()).withSabor(pdt.getSabor()).withTeor(pdt.getTeor()).withQuantidade(pdt.getId()).withPreco(pdt.getPreco()).build();
            bebidaRepostorio.save(bebidaEntidade);
        }
        return pdt;
    }


    public void deleteBebida(Long id){
        bebidaRepostorio.deleteById(id);
    }

    public Bebidas updateBebidaQuant(Long quantidade, Long id){
        Optional<Bebidas> bebida = bebidaRepostorio.findById(id);
        Bebidas novabebida = new Bebidas();
        if(bebida.isPresent()){
            novabebida = bebida.get();
            novabebida.setQuantidade(quantidade);
            bebidaRepostorio.save(novabebida);
        }
        return novabebida;
    }
}
