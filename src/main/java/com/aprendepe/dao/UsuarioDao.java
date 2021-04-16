package com.aprendepe.dao;

import com.aprendepe.exception.ResourceNotFoundException;
import com.aprendepe.model.api.RegistroUsuarioRequest;
import com.aprendepe.model.api.ValidarUsuarioRequest;
import com.aprendepe.model.dao.Usuario;

public interface UsuarioDao {

    Usuario findByEmailAndPass(ValidarUsuarioRequest validarUsuarioRequest) throws ResourceNotFoundException;

    Usuario save(Usuario usuario);

}
