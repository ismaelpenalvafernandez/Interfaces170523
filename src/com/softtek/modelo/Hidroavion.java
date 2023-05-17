package com.softtek.modelo;

public class Hidroavion extends Avion implements Nautico{
    @Override
    public String atracar() {
        return ("El hidroavion esta atracando");
    }
    @Override
    public String navegar() {
        return ("El hidroavion ha empezado a navegar");
    }

    public String despegar() {
        return "El hidroavion esta despegando";
    }
    public String volar() {
        return "El hidroavion esta volando";
    }
    public String aterrizar() {
        return "El hidroavion esta aterrizando";
    }
}
