package com.company;

import javax.swing.*;

import static java.lang.Thread.sleep;


public class MotorAnimacion implements Runnable {

    PanelJuego pj;
    int i;
    int j;
    String dir = "arriba";
    String status;
    boolean inmune = false;
    boolean sigueJugando;
    public final String CAMINANDO = "Caminando";
    public final String SALTANDO = "Saltando";
    int alturaDino;
    int cactusPosX;

    MotorAnimacion(PanelJuego pj) {
        this.pj = pj;
        sigueJugando = true;
        alturaDino = 0;
        setStatus(CAMINANDO);
    }

    public void iniciar() {
        Thread h = new Thread(this);
        h.start();
    }

    private void setStatus(String status) {
        this.status = status;
    }

    public boolean saltar() {
        if (status.equals(CAMINANDO)) {
            //Comienza el salto
            dir="arriba";
            j=2;
            i=0;
            setStatus(SALTANDO);
            return true;
        } else {
            //Ya está en el aire
            return false;
        }
    }

    @Override
    public void run() {

        while (sigueJugando) {
            //Desplazamiento del mapa (cactus)
            cactusPosX = pj.getCactusX();
            pj.moverCactus(-15);

            if (cactusPosX < -50) {
                pj.spawnCactus();
            }

            //Animación del Dinosaurio
            if (status.equals(CAMINANDO)){ //No salta durante el salto
                pj.caminar();
            }
            /*---------- Salto del dinosaurio ----------*/
            if (status.equals(SALTANDO)) {
                //Fases del salto: hacia arriba y hacia abajo
                if (i == 6) {
                    dir = "abajo";
                }
                //Desplazamiento de cada frame del salto
                if (dir.equals("arriba")) {
                    pj.saltar(-25);
                    alturaDino+=25;
                    i++;
                }
                if (dir.equals("abajo")) {
                    if (j>0)
                        j--;
                    else{
                        pj.saltar(25);
                        alturaDino-=25;
                        i--;
                    }
                    //Condición para terminar el salto
                    if (i == 0) {
                        setStatus(CAMINANDO);
                    }
                }
            }
            /*---------- Verificar colisión ----------*/

            inmune = alturaDino > 50;
            int hitboxD = 125;
            int hitboxI = 50;
            if (cactusPosX<=hitboxD && cactusPosX>=hitboxI+20 && !inmune){
                sigueJugando=false;
            }


            /*---------- Actualizar graphics / sleep ----------*/
            pj.repaint();
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /*---------- Animación de muerte ----------*/
        pj.muerteDino1();
        pj.repaint();
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pj.muerteDino2();
        pj.repaint();
        JOptionPane.showMessageDialog(null,"PERDISTE");
    }
}
