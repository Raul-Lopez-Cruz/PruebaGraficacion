package com.company;

import java.util.Objects;

//Clase Punto
public class Punto{
    private int x,y;

    @Override
    public int hashCode() {
        return Objects.hash(this.getX(), this.getY());
    }

    @Override
    public boolean equals(Object obj){
        if ( !(obj instanceof Punto) ) {
            return false;
        }
        return Objects.equals(((Punto)obj).getX(), this.getX())
                && Objects.equals(((Punto)obj).getY(), this.getY());
    }

    public Punto() {
    }

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

    public void setXY(int x, int y){this.x=x;this.y=y;}

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
