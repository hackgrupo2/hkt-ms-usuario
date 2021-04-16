package com.aprendepe.web;

import com.aprendepe.exception.ResourceNotFoundException;
import com.aprendepe.model.api.RegistroUsuarioRequest;
import com.aprendepe.model.api.RegistroUsuarioRespose;
import com.aprendepe.model.api.ValidarUsuarioRequest;
import com.aprendepe.model.api.ValidarUsuarioResponse;
import com.aprendepe.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/usuarios/v1")
public class Controller {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(path = "/validar", consumes = "application/json", produces = "application/json")
    public ValidarUsuarioResponse validar(@RequestBody ValidarUsuarioRequest validarUsuarioRequest)
            throws ResourceNotFoundException {

        return usuarioService.verifica(validarUsuarioRequest);

    }

    @PostMapping(path = "/registrar", consumes = "application/json", produces = "application/json")
    public Map<String, Boolean> registrar(@RequestBody RegistroUsuarioRequest registroUsuarioRequest)
            throws ResourceNotFoundException {

        return usuarioService.guardar(registroUsuarioRequest);

    }

}
