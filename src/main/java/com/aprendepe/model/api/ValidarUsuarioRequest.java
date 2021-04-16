package com.aprendepe.model.api;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ValidarUsuarioRequest {

    private Long id;
    private String user;
    private String pass;

}
