package com.distribuidorapixoca.demo.servico;

import com.distribuidorapixoca.demo.dto.TabacoDTO;
import com.distribuidorapixoca.demo.model.Tabaco;

import java.util.List;

public interface TabacoServico {

    public List<Tabaco> getAllTabaco();
    public TabacoDTO createTabaco(TabacoDTO pdt);
    public void deleteTabaco(Long id);
    public Tabaco updateTabacoQuant(Long quantidade, Long id);
}
