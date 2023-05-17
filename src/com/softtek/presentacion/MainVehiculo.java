package com.softtek.presentacion;

import com.softtek.modelo2.Coche;
import com.softtek.modelo2.Conductor;

public class MainVehiculo {
    public static void main(String[] args) {
        Coche coche = new Coche(5);
        Conductor conductor = new Conductor(coche);
        System.out.println(conductor.Conducir());
    }
}
