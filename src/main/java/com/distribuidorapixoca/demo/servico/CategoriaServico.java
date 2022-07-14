package com.distribuidorapixoca.demo.servico;

import com.distribuidorapixoca.demo.dto.CategoriaDTO;
import com.distribuidorapixoca.demo.dto.CategoriaListDTO;
import com.distribuidorapixoca.demo.model.Categoria;
import com.distribuidorapixoca.demo.repositorio.CategoriaRepositorio;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServico {

    private CategoriaRepositorio categoriaRepositorio;

    public CategoriaServico(CategoriaRepositorio categoriaRepositorio){
        this.categoriaRepositorio = categoriaRepositorio;
    }

    public List<CategoriaListDTO> getAllCategorias(){
        List<Categoria> categorias = categoriaRepositorio.findAll();
        List<CategoriaListDTO> listaDto = new ArrayList<>();
        categorias.forEach(categoria -> {
            listaDto.add(new CategoriaListDTO(categoria.getId(), categoria.getNome()));
        });
        return listaDto;
    }

    public CategoriaDTO createCategoria (CategoriaDTO pdt){
        Categoria categoriaEntidade = new Categoria();
        categoriaEntidade.setNome(pdt.getNome());
        categoriaRepositorio.save(categoriaEntidade);
        return pdt;
    }

    public void deleteCategoria(Long id){
        categoriaRepositorio.deleteById(id);
    }

    public CategoriaDTO updateCategoriaNome(Long id, CategoriaDTO pdt){
        Optional<Categoria> categoria = categoriaRepositorio.findById(id);
        Categoria novacategoria = new Categoria();
        if(categoria.isPresent()){
            novacategoria = categoria.get();
            novacategoria.setNome(pdt.getNome());
            categoriaRepositorio.save(novacategoria);
        }
        return pdt ;
    }

    public Categoria findCategoriaById(Long id){
        Optional<Categoria> categoria = categoriaRepositorio.findById(id);
        if (categoria.isPresent()){
            return categoria.get();
        }
        return null;
    }



}
