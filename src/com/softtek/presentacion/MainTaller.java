package com.softtek.presentacion;

import com.softtek.modelo3.Coche;
import com.softtek.modelo3.SeguroCoche;
import com.softtek.modelo3.TallerMecanica;
import com.softtek.modelo3.TallerPintura;

public class MainTaller {
    public static void main(String[] args) {
        SeguroCoche seguroCoche = new SeguroCoche(new TallerMecanica(), "mafre");
        Coche coche = new Coche("qwe1234", "RS5");
        System.out.println(seguroCoche.reparar(coche));

        seguroCoche.setT(new TallerPintura());
        System.out.println(seguroCoche.reparar(coche));
    }
}
