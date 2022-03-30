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
        Punto uno = new Punto(300,50);
        Punto dos = new Punto(300,130);
        // puntosFigura.addAll(graficador.pintarLinea(uno,dos));
        puntosFigura.addAll(graficador.repetir(uno,dos,120)); //rectangulo cabeza
        puntosFigura.addAll(graficador.repetir(uno,dos,100)); //

        Punto tres = new Punto(300,130);
        Punto cuat = new Punto(300,180);
        puntosFigura.addAll(graficador.repetir(tres,cuat,50)); //rectangulo cuello

        Punto cinco = new Punto(200,180);
        Punto seis  = new Punto(200,280);
        puntosFigura.addAll(graficador.repetir(cinco,seis,150)); //rectangulo cuerpo

        Punto siete = new Punto(210,280);
        Punto ocho  = new Punto(210,330);
        puntosFigura.addAll(graficador.repetir(siete,ocho,25)); //rectangulo pierna iz

        Punto nueve = new Punto(275,280);
        Punto diez  = new Punto(275,335);
        puntosFigura.addAll(graficador.repetir(nueve,diez,35)); //rectangulo pierna de

        Punto once = new Punto(170,230);
        Punto doce  = new Punto(170,270);
        puntosFigura.addAll(graficador.repetir(once,doce,50)); //rectangulo semiColaxd

        Punto trece = new Punto(145,200);
        Punto catorce  = new Punto(145,250);
        puntosFigura.addAll(graficador.repetir(trece,catorce,70)); //rectangulo cola

        Punto quince = new Punto(155,180);
        Punto dieciseis  = new Punto(155,200);
        puntosFigura.addAll(graficador.repetir(quince,dieciseis,20)); //rectangulo cola2

        Punto diecisiete = new Punto(130,230);
        Punto dieciocho  = new Punto(130,150);
        puntosFigura.addAll(graficador.repetir(diecisiete,dieciocho,25)); //rectangulo colaFinal

        Punto diecinueve = new Punto(270,150);
        Punto veinte  = new Punto(270,180);
        puntosFigura.addAll(graficador.repetir(diecinueve,veinte,50)); //lomoxd

        Punto veintiuno = new Punto(350,175);
        Punto veinidos  = new Punto(350,190);
        puntosFigura.addAll(graficador.repetir(veintiuno,veinidos,30)); //brazo


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
