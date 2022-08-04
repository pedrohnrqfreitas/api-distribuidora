package com.distribuidorapixoca.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class UsuarioDTO {

    private Long id ;

    private List<String> perfis = new ArrayList<>();

    private String username;

}
