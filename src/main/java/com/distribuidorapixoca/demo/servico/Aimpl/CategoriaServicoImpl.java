package com.distribuidorapixoca.demo.servico.Aimpl;

import com.distribuidorapixoca.demo.builder.CategoriaBuilder;
import com.distribuidorapixoca.demo.dto.CategoriaDTO;
import com.distribuidorapixoca.demo.dto.CategoriaListDTO;
import com.distribuidorapixoca.demo.model.Categoria;
import com.distribuidorapixoca.demo.repositorio.CategoriaRepositorio;
import com.distribuidorapixoca.demo.servico.CategoriaServico;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServicoImpl implements CategoriaServico {

    private CategoriaRepositorio categoriaRepositorio;

    public CategoriaServicoImpl(CategoriaRepositorio categoriaRepositorio){
        this.categoriaRepositorio = categoriaRepositorio;
    }


    @Override
    public List<CategoriaListDTO> getAllCategorias() {
        List<Categoria> categorias = categoriaRepositorio.findAll();
        List<CategoriaListDTO> listaDto = new ArrayList<>();
        categorias.forEach(categoria -> {
            listaDto.add(new CategoriaListDTO(categoria.getId(), categoria.getNome()));
        });
        return listaDto;
    }

    @Override
    public CategoriaDTO createCategoria(CategoriaDTO pdt) {
        Categoria categoriaEntidade = CategoriaBuilder.builder().withNome(pdt.getNome()).build();
        categoriaRepositorio.save(categoriaEntidade);
        return pdt;
    }

    @Override
    public void deleteCategoria(Long id) {
        categoriaRepositorio.deleteById(id);
    }

    @Override
    public CategoriaDTO updateCategoriaNome(Long id, CategoriaDTO pdt) {
        Optional<Categoria> categoria = categoriaRepositorio.findById(id);
        Categoria novacategoria = new Categoria();
        if(categoria.isPresent()){
            novacategoria = categoria.get();
            novacategoria.setNome(pdt.getNome());
            categoriaRepositorio.save(novacategoria);
        }
        return pdt ;
    }

    @Override
    public Categoria findCategoriaById(Long id) {
        Optional<Categoria> categoria = categoriaRepositorio.findById(id);
        if (categoria.isPresent()){
            return categoria.get();
        }
        return null;
    }
}
