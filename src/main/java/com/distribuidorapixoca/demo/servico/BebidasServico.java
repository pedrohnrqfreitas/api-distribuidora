package com.distribuidorapixoca.demo.servico;

import com.distribuidorapixoca.demo.dto.BebidasDTO;
import com.distribuidorapixoca.demo.model.Bebidas;
import com.distribuidorapixoca.demo.model.Categoria;
import com.distribuidorapixoca.demo.repositorio.BebidaRepostorio;
import com.distribuidorapixoca.demo.repositorio.CategoriaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BebidasServico {

    private BebidaRepostorio bebidaRepostorio;
    private CategoriaRepositorio categoriaRepositorio;

    public BebidasServico(BebidaRepostorio bebidaRepostorio, CategoriaRepositorio categoriaRepositorio){
        this.bebidaRepostorio = bebidaRepostorio;
        this.categoriaRepositorio = categoriaRepositorio;
    }

    public List<Bebidas> getAllBebidas(){
        return bebidaRepostorio.findAll();
    }


    public BebidasDTO createBebida(BebidasDTO pdt){
        Optional<Categoria> categoria = categoriaRepositorio.findById(pdt.getCategoria_id());
        if (categoria.isPresent()){
            Bebidas bebidaEntidade = new Bebidas();
            bebidaEntidade.setPreco(pdt.getPreco());
            bebidaEntidade.setQuantidade(pdt.getQuantidade());
            bebidaEntidade.setTeor(pdt.getTeor());
            bebidaEntidade.setSabor(pdt.getSabor());
            bebidaEntidade.setNome(pdt.getNome());
            bebidaEntidade.setMarca(pdt.getMarca());
            bebidaEntidade.setIsglutem(true);
            bebidaEntidade.setCategoria(categoria.get());
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
