package com.hospital.infonurse.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nurse {

    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("username")
    private String apellido;
    
    @JsonProperty("password")
    private String password;

    public Nurse(String nombre, String username, String password) {
        this.nombre = nombre;
        this.password = username;
        this.apellido = password;
    }
}
