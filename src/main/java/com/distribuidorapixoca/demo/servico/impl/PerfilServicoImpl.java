package com.distribuidorapixoca.demo.servico.impl;

import com.distribuidorapixoca.demo.model.EnumPerfil;
import com.distribuidorapixoca.demo.model.Perfil;
import com.distribuidorapixoca.demo.repositorio.PerfilRepositorio;
import com.distribuidorapixoca.demo.servico.PerfilServico;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PerfilServicoImpl implements PerfilServico {

    private final PerfilRepositorio perfilRepositorio;

    public PerfilServicoImpl(PerfilRepositorio perfilRepositorio) {
        this.perfilRepositorio = perfilRepositorio;
    }

    @Override
    public Perfil getOrCreatePerfil(EnumPerfil enumPerfil) {
        Optional<Perfil> perfil = perfilRepositorio.findByNome(enumPerfil);

        if(perfil.isEmpty()){
            return perfilRepositorio.save(new Perfil(enumPerfil));
        }

        return perfil.get();
    }
}
