package com.distribuidorapixoca.demo.controlador;

import com.distribuidorapixoca.demo.dto.TabacoDTO;
import com.distribuidorapixoca.demo.model.Tabaco;
import com.distribuidorapixoca.demo.servico.TabacoServico;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tabaco")
public class TabacoControler {

    private TabacoServico tabacoServico;

    public TabacoControler(TabacoServico tabacoServico) {this.tabacoServico = tabacoServico;}

    @GetMapping("/all")
    public List<Tabaco> getAllTabacos(){
        List<Tabaco> tabacos = tabacoServico.getAllTabaco();
        return tabacos;
    }

    @PostMapping("/create-tabacos")
    public TabacoDTO createTabaco(@RequestBody TabacoDTO pdt){
        return tabacoServico.createTabaco(pdt);
    }

    @DeleteMapping("/delete-tabaco/{id}")
    public void deleteTabaco(@PathVariable Long id){
        tabacoServico.deleteTabaco(id);
    }

    @PutMapping("/update-tabaco/{id}/{quantidade}")
    public Tabaco updateTabaco(@PathVariable Long id, @PathVariable Long quantidade){
        return tabacoServico.updateTabacoQuant(quantidade,id);
    }

}
