package com.mycompany.poop5;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha() {
        dia = 1;
        mes = 1;
        año = 2000;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + año;
    }
}

