package com.distribuidorapixoca.demo.servico;

import com.distribuidorapixoca.demo.model.EnumPerfil;
import com.distribuidorapixoca.demo.model.Perfil;

public interface PerfilServico {
    Perfil getOrCreatePerfil(EnumPerfil enumPerfil);
}
