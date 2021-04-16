package com.aprendepe.model.dao;

import javax.persistence.*;

@Entity
@Table(name = "usuario", schema = "equipo2")
public class Usuario {

    private long userId;
    private String pass;
    private String nameUser;
    private String lastName;
    private String isActive;
    private String email;
    private String registration_date;

    public Usuario() {
    }

    public Usuario(String pass, String nameUser, String lastName, String isActive, String email, String registration_date) {
        this.pass = pass;
        this.nameUser = nameUser;
        this.lastName = lastName;
        this.isActive = isActive;
        this.email = email;
        this.registration_date = registration_date;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getUserId() {

        return userId;
    }
    public void setUserId(long userId) {

        this.userId = userId;
    }

    @Column(name = "pass", nullable = false)
    public String getPass() {

        return pass;
    }
    public void setPass(String pass) {

        this.pass = pass;
    }

    @Column(name = "nameUser", nullable = false)
    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    @Column(name = "lastName", nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "isActive", nullable = false)
    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "registration_date", nullable = false)
    public String getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(String registration_date) {
        this.registration_date = registration_date;
    }
}
