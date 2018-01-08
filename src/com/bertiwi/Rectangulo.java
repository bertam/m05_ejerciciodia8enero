package com.bertiwi;

public class Rectangulo extends Poligono implements Figura{
    private Posicion centro;

    public Rectangulo(int altura, int base, Posicion centro) {
        super(altura, base);
        this.centro = centro;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimetro() {
        return 0;
    }
}
