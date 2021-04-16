package com.aprendepe.dao;

import com.aprendepe.exception.ResourceNotFoundException;
import com.aprendepe.model.api.RegistroUsuarioRequest;
import com.aprendepe.model.dao.Usuario;

public interface UsuarioDao {

    Usuario findById(Long userId) throws ResourceNotFoundException;

    Usuario save(Usuario usuario);

}
