package com.aprendepe.model.api;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ValidarUsuarioRequest {

    private String correo;
    private String password;

}
