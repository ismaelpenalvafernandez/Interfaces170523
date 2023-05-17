package com.softtek.modelo;

public class Superman extends Kriptoniano implements ObjetoVolador {
    @Override
    public String despegar() {
        return "Superman despega.";
    }
    @Override
    public String aterrizar() {
        return "Superman aterriza.";
    }
    @Override
    public String volar() {
        return "Superman vuela.";
    }
    public String saltarEdificio() {
        return "Superman salta un edificio.";
    }
    public String detenerBala() {
        return "Superman detiene una bala.";
    }
    public String Comer() {
        return super.Comer();
    }
}


