package com.distribuidorapixoca.demo.servico;

import com.distribuidorapixoca.demo.dto.UsuarioDTO;
import com.distribuidorapixoca.demo.request.UsuarioRequest;

public interface UsuarioServico {
    UsuarioDTO createUsuario(UsuarioRequest usuarioRequest);
}
