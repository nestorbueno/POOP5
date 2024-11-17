package com.mycompany.poop5;

public class Circulo {
    private float radio;

    public Circulo() {
        this.radio = 0.0f;
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float calcularArea() {
        return (float) (Math.PI * radio * radio);
    }

    public float calcularPerimetro() {
        return (float) (2 * Math.PI * radio);
    }
}
