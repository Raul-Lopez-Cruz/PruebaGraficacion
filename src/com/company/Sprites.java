package com.company;

import java.util.ArrayList;

public class Sprites {

    private static final Graficador  graficador= new Graficador();

    static ArrayList<Punto> trasladar(int coordX, int coordY, ArrayList<Punto> arreglo){
        return graficador.trasladar(coordX,coordY,arreglo);
    }

    static ArrayList<Punto> getCactus1(int coordX,int coordY){
        ArrayList<Punto> cactus;
        Punto dos = new Punto();
        Punto uno = new Punto();

        uno.setXY(coordX +  25,coordY + 27);
        cactus=graficador.pintaCirculo(uno, 5);
        uno.setXY(coordX + 8,coordY + 33);
        cactus.removeAll(graficador.pintaCirculo(uno,3));
        cactus.addAll(graficador.pintaCirculo(uno,3));
        uno.setXY(coordX + 8,coordY + 54);
        cactus.removeAll(graficador.pintaCirculo(uno,4));
        cactus.addAll(graficador.pintaCirculo(uno,4));
        uno.setXY(coordX + 41,coordY + 57);
        cactus.removeAll(graficador.pintaCirculo(uno,4));
        cactus.addAll(graficador.pintaCirculo(uno,4));
        uno.setXY(coordX + 42,coordY + 38);
        cactus.removeAll(graficador.pintaCirculo(uno,3));
        cactus.addAll(graficador.pintaCirculo(uno,3));
        uno.setXY(coordX + 5,coordY + 35);
        dos.setXY(coordX + 5,coordY + 51);
        cactus.removeAll(graficador.pintaRectangulo(uno,dos,7));
        cactus.addAll(graficador.pintaRectangulo(uno,dos,7));
        uno.setXY(coordX + 11,coordY + 51);
        dos.setXY(coordX + 11,coordY + 58);
        cactus.removeAll(graficador.pintaRectangulo(uno,dos,9));
        cactus.addAll(graficador.pintaRectangulo(uno,dos,9));
        uno.setXY(coordX + 20,coordY + 30);
        dos.setXY(coordX + 20,coordY + 94);
        cactus.removeAll(graficador.pintaRectangulo(uno,dos,11));
        cactus.addAll(graficador.pintaRectangulo(uno,dos,11));
        uno.setXY(coordX + 31,coordY + 55);
        dos.setXY(coordX + 31,coordY + 61);
        cactus.removeAll(graficador.pintaRectangulo(dos,uno,9));
        cactus.addAll(graficador.pintaRectangulo(dos,uno,9));
        uno.setXY(coordX + 39,coordY + 40);
        dos.setXY(coordX + 39,coordY + 55);
        cactus.removeAll(graficador.pintaRectangulo(uno,dos,7));
        cactus.addAll(graficador.pintaRectangulo(uno,dos,7));
        return cactus;
    }

    static ArrayList<Punto> getCactus2(){
        ArrayList<Punto> cactus;
        Punto dos = new Punto();
        Punto uno = new Punto();
        uno.setXY(1,1);
        cactus=graficador.pintaCirculo(uno, 5);
        
        return cactus;
    }

    static ArrayList<Punto> getDino(int coordX, int coordY){
        ArrayList<Punto> dino;
        Punto uno=new Punto();
        Punto dos=new Punto();

        uno.setXY(coordX + 58,coordY + 11);
        dos.setXY(coordX + 58,coordY + 35);
        dino=graficador.pintaRectangulo(uno,dos,38); //rectangulo cabeza
        uno.setXY(coordX + 58,coordY + 36);
        dos.setXY(coordX + 58,coordY + 50);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,15)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,15)); //rectangulo cuello
        uno.setXY(coordX + 27,coordY + 51);
        dos.setXY(coordX + 27,coordY + 82);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,43)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,43)); //rectangulo cuerpo
        uno.setXY(coordX + 30,coordY + 83);
        dos.setXY(coordX + 30,coordY + 98);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,8)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,8)); //rectangulo pierna iz
        uno.setXY(coordX + 50,coordY + 83);
        dos.setXY(coordX + 50,coordY + 99);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,11)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,11)); //rectangulo pierna de
        uno.setXY(coordX + 49,coordY + 42);
        dos.setXY(coordX + 49,coordY + 50);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,9)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,9)); //lomoxd
        uno.setXY(coordX + 70,coordY + 50);
        dos.setXY(coordX + 70,coordY + 54);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,9)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,9)); //brazo
        uno.setXY(coordX + 5,coordY + 42);
        dos.setXY(coordX + 5,coordY + 66);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,8)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,8)); //cola1
        uno.setXY(coordX + 9,coordY + 51);
        dos.setXY(coordX + 9,coordY + 73);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,10)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,10)); //cola2
        uno.setXY(coordX + 17,coordY + 58);
        dos.setXY(coordX + 17,coordY + 79);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,10)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,10)); //cola3

        //OJO
        uno.setXY(coordX + 63,coordY + 15);
        dos.setXY(coordX + 63,coordY + 21);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,7)); //Elimina repetidos

        return dino;
    }

    static ArrayList<Punto> getDino2(int x, int y){
        ArrayList<Punto> dino;
        Punto uno=new Punto();
        Punto dos=new Punto();

        uno.setXY(x+58,y+11);
        dos.setXY(x+58,y+35);
        dino=graficador.pintaRectangulo(uno,dos,38); //rectangulo cabeza
        uno.setXY(x+58,y+36);
        dos.setXY(x+58,y+50);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,15)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,15)); //rectangulo cuello
        uno.setXY(x+27,y+51);
        dos.setXY(x+27,y+82);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,43)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,43)); //rectangulo cuerpo
        uno.setXY(x+34,y+83);
        dos.setXY(x+34,y+99);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,11)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,11)); //rectangulo pierna iz
        uno.setXY(x+48,y+83);
        dos.setXY(x+48,y+98);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,8)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,8)); //rectangulo pierna de
        uno.setXY(x+49,y+42);
        dos.setXY(x+49,y+50);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,9)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,9)); //lomoxd
        uno.setXY(x+70,y+50);
        dos.setXY(x+70,y+54);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,9)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,9)); //brazo
        uno.setXY(x+5,y+40);
        dos.setXY(x+5,y+66);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,8)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,8)); //cola1
        uno.setXY(x+9,y+51);
        dos.setXY(x+9,y+73);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,10)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,10)); //cola2
        uno.setXY(x+17,y+58);
        dos.setXY(x+17,y+79);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,10)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,10)); //cola3

        //OJO
        uno.setXY(x+63,y+15);
        dos.setXY(x+63,y+21);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,7)); //Elimina repetidos

        return dino;
    }

}
