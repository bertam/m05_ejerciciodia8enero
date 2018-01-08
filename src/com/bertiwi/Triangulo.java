package com.bertiwi;

public class Triangulo extends Poligono implements Figura{
    private Posicion[] pos;

    public Triangulo(int altura, int base) {
        super(altura, base);
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
