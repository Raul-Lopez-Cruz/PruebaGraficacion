package com.company;

import static java.lang.Thread.sleep;


public class MotorAnimacion implements Runnable {

    PanelJuego pj;
    int i;
    String dir = "arriba";
    String status;
    boolean inmune = false;
    boolean sigueJugando;
    public final String CAMINANDO = "Caminando";
    public final String SALTANDO = "Saltando";
    int alturaDino;

    MotorAnimacion(PanelJuego pj) {
        this.pj = pj;
        sigueJugando = true;
        alturaDino = pj.getAlturaSuelo();
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

        int limiteCactus = 20;

        while (sigueJugando) {
            //Desplazamiento del mapa (cactus)
            Punto objeto  = pj.figuraCactus_1.get(0);
            int primerPuntoX = objeto.getX();
            pj.moverCactus(-10);

            if (primerPuntoX < limiteCactus) {
                pj.figuraCactus_1 = Sprites.getCactus1(750,400);
            }

            //Animación del Dinosaurio
            if (status.equals(CAMINANDO)){ //No salta durante el salto
                pj.caminar();
            }
            /*---------- Salto del dinosaurio ----------*/
            if (status.equals(SALTANDO)) {
                //Fases del salto: hacia arriba y hacia abajo
                if (i == 5) {
                    dir = "abajo";
                }
                //Desplazamiento de cada frame del salto
                if (dir.equals("arriba")) {
                    pj.saltar(-25);
                    alturaDino-=25;
                    i++;
                }
                if (dir.equals("abajo")) {
                    pj.saltar(25);
                    alturaDino+=25;
                    i--;
                    //Condición para terminar el salto
                    if (i == 0) {
                        setStatus(CAMINANDO);
                    }
                }
            }
            /*---------- Verificar colisión ----------*/

            /*---------- Actualizar graphics / sleep ----------*/
            pj.repaint();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
