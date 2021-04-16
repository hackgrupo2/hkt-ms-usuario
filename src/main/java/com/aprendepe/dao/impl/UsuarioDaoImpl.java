package com.aprendepe.dao.impl;

import com.aprendepe.dao.UsuarioDao;
import com.aprendepe.exception.ResourceNotFoundException;
import com.aprendepe.model.dao.Usuario;
import com.aprendepe.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioDaoImpl implements UsuarioDao {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario findById(Long userId) throws ResourceNotFoundException {
        Usuario usuario = usuarioRepository.findById(userId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Usuario no encontrado con este id :: " + userId));
        return usuario;
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.saveAndFlush(usuario);
    }
}
