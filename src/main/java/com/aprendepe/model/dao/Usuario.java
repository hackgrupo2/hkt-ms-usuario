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

    public Usuario() {
    }

    public Usuario(String pass, String nameUser, String lastName, String isActive, String email ) {
        this.pass = pass;
        this.nameUser = nameUser;
        this.lastName = lastName;
        this.isActive = isActive;
        this.email = email;
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


}
