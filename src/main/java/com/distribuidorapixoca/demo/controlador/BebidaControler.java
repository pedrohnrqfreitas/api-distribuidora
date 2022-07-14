package com.distribuidorapixoca.demo.controlador;

import com.distribuidorapixoca.demo.dto.BebidasDTO;
import com.distribuidorapixoca.demo.model.Bebidas;
import com.distribuidorapixoca.demo.repositorio.BebidaRepostorio;
import com.distribuidorapixoca.demo.servico.BebidasServico;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bebidas")
public class BebidaControler {

    private BebidasServico bebidasServico;

    public BebidaControler(BebidasServico bebidasServico){
        this.bebidasServico = bebidasServico;
    }

    @GetMapping("/all")
    public List<Bebidas> getAllBebida() {
        return bebidasServico.getAllBebidas();
    }

    @PostMapping("/create-bebidas")
    public BebidasDTO createBebidas(@RequestBody BebidasDTO pdt){
        return bebidasServico.createBebida(pdt);
    }

    @DeleteMapping("/delete-bebida/{id}")
    public void deleteBebida(@PathVariable Long id){
        bebidasServico.deleteBebida(id);
    }

    @PutMapping("/update-bebida/{id}/{quantidade}")
    public Bebidas updateBebidaQuant(@PathVariable Long id,@PathVariable Long quantidade){
        return bebidasServico.updateBebidaQuant(quantidade,id);
    }

}
