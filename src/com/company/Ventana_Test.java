package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Ventana_Test extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graficador graficador = new Graficador();
        ArrayList<Punto> puntosFigura=new ArrayList<>();
        Punto uno = new Punto(10,1);
        Punto dos = new Punto(10,20);
        puntosFigura.addAll(graficador.dibujaRectangulo(uno,dos,20));
        g.setColor(Color.RED);

        for (Punto actual:puntosFigura) {
            g.fillRect(actual.getX(),actual.getY(),1, 1);
        }
        System.out.println(puntosFigura.size());
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        Ventana_Test lienzo = new Ventana_Test();
        ventana.setSize(500,500);
        ventana.setContentPane(lienzo);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
