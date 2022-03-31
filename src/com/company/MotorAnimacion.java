package com.company;

import static java.lang.Thread.sleep;

public class MotorAnimacion implements Runnable {

    PanelJuego pj;
    int i = 0;
    String dir = "arriba";
    boolean sigueJugando;

    MotorAnimacion(PanelJuego pj) {
        this.pj = pj;
        sigueJugando = true;
    }

    public void iniciar() {
        Thread h = new Thread(this);
        h.start();
    }

    @Override
    public void run() {
        while (sigueJugando) {
            //Desplazamiento del mapa (cactus)


            //Animación del Dinosaurio
            pj.caminar();
            //Salto del dinosaurio

            if (i == 0) {
                dir = "arriba";
            }
            if (i == 10) {
                dir = "abajo";
            }

            if (dir.equals("arriba")) {
                pj.saltar(-20);
                i++;
            }
            if (dir.equals("abajo")) {
                pj.saltar(20);
                i--;
            }
            //VERIFICAR COLISIÓN

            //CICLO
            pj.repaint();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
