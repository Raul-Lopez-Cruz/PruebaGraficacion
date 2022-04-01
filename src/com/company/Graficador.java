package com.company;

import java.util.ArrayList;

import static java.lang.Math.abs;

public class Graficador {

    public ArrayList<Punto> dibujaLinea(Punto i, Punto f){
        //Lista de puntos a regresar
        ArrayList <Punto> listaPuntos = new ArrayList<>();

        //Paso 2:
        int deltaX = abs(f.getX()-i.getX());
        int deltaY = abs(f.getY()-i.getY());

        //Calcular pendiente
        Punto inicial = i.clonar();
        Punto fin = f.clonar();
        double pendiente;
        if (i.getX()>f.getX()){
            fin.setX(i.getX());
            inicial.setX(f.getX());
            fin.setY(i.getY());
            inicial.setY(f.getY());
        } else if (i.getY()>f.getY()){
            fin.setX(i.getX());
            inicial.setX(f.getX());
            fin.setY(i.getY());
            inicial.setY(f.getY());
        }
        if(deltaY > deltaX)         pendiente = 2;
        else if (deltaY < deltaX)   pendiente = 0;
        else                        pendiente = 1;

        //Paso 4: Puntos inicial y final
        int x = inicial.getX();   //Coordenada de inicio en x
        int y = inicial.getY();   //Coordenada de inicio en y
        listaPuntos.add(inicial); //Agregar primer punto de la recta
        if (pendiente>1){
            //System.out.println("Pendiente mayor a 1");
            //System.out.println(inicial);
            //Paso 5: Calcular Pk
            int pk = ((2*deltaX) - deltaY) + (2*deltaX) - (2*deltaY);
            //Calcular puntos hasta el punto final
            while(inicial.getY()!= fin.getY()){
                //Iteración Pk
                if (pk<0){
                    y++;
                    pk = pk + (2*deltaX);
                }else {
                    x++;
                    y++;
                    pk = pk + (2*deltaX) - (2*deltaY);
                }
                inicial = new Punto(x,y); //Nuevas coordenadas del punto

                //System.out.println(inicial);  //Imprime las coordenadas del punto creado
                listaPuntos.add(inicial);     //Agrega el punto al arreglo
            }
        } else
        if (pendiente<1){
            //System.out.println("Pendiente menor a 1");
            //System.out.println(inicial);
            //Paso 5: Calcular Pk
            int pk = ((2*deltaY) - deltaX) + (2*deltaY) - (2*deltaX);
            //Calcular puntos hasta el punto final
            while(inicial.getX()!= fin.getX()){
                //Iteración Pk
                if (pk<0){
                    x++;
                    pk = pk + (2*deltaY);
                }else {
                    y++;
                    x++;
                    pk = pk + (2*deltaY) - (2*deltaX);
                }
                inicial = new Punto(x,y); //Nuevas coordenadas del punto
                //System.out.println(inicial);  //Imprime las coordenadas del punto creado
                listaPuntos.add(inicial);     //Agrega el punto al arreglo
            }
        } else {
            //System.out.println("Pendiente igual a 1");
            //System.out.println(inicial);
            while(inicial.getX()<= fin.getX() && inicial.getY()<= fin.getY()){
                //Iteración en diagonal
                x++;
                y++;
                inicial = new Punto(x,y); //Nuevas coordenadas del punto
                //System.out.println(inicial);  //Imprime las coordenadas del punto creado
                listaPuntos.add(inicial);     //Agrega el punto al arreglo
            }
        }
        return listaPuntos;
    }

    /*
     * */
    public ArrayList <Punto> pintaRectangulo(Punto infIzq, Punto supIzq, int ancho){
        ArrayList <Punto> figura = new ArrayList<>();
        Punto aux1=infIzq.clonar(),aux2=supIzq.clonar();
        for (int i=0;i<ancho;i++){
            aux1.setX(infIzq.getX()+i);
            aux2.setX(supIzq.getX()+i);
            figura.addAll(dibujaLinea(aux1, aux2));
        }
        return figura;
    }

    /*
    * */
    public ArrayList<Punto> dibujaRectangulo(Punto infIzq, Punto supIzq, int ancho){
        Punto supDer, infDer;
        //Línea Izquierda
        ArrayList<Punto> figura = new ArrayList<>(dibujaLinea(infIzq, supIzq));
        //Línea Superior
        supDer = supIzq.clonar();
        supDer.setX(supDer.getX()+ancho);
        figura.addAll(dibujaLinea(supIzq,supDer));
        //Linea Inferior
        infDer = infIzq.clonar();
        infDer.setX(infDer.getX()+ancho);
        figura.addAll(dibujaLinea(infIzq,infDer));
        //Linea Derecha
        figura.addAll(dibujaLinea(supDer,infDer));

        return figura;
    }

    public ArrayList<Punto> pintaCirculo(Punto centro, int radio){
        ArrayList<Punto> salida = new ArrayList<>();

        while (radio>0){
            salida.addAll(dibujaCirculo(centro,radio));
            radio--;
        }
        return salida;
    }

    public ArrayList<Punto> dibujaCirculo(Punto centro, int radio){
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

    public ArrayList<Punto> escalarFigura(double sx, double sy, int xc, int yc, ArrayList<Punto> arreglo){
        ArrayList<Punto> entrada = arreglo;
        ArrayList<Punto> salida = new ArrayList<>();
        Punto aux;
        while(!entrada.isEmpty()){
            aux = entrada.remove(0);
            double y = aux.getY();
            double x = aux.getX();
            double xn = xc+(sx*(x-xc));
            double yn = yc+(sy*(y-yc));
            salida.add(new Punto((int)xn,(int)yn));
        }
        return salida;
    }

    public ArrayList<Punto> rotarFigura(double xc, double yc, double angulo, ArrayList<Punto> arreglo){
        ArrayList<Punto> resultado = new ArrayList<>();
        Punto nuevo=new Punto();
        while (!arreglo.isEmpty()){
            Punto actual = arreglo.remove(0);

            double x = actual.getX();
            double y = actual.getY();

            double xn= ((xc+(x-xc)*(Math.cos(angulo*Math.PI/180)))-((y-yc)*Math.sin(angulo*Math.PI/180)));
            double yn= ((yc+(x-xc)*(Math.sin(angulo*Math.PI/180)))+((y-yc)*Math.cos(angulo*Math.PI/180)));
            nuevo.setXY((int) xn, (int) yn);
            resultado.add(nuevo.clonar());
        }
        return resultado;
    }

    public ArrayList<Punto> trasladar(int coordX, int coordY, ArrayList<Punto> arreglo){
        for (Punto pixel:arreglo) {
            pixel.setX(pixel.getX()+coordX);
            pixel.setY(pixel.getY()+coordY);
        }
        return arreglo;
    }

    public static void main(String[] args) {

    }
}
