package com.company;

import java.util.ArrayList;

public class Sprites {

    private static final Graficador  graficador= new Graficador();

    static ArrayList<Punto> trasladar(int coordX, int coordY, ArrayList<Punto> arreglo){
        return graficador.trasladar(coordX,coordY,arreglo);
    }

    static ArrayList<Punto> escalar(double a, double b, int c, int d, ArrayList<Punto> figura){
        return graficador.escalarFigura(a,b,c,d,figura);
    }

    static ArrayList<Punto> rotarFigura(double xc, double yc, double angulo, ArrayList<Punto> arreglo){
        return graficador.rotarFigura(xc,yc,angulo,arreglo);
    }

    static ArrayList<Punto> getSuelo(){
        Punto a,b;
        return graficador.dibujaLinea(a=new Punto(0,500),b=new Punto(800,500));
    }

    static ArrayList<Punto> getCactus1(int coordX,int coordY){
        ArrayList<Punto> cactus;
        Punto dos = new Punto();
        Punto uno = new Punto();
        
        //Circulo Principal
        uno.setXY(coordX +  25,coordY + 32);
        cactus=graficador.pintaCirculo(uno,5);
        //Circulo 1 (Brazo iz)
        uno.setXY(coordX + 8,coordY + 38);
        cactus.removeAll(graficador.pintaCirculo(uno,3));
        cactus.addAll(graficador.pintaCirculo(uno,3));
        //Circulo 2 (Brazo iz)
        uno.setXY(coordX + 8,coordY + 59);
        cactus.removeAll(graficador.pintaCirculo(uno,4));
        cactus.addAll(graficador.pintaCirculo(uno,4));
        //Circulo 1 (Brazo de)
        uno.setXY(coordX + 42,coordY + 43);
        cactus.removeAll(graficador.pintaCirculo(uno,3));
        cactus.addAll(graficador.pintaCirculo(uno,3));
        //Circulo 2 (Brazo de)
        uno.setXY(coordX + 42,coordY + 63);
        cactus.removeAll(graficador.pintaCirculo(uno,4));
        cactus.addAll(graficador.pintaCirculo(uno,4));    
        //Rectangulo vertical izquierdo (Brazo Cactus)
        uno.setXY(coordX + 5,coordY + 40);
        dos.setXY(coordX + 5,coordY + 56);
        cactus.removeAll(graficador.pintaRectangulo(uno,dos,7));
        cactus.addAll(graficador.pintaRectangulo(uno,dos,7)); 
        //Rectangulo horizontal izquierdo (Brazo Cactus)
        uno.setXY(coordX + 11,coordY + 56);
        dos.setXY(coordX + 11,coordY + 62);
        cactus.removeAll(graficador.pintaRectangulo(uno,dos,9));
        cactus.addAll(graficador.pintaRectangulo(uno,dos,9));
        //Rectangulo Principal (Cuerpo Cactus)
        uno.setXY(coordX + 20,coordY + 35);
        dos.setXY(coordX + 20,coordY + 99);
        cactus.removeAll(graficador.pintaRectangulo(uno,dos,11));
        cactus.addAll(graficador.pintaRectangulo(uno,dos,11));
         //Rectangulo horizontal derecho (Brazo Cactus)
        uno.setXY(coordX + 31,coordY + 60);
        dos.setXY(coordX + 31,coordY + 66);
        cactus.removeAll(graficador.pintaRectangulo(dos,uno,9));
        cactus.addAll(graficador.pintaRectangulo(dos,uno,9));
        //Rectangulo vertical izquierdo (Brazo Cactus)
        uno.setXY(coordX + 39,coordY + 45);
        dos.setXY(coordX + 39,coordY + 59);
        cactus.removeAll(graficador.pintaRectangulo(uno,dos,7));
        cactus.addAll(graficador.pintaRectangulo(uno,dos,7));
        
        return cactus;
    }

    static ArrayList<Punto> getCactus2(){
        //Cactus de a tres xd
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
        dino.removeAll(graficador.pintaRectangulo(uno,dos,16)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,16)); //rectangulo cuello
        
        uno.setXY(coordX + 27,coordY + 51);
        dos.setXY(coordX + 27,coordY + 82);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,44)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,44)); //rectangulo cuerpo
        
        uno.setXY(coordX + 33,coordY + 83);
        dos.setXY(coordX + 33,coordY + 99);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,11)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,11)); //rectangulo pierna iz
        
        uno.setXY(coordX + 47,coordY + 83);
        dos.setXY(coordX + 47,coordY + 98);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,8)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,8)); //rectangulo pierna de
        
        uno.setXY(coordX + 49,coordY + 42);
        dos.setXY(coordX + 49,coordY + 50);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,9)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,9)); //lomoxd
        
        uno.setXY(coordX + 71,coordY + 50);
        dos.setXY(coordX + 71,coordY + 54);
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
        uno.setXY(coordX + 65,coordY + 16);
        dos.setXY(coordX + 65,coordY + 23);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,8)); //Elimina repetidos

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
        dino.removeAll(graficador.pintaRectangulo(uno,dos,16)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,16)); //rectangulo cuello
        
        uno.setXY(x+27,y+51);
        dos.setXY(x+27,y+82);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,47)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,47)); //rectangulo cuerpo
        
        uno.setXY(x+30,y+83);
        dos.setXY(x+30,y+98);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,8)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,8)); //rectangulo pierna iz
        
        uno.setXY(x+50,y+83);
        dos.setXY(x+50,y+99);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,11)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,11)); //rectangulo pierna de
        
        uno.setXY(x+49,y+42);
        dos.setXY(x+49,y+50);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,9)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,9)); //lomoxd
        
        uno.setXY(x+74,y+50);
        dos.setXY(x+74,y+54);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,9)); //Elimina repetidos
        dino.addAll(graficador.pintaRectangulo(uno,dos,9)); //brazo
        
        uno.setXY(x+5,y+42);
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
        uno.setXY(x+65,y+16);
        dos.setXY(x+65,y+23);
        dino.removeAll(graficador.pintaRectangulo(uno,dos,8)); //Elimina repetidos

        return dino;
    }

}
