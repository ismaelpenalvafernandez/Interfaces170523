package com.softtek.modelo3;

import com.softtek.modelo3.Taller;


public class TallerPintura implements Taller {

    @Override
    public String reparar(Coche c) {

        return "Pintando coche con matricula " + c.getMatricula();
    }
}
