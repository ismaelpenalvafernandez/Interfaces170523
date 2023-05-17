package com.softtek.modelo;

public class Barcaza extends Vehiculo implements Nautico{
    public String atracar() {
        return ("La barcaza esta atracando");
    }
    @Override
    public String navegar() {
        return ("La barcaza ha empezado a navegar");
    }
}