package com.distribuidorapixoca.demo.controlador;

import com.distribuidorapixoca.demo.dto.CedaDTO;
import com.distribuidorapixoca.demo.model.Ceda;
import com.distribuidorapixoca.demo.servico.Aimpl.CedaServicoImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ceda")
public class CedaControler {

    private CedaServicoImpl cedaServico;

    public CedaControler(CedaServicoImpl cedaServico){this.cedaServico = cedaServico;}

    @GetMapping("/all")
    public List<Ceda> getAllCeda(){
        return cedaServico.getAllCedas();
    }

    @PostMapping("/create-ceda")
    public CedaDTO createCedas(@RequestBody CedaDTO pdt){
        return cedaServico.createCedas(pdt);
    }

    @DeleteMapping("/delete-ceda/{id}")
    public void deleteCeda(@PathVariable Long id){
        cedaServico.deleteCeda(id);
    }

    @PutMapping("/update-ceda/{id}/{quantidade}")
    public Ceda updateCedaQuant(@PathVariable Long id, @PathVariable Long quantidade){
        return cedaServico.updateCedaQuant(quantidade,id);
    }








}




