package com.aprendepe.service;

import com.aprendepe.model.api.ValidarUsuarioRequest;
import com.aprendepe.model.api.ValidarUsuarioResponse;


public interface UsuarioService {

    ValidarUsuarioResponse verifica(ValidarUsuarioRequest validarUsuarioRequest);

}
