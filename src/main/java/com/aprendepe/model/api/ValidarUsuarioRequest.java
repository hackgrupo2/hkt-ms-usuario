package com.aprendepe.model.api;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ValidarUsuarioRequest {

    private long user;
    private String pass;

}
