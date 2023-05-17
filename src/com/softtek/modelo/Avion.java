package com.softtek.modelo;

public class Avion extends Vehiculo implements ObjetoVolador {
    @Override
    public String despegar() {
        return "El avión despega.";
    }

    @Override
    public String aterrizar() {
        return "El avión aterriza.";
    }

    @Override
    public String volar() {
        return "El avión vuela.";
    }
}

