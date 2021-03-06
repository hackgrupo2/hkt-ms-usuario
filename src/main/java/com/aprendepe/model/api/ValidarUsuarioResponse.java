package com.aprendepe.model.api;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ValidarUsuarioResponse {

    private long userId;
    private String nameUser;
    private String lastName;
    private String isActive;
    private String email;
    private String registration_date;

}
