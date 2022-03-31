package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelJuego extends JPanel {

    int dinoDisplayed = 0;
    ArrayList<Punto> dino_1;
    Punto coordsDino;
    int alturaDino = 0;
    ArrayList<Punto> dino_2;
    ArrayList<Punto> figuraDino;
    ArrayList<Punto> figuraCactus_1;


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


    public void actualizaPosDino(int x,int y){
        dino_1 = Sprites.trasladar(x,y,dino_1);
        dino_2 = Sprites.trasladar(x,y,dino_2);
        int cx=coordsDino.getX();
        int cy=coordsDino.getY();
        coordsDino.setXY(cx+x,cy+y);
    }

    public PanelJuego(){
        dino_1=Sprites.getDino(50,400);
        dino_2=Sprites.getDino2(50,400);
        coordsDino = new Punto(50,400);
        figuraCactus_1=Sprites.getCactus1(250,400);

        figuraDino=dino_1;

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

    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        PanelJuego lienzo = new PanelJuego();
        ventana.setSize(800,600);
        ventana.setContentPane(lienzo);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
