package com.softtek.modelo3;

import com.softtek.modelo3.Taller;



public class TallerMecanica implements Taller {

    @Override
    public String reparar(Coche c) {

        return "Reparando vehiculo con matricula " + c.getMatricula();
    }
}
