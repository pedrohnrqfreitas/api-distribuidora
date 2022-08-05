package com.distribuidorapixoca.demo.controlador;

import com.distribuidorapixoca.demo.dto.BebidasDTO;
import com.distribuidorapixoca.demo.model.Bebidas;
import com.distribuidorapixoca.demo.servico.Aimpl.BebidasServicoImpl;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bebidas")
@PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
public class BebidaControler {

    private BebidasServicoImpl bebidasServico;

    public BebidaControler(BebidasServicoImpl bebidasServico){
        this.bebidasServico = bebidasServico;
    }

    @GetMapping("/all")
    public BebidasDTO getAllBebida() {
        List<Bebidas> teste1 = bebidasServico.getAllBebidas();
        BebidasDTO teste = new BebidasDTO(teste1.get(0));
        return teste;
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
