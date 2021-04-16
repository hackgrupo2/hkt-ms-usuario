package com.aprendepe.web;

import com.aprendepe.model.api.ValidarUsuarioRequest;
import com.aprendepe.model.api.ValidarUsuarioResponse;
import com.aprendepe.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios/v1")
public class Controller {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(path = "/validar", consumes = "application/json", produces = "application/json")
    public ValidarUsuarioResponse validar(@RequestBody ValidarUsuarioRequest validarUsuarioRequest) {

        return usuarioService.verifica(validarUsuarioRequest);

    }

/*
    @PostMapping(path = "/registrar", consumes = "application/json", produces = "application/json")
    public UsuarioRespose registrar(@RequestBody UsuarioRequest usuarioRequest) {

        return usuarioService.guardar(employee);

    }
*/
}
