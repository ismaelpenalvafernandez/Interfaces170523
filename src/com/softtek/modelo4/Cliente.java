package com.softtek.modelo4;

public class Cliente {
    String nombre;
    String NIF;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public Cliente(String nombre, String NIF) {
        this.nombre = nombre;
        this.NIF = NIF;

    }
}
