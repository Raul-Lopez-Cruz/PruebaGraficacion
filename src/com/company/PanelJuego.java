package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelJuego extends JPanel {

    int dinoDisplayed = 0;
    ArrayList<Punto> dino_1;
    Punto coordsDino;
    int alturaSuelo;
    int alturaDino = 0;
    int cactusX = 0;
    Punto coordsCactus;
    ArrayList<Punto> dino_2;
    ArrayList<Punto> figuraDino;
    ArrayList<Punto> figuraCactus_1;

    public PanelJuego(){
        alturaSuelo = 400;
        //Inicializar las figuras (todas en Y=400)
        dino_1=Sprites.getDino(50,alturaSuelo);
        dino_2=Sprites.getDino2(50,alturaSuelo);
        spawnCactus();

        figuraDino=dino_1;
    }


    public ArrayList<Punto> getFiguraCactus_1() {
        return figuraCactus_1;
    }

    public void caminar(){
        if (dinoDisplayed==0){
            figuraDino=dino_2;
            dinoDisplayed=1;
        }else {
            figuraDino=dino_1;
            dinoDisplayed=0;
        }
    }

    public void saltar(int altura){
        dino_1 = Sprites.trasladar(0,altura,dino_1);
        dino_2 = Sprites.trasladar(0,altura,dino_2);
        alturaDino += altura;
    }

    public void moverCactus(int distancia){
        figuraCactus_1 = Sprites.trasladar(distancia,0,figuraCactus_1);
        cactusX += distancia;
    }

    public void spawnCactus(){
        figuraCactus_1 = Sprites.getCactus1(750,alturaSuelo);
        cactusX = 750;
    }

    public int getCactusX(){
        return cactusX;
    }

    public void muerteDino1(){
        figuraDino=Sprites.trasladar(-50,0,
        Sprites.rotarFigura(90,400,-90,dino_1));
    }
    public void muerteDino2(){
        figuraDino=Sprites.trasladar(50,50,
                Sprites.escalar(-.5,-.5,50,400,dino_2));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);


        for (Punto actual:figuraDino) {
            g.fillRect(actual.getX(),actual.getY(),1, 1);
        }

        for (Punto actual:figuraCactus_1) {
            g.fillRect(actual.getX(),actual.getY(),1, 1);
        }
    }

    public int getAlturaSuelo() {
        return alturaSuelo;
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        PanelJuego panelJuego = new PanelJuego();
        ventana.setSize(800,600);
        ventana.setContentPane(panelJuego);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
