package com.company;

import javax.swing.*;
import java.util.ArrayList;

import static java.lang.Math.abs;

public class __Graficador {
/*
    private Punto punto_inicial;
    private Punto punto_final;
    private StringBuilder [] grafica;

    //Clase Punto
    public static class Punto{
        private int x,y;

        @Override
        public String toString() {
            return "Punto{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public Punto(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public Punto clonar(){
            return new Punto(this.x,this.y);
        }
    }

    public __Graficador(){
        iniciarGrafica();
    }

    private boolean rangoValido(Punto punto){
        return (punto.getX()<=20 && punto.getX()>0 && punto.getY()<=20 && punto.getY()>0);
    }

    private double calcularPendiente(Punto ini, Punto fin){
        int xi=ini.getX(),yi=ini.getY(),xf=fin.getX(),yf=fin.getY();
        double deltaX = xf-xi;
        double deltaY = yf-yi;
        double pendiente;

        if (xi>xf){
            punto_final.setX(xi);
            punto_inicial.setX(xf);
            punto_final.setY(yi);
            punto_inicial.setY(yf);
        } else if (yi>yf){
            punto_final.setX(xi);
            punto_inicial.setX(xf);
            punto_final.setY(yi);
            punto_inicial.setY(yf);
        }

        deltaX = abs(deltaX);
        deltaY = abs(deltaY);

        if(deltaY > deltaX)
        {
            pendiente = 2;

        }else if (deltaY < deltaX){
            pendiente = 0;

        }else{
            pendiente=1;
        }

        return pendiente;
    }

    private ArrayList<Punto> calcRecta(double pendiente){
        //Lista de puntos de la recta
        ArrayList <Punto> listaPuntos = new ArrayList<>();
        //Paso 2:
        int deltaX = punto_final.getX()-punto_inicial.getX();
        int deltaY = punto_final.getY()-punto_inicial.getY();

        //Paso 4: Puntos inicial y final
        Punto nuevo = punto_inicial.clonar();
        Punto puntoFinal = punto_final.clonar();

        listaPuntos.add(nuevo); //Agregar primer punto de la recta
        int x = nuevo.getX();   //Coordenada x
        int y = nuevo.getY();   //Coordenada y

        if (pendiente>1){
            System.out.println("Pendiente mayor a 1");
            System.out.println(nuevo);
            //Paso 5: Calcular Pk
            int p0 = (2*deltaX) - deltaY;
            int pk = p0 + (2*deltaX) - (2*deltaY);
            //Calcular puntos hasta el punto final
            while(nuevo.getY()!=puntoFinal.getY() && nuevo.getY()<=20){
                //Iteración Pk
                if (pk<0){
                    y++;
                    pk = pk + (2*deltaX);
                }else {
                    x++;
                    y++;
                    pk = pk + (2*deltaX) - (2*deltaY);
                }
                nuevo = new Punto(x,y);     //Crea el nuevo punto
                System.out.println(nuevo);  //Imprime las coordenadas del punto creado
                listaPuntos.add(nuevo);     //Agrega el punto al arreglo
            }
        } else
        if (pendiente<1){
            System.out.println("Pendiente menor a 1");
            System.out.println(nuevo);
            //Paso 5: Calcular Pk
            int p0 = (2*deltaY) - deltaX;
            int pk = p0 + (2*deltaY) - (2*deltaX);
            //Calcular puntos hasta el punto final
            while(nuevo.getX()!=puntoFinal.getX() && nuevo.getX()<=20){
                //Iteración Pk
                if (pk<0){
                    x++;
                    pk = pk + (2*deltaY);
                }else {
                    y++;
                    x++;
                    pk = pk + (2*deltaY) - (2*deltaX);
                }
                nuevo = new Punto(x,y);     //Crea el nuevo punto
                System.out.println(nuevo);  //Imprime las coordenadas del punto creado
                listaPuntos.add(nuevo);     //Agrega el punto al arreglo
            }
        } else {
            System.out.println("Pendiente igual a 1");
            System.out.println(nuevo);
            while(nuevo.getX()<=puntoFinal.getX() && nuevo.getY()<=puntoFinal.getY()){
                //Iteración en diagonal
                x++;
                y++;
                nuevo = new Punto(x,y);     //Crea el nuevo punto
                System.out.println(nuevo);  //Imprime las coordenadas del punto creado
                listaPuntos.add(nuevo);     //Agrega el punto al arreglo
            }
        }
        return listaPuntos;
    }

    private void imprimeRecta(ArrayList<Punto> listaPuntos){
        //Agrega puntos a la gráfica
        for (Punto punto:listaPuntos) {
            int fila = punto.getY();
            int col = punto.getX();
            grafica[fila-1].setCharAt((col*2)-1,'█');
        }
    }

    private void iniciarGrafica(){
        grafica = new StringBuilder[20];
        String linea = " ░ ░ ░ ░ ░ ░ ░ ░ ░ ░ ░ ░ ░ ░ ░ ░ ░ ░ ░ ░";
        //Llenar la matriz de caracteres
        for (int i=0; i<20; i++){
            grafica[i]=new StringBuilder(linea);
        }
    }

    public void nuevaRecta(Punto ini, Punto fin){
        //Valida rangos
        if (rangoValido(ini) && rangoValido(fin)){
            punto_inicial = ini.clonar();
            punto_final = fin.clonar();

            double pendiente = calcularPendiente(ini,fin);

            ArrayList<Punto> arregloPuntos = calcRecta(pendiente);
            imprimeRecta(arregloPuntos);
        }
        else{
            JOptionPane.showMessageDialog(null,"Hay un error en tus puntos","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void nuevoCirculo(Punto central, int radio){
        //Valida rangos
        if (central.getX()-radio>0 && central.getY()-radio>0){


            ArrayList<Punto> arregloPuntos = calcCirculo(central,radio);
            imprimeRecta(arregloPuntos);
        }
        else{
            JOptionPane.showMessageDialog(null,"El círculo sale de la pantalla...","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private ArrayList<Punto> calcCirculo(Punto centro, int radio){
        int p,x,y;
        x=0;
        y=radio;
        p=3-(2*radio);
        ArrayList<Punto> arrPuntos = new ArrayList<>();
        while (x<=y){
            //Se agregan todas las combinaciones para los puntos
            arrPuntos.add(new Punto(centro.getX()+x,centro.getY()+y));
            arrPuntos.add(new Punto(centro.getX()-x,centro.getY()+y));
            arrPuntos.add(new Punto(centro.getX()+x,centro.getY()-y));
            arrPuntos.add(new Punto(centro.getX()-x,centro.getY()-y));

            arrPuntos.add(new Punto(centro.getX()+y,centro.getY()+x));
            arrPuntos.add(new Punto(centro.getX()-y,centro.getY()+x));
            arrPuntos.add(new Punto(centro.getX()+y,centro.getY()-x));
            arrPuntos.add(new Punto(centro.getX()-y,centro.getY()-x));

            //Iteración pk
            if (p<0){
                p+=(4*x)+6;
            }else {
                p+=(4*(x-y))+10;
                y-=1;
            }
            x+=1;
        }
        return arrPuntos;
    }

    public String getGrafica(){
        StringBuilder msj= new StringBuilder();
        for (int i=19; i>=0; i--){
            msj.append(grafica[i]).append("\n");
        }
        return String.valueOf(msj);
    }

    public void reiniciarGrafica(){
        iniciarGrafica();
    }

    public static void main(String[] args) {

        __Graficador graficador = new __Graficador();
        graficador.iniciarGrafica();
        Punto uno, dos;
        //Pintar círculos
//        uno = new Punto(5,15);
//        graficador.nuevoCirculo(uno,4);
//        uno = new Punto(15,15);
//        graficador.nuevoCirculo(uno,4);
//        uno = new Punto(10,10);
//        graficador.nuevoCirculo(uno,4);
//        System.out.println(graficador.getGrafica());
        //Pintar triángulo
//        graficador.reiniciarGrafica();
        uno = new Punto(5,1);
        dos = new Punto(5,10);
        graficador.nuevaRecta(uno,dos);
//        uno = new Punto(15,15);
//        dos = new Punto(15,5);
//        graficador.nuevaRecta(uno,dos);
//        uno = new Punto(15,5);
//        dos = new Punto(5,5);
//        graficador.nuevaRecta(uno,dos);
        System.out.println(graficador.getGrafica());
    }*/
}
