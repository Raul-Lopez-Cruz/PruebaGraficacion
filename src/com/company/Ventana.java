package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Ventana extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graficador graficador = new Graficador();
        ArrayList<Punto> puntosFigura=new ArrayList<>();
        Punto uno = new Punto(1,1);
        Punto dos = new Punto(200,150);
        puntosFigura.addAll(graficador.pintarLinea(uno,dos)); //rectangulo cabeza
        puntosFigura.addAll(graficador.pintarLinea(uno,dos)); //rectangulo cuerpo
        g.setColor(Color.RED);

        for (Punto actual:puntosFigura) {
            g.fillRect(actual.getX(),actual.getY(),1, 1);
        }
        System.out.println(puntosFigura.size());
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
