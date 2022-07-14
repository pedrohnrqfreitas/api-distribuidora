package com.distribuidorapixoca.demo.servico;

import com.distribuidorapixoca.demo.dto.TabacoDTO;
import com.distribuidorapixoca.demo.model.Tabaco;
import com.distribuidorapixoca.demo.repositorio.TabacoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TabacoServico {
    private TabacoRepositorio tabacoRepositorio;

    public TabacoServico(TabacoRepositorio tabacoRepositorio){this.tabacoRepositorio = tabacoRepositorio;};

    public List<Tabaco> getAllTabaco(){
        List<Tabaco> tabacos = tabacoRepositorio.findAll();
        return tabacos;
    }

    public TabacoDTO createTabaco(TabacoDTO pdt) {
        Tabaco tabacoEntidade = new Tabaco();
        tabacoEntidade.setPreco(pdt.getPreco());
        tabacoEntidade.setMarca(pdt.getMarca());
        tabacoEntidade.setNome(pdt.getNome());
        tabacoEntidade.setQuantidade(pdt.getQuantidade());
        tabacoEntidade.setGrama(pdt.getGrama());
        tabacoRepositorio.save(tabacoEntidade);
        return pdt;
    }

    public void deleteTabaco(Long id){
        tabacoRepositorio.deleteById(id);
    }

    public Tabaco updateTabacoQuant(Long quantidade, Long id){
        Optional<Tabaco> tabaco = tabacoRepositorio.findById(id);
        Tabaco novotabaco = new Tabaco();
        if(!tabaco.isEmpty()){
            novotabaco = tabaco.get();
            novotabaco.setQuantidade(quantidade);
            tabacoRepositorio.save(novotabaco);
        }
        return novotabaco;
    }


}



