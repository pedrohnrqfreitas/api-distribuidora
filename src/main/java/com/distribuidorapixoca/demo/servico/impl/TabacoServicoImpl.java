package com.distribuidorapixoca.demo.servico.impl;

import com.distribuidorapixoca.demo.builder.TabacoBuilder;
import com.distribuidorapixoca.demo.dto.TabacoDTO;
import com.distribuidorapixoca.demo.model.Tabaco;
import com.distribuidorapixoca.demo.repositorio.TabacoRepositorio;
import com.distribuidorapixoca.demo.servico.TabacoServico;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TabacoServicoImpl implements TabacoServico {
    private TabacoRepositorio tabacoRepositorio;

    public TabacoServicoImpl(TabacoRepositorio tabacoRepositorio){this.tabacoRepositorio = tabacoRepositorio;};

    public List<Tabaco> getAllTabaco(){
        List<Tabaco> tabacos = tabacoRepositorio.findAll();
        return tabacos;
    }

    public TabacoDTO createTabaco(TabacoDTO pdt) {
        Tabaco tabacoEntidade = TabacoBuilder.builder().withNome(pdt.getNome()).withGrama(pdt.getGrama()).withMarca(pdt.getMarca()).withPreco(pdt.getPreco()).withQuantidade(pdt.getQuantidade()).build();
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



