package com.aprendepe.model.dao;

import javax.persistence.*;

@Entity
@Table(name = "usuario", schema = "equipo2")
public class Usuario {

    private long id;
    private String password;
    private String nameUser;
    private String lastName;
    private String isActive;
    private String email;

    public Usuario() {
    }

    public Usuario(String password, String nameUser, String lastName, String isActive, String email ) {
        this.password = password;
        this.nameUser = nameUser;
        this.lastName = lastName;
        this.isActive = isActive;
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {

        return id;
    }
    public void setId(long id) {

        this.id = id;
    }

    @Column(name = "pass_user", nullable = false)
    public String getPassword() {

        return password;
    }
    public void setPassword(String password) {

        this.password = password;
    }

    @Column(name = "name_user", nullable = false)
    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "is_active", nullable = false)
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
