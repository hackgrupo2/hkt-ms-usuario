package com.aprendepe.service;

import com.aprendepe.exception.ResourceNotFoundException;
import com.aprendepe.model.api.RegistroUsuarioRequest;
import com.aprendepe.model.api.ValidarUsuarioRequest;
import com.aprendepe.model.api.ValidarUsuarioResponse;

import java.util.Map;


public interface UsuarioService {

    ValidarUsuarioResponse verifica(ValidarUsuarioRequest validarUsuarioRequest) throws ResourceNotFoundException;

    Map<String, Boolean> guardar(RegistroUsuarioRequest registroUsuarioRequest) throws ResourceNotFoundException;

}
