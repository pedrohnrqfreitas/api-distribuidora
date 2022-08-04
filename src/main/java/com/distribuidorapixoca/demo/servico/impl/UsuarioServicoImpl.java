package com.distribuidorapixoca.demo.servico.impl;

import com.distribuidorapixoca.demo.dto.UsuarioDTO;
import com.distribuidorapixoca.demo.model.EnumPerfil;
import com.distribuidorapixoca.demo.model.Perfil;
import com.distribuidorapixoca.demo.model.Usuario;
import com.distribuidorapixoca.demo.repositorio.UsuarioRepositorio;
import com.distribuidorapixoca.demo.request.UsuarioRequest;
import com.distribuidorapixoca.demo.servico.PerfilServico;
import com.distribuidorapixoca.demo.servico.UsuarioServico;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class UsuarioServicoImpl implements UsuarioServico {

    private final PasswordEncoder passwordEncoder;

    private final UsuarioRepositorio usuarioRepositorio;

    private final PerfilServico perfilServico;

    public UsuarioServicoImpl(PasswordEncoder passwordEncoder, UsuarioRepositorio usuarioRepositorio, PerfilServico perfilServico) {
        this.passwordEncoder = passwordEncoder;
        this.usuarioRepositorio = usuarioRepositorio;
        this.perfilServico = perfilServico;
    }

    @Override
    public UsuarioDTO createUsuario(UsuarioRequest usuarioRequest) {

        Perfil perfil = perfilServico.getOrCreatePerfil(EnumPerfil.ROLE_USER);
        Usuario usuarioEntidade = new Usuario();
        usuarioEntidade.setUsername(usuarioRequest.getUsername());
        usuarioEntidade.setSenha(passwordEncoder.encode(usuarioRequest.getSenha()));
        usuarioEntidade.getPerfis().add(perfil);
        usuarioEntidade = usuarioRepositorio.save(usuarioEntidade);

        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setId(usuarioEntidade.getId());
        usuarioDTO.setUsername(usuarioEntidade.getUsername());
        usuarioEntidade.getPerfis().forEach(p -> usuarioDTO.getPerfis().add(p.getAuthority()));

        return usuarioDTO;
    }
}
