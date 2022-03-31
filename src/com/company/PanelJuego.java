package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelJuego extends JPanel {

    ArrayList<Punto> figuraDino_1;
    Punto coordsDino_1;
    ArrayList<Punto> figuraDino_2;
    ArrayList<Punto> figuraCactus_1;
    ArrayList<Punto> figuraCactus_2;

    public void actualizaPosDino(int y){
        figuraDino_1 = Sprites.trasladar(0,y,figuraDino_1);
    }

    public PanelJuego(){
        figuraDino_1=Sprites.getDino(50,400);
        coordsDino_1 = new Punto(50,400);
        figuraCactus_1=Sprites.getCactus(160,200);
        //figuraDino_1=Sprites.trasladar(100,600,Sprites.getDino());

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (Punto actual:figuraDino_1) {
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
