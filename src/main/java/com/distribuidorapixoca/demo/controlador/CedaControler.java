package com.distribuidorapixoca.demo.controlador;

import com.distribuidorapixoca.demo.dto.CedaDTO;
import com.distribuidorapixoca.demo.model.Ceda;
import com.distribuidorapixoca.demo.servico.CedaServico;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ceda")
public class CedaControler {

    private CedaServico cedaServico;

    public CedaControler(CedaServico cedaServico){this.cedaServico = cedaServico;}

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



