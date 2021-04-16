package com.aprendepe.service.impl;

import com.aprendepe.dao.UsuarioDao;
import com.aprendepe.exception.ResourceNotFoundException;
import com.aprendepe.model.api.RegistroUsuarioRequest;
import com.aprendepe.model.api.ValidarUsuarioRequest;
import com.aprendepe.model.api.ValidarUsuarioResponse;
import com.aprendepe.model.dao.Usuario;
import com.aprendepe.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public ValidarUsuarioResponse verifica(ValidarUsuarioRequest validarUsuarioRequest) throws ResourceNotFoundException {

        Usuario usuario = usuarioDao.findById(validarUsuarioRequest.getId());

        return ValidarUsuarioResponse.builder()
                .userId(usuario.getUserId())
                .nameUser(usuario.getNameUser())
                .lastName(usuario.getLastName())
                .isActive(usuario.getIsActive())
                .email(usuario.getEmail())
                .build();

    }

    @Override
    public Map<String, Boolean> guardar(RegistroUsuarioRequest registroUsuarioRequest) throws ResourceNotFoundException{

        Usuario usuario = new Usuario();
        usuario.setPass(registroUsuarioRequest.getPass());
        usuario.setNameUser(registroUsuarioRequest.getNameUser());
        usuario.setLastName(registroUsuarioRequest.getLastName());
        usuario.setIsActive(registroUsuarioRequest.getIsActive());
        usuario.setEmail(registroUsuarioRequest.getEmail());

        Usuario nuevoUsuario = usuarioDao.save(usuario);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Registrar", Boolean.TRUE);
        return response;
    }


}
