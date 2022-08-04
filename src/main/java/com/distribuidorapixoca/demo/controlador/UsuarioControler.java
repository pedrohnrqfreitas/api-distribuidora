package com.distribuidorapixoca.demo.controlador;

import com.distribuidorapixoca.demo.dto.UsuarioDTO;
import com.distribuidorapixoca.demo.request.UsuarioRequest;
import com.distribuidorapixoca.demo.servico.UsuarioServico;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioControler {

    private final UsuarioServico usuarioServico;

    public UsuarioControler(UsuarioServico usuarioServico) {
        this.usuarioServico = usuarioServico;
    }

    @PostMapping("/create-usuario")
    public ResponseEntity<UsuarioDTO> createUsuario(@RequestBody UsuarioRequest usuarioRequest ){
        UsuarioDTO usuarioDTO = usuarioServico.createUsuario(usuarioRequest);
        return new ResponseEntity<>(usuarioDTO, HttpStatus.CREATED);
    }
}
