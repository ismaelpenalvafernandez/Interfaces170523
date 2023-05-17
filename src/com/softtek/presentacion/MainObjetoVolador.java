package com.softtek.presentacion;

import com.softtek.modelo.*;
public class MainObjetoVolador {
    public static void main(String[] args) {

        ObjetoVolador avion = new Avion();
        ObjetoVolador ave = new Ave();
        ObjetoVolador superman = new Superman();
        Nautico barcaza = new Barcaza();
        Nautico hidroavion1 = new Hidroavion();

        ObjetoVolador[] Voladores = new ObjetoVolador[]{avion, ave, superman, (ObjetoVolador) hidroavion1};
        Nautico[] nauticos = new Nautico[]{barcaza, hidroavion1};

        for (ObjetoVolador Volador : Voladores) {
            System.out.println(Volador.despegar());
            System.out.println(Volador.volar());
            System.out.println(Volador.aterrizar());

            if (Volador instanceof Ave) {
                System.out.println(((Ave) Volador).hacerNido());
                System.out.println(((Ave) Volador).ponerHuevos());
                System.out.println(((Ave) Volador).Comer());
            }
            if (Volador instanceof Superman) {
                System.out.println(((Superman) Volador).saltarEdificio());
                System.out.println(((Superman) Volador).detenerBala());
                System.out.println(((Superman) Volador).Comer());
            }
            if (Volador instanceof Hidroavion) {
                System.out.println(((Hidroavion) Volador).atracar());
                System.out.println(((Hidroavion) Volador).navegar());
            }
        }

            for (Nautico nautico1 : nauticos) {
                System.out.println(nautico1.atracar());
                System.out.println(nautico1.navegar());

                if (nautico1 instanceof Hidroavion) {

                    System.out.println(((Hidroavion) nautico1).despegar());
                    System.out.println(((Hidroavion) nautico1).aterrizar());
                    System.out.println(((Hidroavion) nautico1).volar());
                }
            }

    }
}
