package com.aprendepe.model.api;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RegistroUsuarioRequest {

    private String pass;
    private String nameUser;
    private String lastName;
    private String isActive;
    private String email;

}
