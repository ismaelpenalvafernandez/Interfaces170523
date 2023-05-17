package com.softtek.modelo2;


public class Conductor {
    Vehiculo v;
    public Conductor(Vehiculo v) {
        this.v = v;
    }
    public String Conducir() {
        return v.moverse();
    }
}
