package com.softtek.modelo2;

public class Coche implements Vehiculo {
    int deposito;

    public Coche(int deposito) {
        this.deposito = deposito;
    }

    @Override
    public String moverse() {
        if (deposito > 0) {
            return "El coche se está moviendo.";
        } else {
            return "El coche no tiene gasolina.";
        }
    }
}

