package com.company;

import java.util.ArrayList;

public class Sprites {

    private static final Graficador  graficador= new Graficador();

    static ArrayList<Punto> trasladar(int coordX, int coordY, ArrayList<Punto> arreglo){
        return graficador.trasladar(coordX,coordY,arreglo);
    }

    static ArrayList<Punto> getCactus(){
        ArrayList<Punto> cactus;
        Punto dos = new Punto();
        Punto uno = new Punto();
        uno.setXY(25,27);
        cactus=graficador.pintaCirculo(uno, 5);
        uno.setXY(8,33);
        cactus.addAll(graficador.pintaCirculo(uno,3));
        uno.setXY(8,54);
        cactus.addAll(graficador.pintaCirculo(uno,4));
        uno.setXY(41,57);
        cactus.addAll(graficador.pintaCirculo(uno,4));
        uno.setXY(42,38);
        cactus.addAll(graficador.pintaCirculo(uno,3));
        uno.setXY(5,35);
        dos.setXY(5,51);
        cactus.addAll(graficador.pintaRectangulo(uno,dos,7));
        uno.setXY(11,51);
        dos.setXY(11,58);
        cactus.addAll(graficador.pintaRectangulo(uno,dos,9));
        uno.setXY(20,30);
        dos.setXY(20,94);
        cactus.addAll(graficador.pintaRectangulo(uno,dos,11));
        uno.setXY(31,55);
        dos.setXY(31,61);
        cactus.addAll(graficador.pintaRectangulo(dos,uno,9));
        uno.setXY(39,40);
        dos.setXY(39,55);
        cactus.addAll(graficador.pintaRectangulo(uno,dos,7));
        return cactus;
    }

    static ArrayList<Punto> getCactus(int coordX,int coordY){
        ArrayList<Punto> cactus;
        Punto dos = new Punto();
        Punto uno = new Punto();
        uno.setXY(coordX+ 25,coordY+27);
        cactus=graficador.pintaCirculo(uno, 5);
        uno.setXY(coordX+8,coordY+33);
        cactus.addAll(graficador.pintaCirculo(uno,3));
        uno.setXY(coordX+8,coordY+54);
        cactus.addAll(graficador.pintaCirculo(uno,4));
        uno.setXY(coordX+41,coordY+57);
        cactus.addAll(graficador.pintaCirculo(uno,4));
        uno.setXY(coordX+42,coordY+38);
        cactus.addAll(graficador.pintaCirculo(uno,3));
        uno.setXY(coordX+5,coordY+35);
        dos.setXY(coordX+5,coordY+51);
        cactus.addAll(graficador.pintaRectangulo(uno,dos,7));
        uno.setXY(coordX+11,coordY+51);
        dos.setXY(coordX+11,coordY+58);
        cactus.addAll(graficador.pintaRectangulo(uno,dos,9));
        uno.setXY(coordX+20,coordY+30);
        dos.setXY(coordX+20,coordY+94);
        cactus.addAll(graficador.pintaRectangulo(uno,dos,11));
        uno.setXY(coordX+31,coordY+55);
        dos.setXY(coordX+31,coordY+61);
        cactus.addAll(graficador.pintaRectangulo(dos,uno,9));
        uno.setXY(coordX+39,coordY+40);
        dos.setXY(coordX+39,coordY+55);
        cactus.addAll(graficador.pintaRectangulo(uno,dos,7));
        return cactus;
    }

    static ArrayList<Punto> getDino(){
        ArrayList<Punto> dino;
        Punto uno=new Punto();
        Punto dos=new Punto();

        uno.setXY(58,5);
        dos.setXY(58,29);
        dino=graficador.pintaRectangulo(uno,dos,38); //rectangulo cabeza
        uno.setXY(58,30);
        dos.setXY(58,44);
        dino.addAll(graficador.pintaRectangulo(uno,dos,15)); //rectangulo cuello
        uno.setXY(27,45);
        dos.setXY(27,76);
        dino.addAll(graficador.pintaRectangulo(uno,dos,43)); //rectangulo cuerpo
        uno.setXY(30,77);
        dos.setXY(30,92);
        dino.addAll(graficador.pintaRectangulo(uno,dos,8)); //rectangulo pierna iz
        uno.setXY(50,77);
        dos.setXY(50,93);
        dino.addAll(graficador.pintaRectangulo(uno,dos,11)); //rectangulo pierna de
        uno.setXY(49,36);
        dos.setXY(49,44);
        dino.addAll(graficador.pintaRectangulo(uno,dos,9)); //lomoxd
        uno.setXY(70,44);
        dos.setXY(70,48);
        dino.addAll(graficador.pintaRectangulo(uno,dos,9)); //brazo
        uno.setXY(5,36);
        dos.setXY(5,60);
        dino.addAll(graficador.pintaRectangulo(uno,dos,8)); //cola1
        uno.setXY(9,45);
        dos.setXY(9,67);
        dino.addAll(graficador.pintaRectangulo(uno,dos,10)); //cola2
        uno.setXY(17,52);
        dos.setXY(17,73);
        dino.addAll(graficador.pintaRectangulo(uno,dos,10)); //cola3

        //OJO
        uno.setXY(63,9);
        dos.setXY(63,15);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,7));

        return dino;
    }

    static ArrayList<Punto> getDino(int x, int y){
        ArrayList<Punto> dino;
        Punto uno=new Punto();
        Punto dos=new Punto();

        uno.setXY(x+58,y+5);
        dos.setXY(x+58,y+29);
        dino=graficador.pintaRectangulo(uno,dos,38); //rectangulo cabeza
        uno.setXY(x+58,y+30);
        dos.setXY(x+58,y+44);
        dino.addAll(graficador.pintaRectangulo(uno,dos,15)); //rectangulo cuello
        uno.setXY(x+27,y+45);
        dos.setXY(x+27,y+76);
        dino.addAll(graficador.pintaRectangulo(uno,dos,43)); //rectangulo cuerpo
        uno.setXY(x+30,y+77);
        dos.setXY(x+30,y+92);
        dino.addAll(graficador.pintaRectangulo(uno,dos,8)); //rectangulo pierna iz
        uno.setXY(x+50,y+77);
        dos.setXY(x+50,y+93);
        dino.addAll(graficador.pintaRectangulo(uno,dos,11)); //rectangulo pierna de
        uno.setXY(x+49,y+36);
        dos.setXY(x+49,y+44);
        dino.addAll(graficador.pintaRectangulo(uno,dos,9)); //lomoxd
        uno.setXY(x+70,y+44);
        dos.setXY(x+70,y+48);
        dino.addAll(graficador.pintaRectangulo(uno,dos,9)); //brazo
        uno.setXY(x+5,y+36);
        dos.setXY(x+5,y+60);
        dino.addAll(graficador.pintaRectangulo(uno,dos,8)); //cola1
        uno.setXY(x+9,y+45);
        dos.setXY(x+9,y+67);
        dino.addAll(graficador.pintaRectangulo(uno,dos,10)); //cola2
        uno.setXY(x+17,y+52);
        dos.setXY(x+17,y+73);
        dino.addAll(graficador.pintaRectangulo(uno,dos,10)); //cola3

        //OJO
        uno.setXY(x+63,y+9);
        dos.setXY(x+63,y+15);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,7));

        return dino;
    }

}
