package com.redes;

public class LineaTelefonica {
    public int estrato1;
    public double descuento1;
    public int numLlamadas1;

    public double discount1() {
        return descuento1;
    }

    public double aplicarDescuento1() {
        return ((numLlamadas1 * descuento1) / 100);
    }

    public int estrato2;
    public double descuento2;
    public int numLlamadas2;

    public double discount2() {
        return descuento2;
    }

    public double aplicarDescuento2() {
        return ((numLlamadas2 * descuento2) / 100);
    }

    public int estrato3;
    public double descuento3;
    public int numLlamadas3;

    public double discount3() {
        return descuento3;
    }
    public double aplicarDescuento3() {
        return ((numLlamadas3 * descuento3) / 100);
    }

    public double aplicarDescuentoATodos(){
        return (aplicarDescuento1()+aplicarDescuento2()+aplicarDescuento3());
    }
}
