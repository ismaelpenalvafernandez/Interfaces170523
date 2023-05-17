package com.softtek.modelo;

public class Ave extends Animal implements ObjetoVolador {
    @Override
    public String despegar() {
        return "El ave despega.";
    }
    @Override
    public String aterrizar() {
        return "El ave aterriza.";
    }
    @Override
    public String volar() {
        return "El ave vuela.";
    }
    public String hacerNido() {
        return "El ave hace un nido.";
    }
    public String ponerHuevos() {
        return "El ave pone huevos.";
    }

    @Override
    public String Comer() {
        return super.Comer();
    }
}

