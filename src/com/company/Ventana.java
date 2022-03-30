package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Ventana extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        ArrayList<Punto> cactus = Sprites.getCactus();
        ArrayList<Punto> dino = Sprites.getDino();
        g.setColor(Color.BLACK);

        for (Punto actual:dino) {
            g.fillRect(actual.getX(),actual.getY(),1, 1);
        }
        System.out.println(dino.size());
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        Ventana lienzo = new Ventana();
        ventana.setSize(500,500);
        ventana.setContentPane(lienzo);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
