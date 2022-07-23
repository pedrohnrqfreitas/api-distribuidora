package com.distribuidorapixoca.demo.servico;

import com.distribuidorapixoca.demo.dto.CategoriaDTO;
import com.distribuidorapixoca.demo.dto.CategoriaListDTO;
import com.distribuidorapixoca.demo.model.Categoria;

import java.util.List;

public interface CategoriaServico {
    public List<CategoriaListDTO> getAllCategorias();
    public CategoriaDTO createCategoria (CategoriaDTO pdt);
    public void deleteCategoria(Long id);
    public CategoriaDTO updateCategoriaNome(Long id, CategoriaDTO pdt);
    public Categoria findCategoriaById(Long id);
}
