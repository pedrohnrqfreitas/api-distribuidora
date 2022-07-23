package com.distribuidorapixoca.demo.controlador;

import com.distribuidorapixoca.demo.dto.CategoriaDTO;
import com.distribuidorapixoca.demo.dto.CategoriaListDTO;
import com.distribuidorapixoca.demo.model.Categoria;
import com.distribuidorapixoca.demo.servico.CategoriaServico;
import com.distribuidorapixoca.demo.servico.impl.CategoriaServicoImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaControler {

    private CategoriaServico categoriaServico;

    public CategoriaControler(CategoriaServico categoriaServico){
        this.categoriaServico = categoriaServico;
    }

    @GetMapping("/all")
    public List<CategoriaListDTO> getAllCategoria(){
        return categoriaServico.getAllCategorias();
    }

    @PostMapping("/create-categoria")
    public CategoriaDTO createCategoria(@RequestBody CategoriaDTO pdt){
        return categoriaServico.createCategoria(pdt);
    }

    @DeleteMapping("/delete-categoria/{id}")
    public void deleteCategoria(@PathVariable Long id){
        categoriaServico.deleteCategoria(id);
    }

    @PutMapping("/update-categoria/{id}")
    public CategoriaDTO updateCategoria(@PathVariable Long id,@RequestBody CategoriaDTO pdt){
        return categoriaServico.updateCategoriaNome(id, pdt);
    }

    @GetMapping("/find-by-id/{id}")
    public Categoria getById(@PathVariable Long id){
        return categoriaServico.findCategoriaById(id);
    }
}
