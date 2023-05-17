package com.softtek.presentacion.MainObjetoVoladador;

public class MainObjetoVolador {
    public static void main(String[] args) {
        ObjetoVolador avion = new Avion();
        avion.despegar();
        avion.volar();
        avion.aterrizar();

        Ave ave = new Ave();
        ave.despegar();
        ave.volar();
        ave.aterrizar();
        ave.hacerNido();
        ave.ponerHuevos();

        Superman superman = new Superman();
        superman.despegar();
        superman.volar();
        superman.aterrizar();
        superman.saltarEdificio();
        superman.detenerBala();
    }
}


