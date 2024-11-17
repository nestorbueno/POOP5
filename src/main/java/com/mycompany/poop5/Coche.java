/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop5;

/**
 *
 * @author bueno
 */
public class Coche {
    private Chofer chofer;
    private Copiloto copiloto;
    private Pasajero1 pasajero1;
    private Pasajero2 pasajero2;
    
    public Coche() {
    }
    
    public Coche(Chofer chofer, Copiloto copiloto, Pasajero1 pasajero1, Pasajero2 pasajero2) {
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }
    
    public void mostrarOcupantes() {
        System.out.println("Ocupantes del coche:");
        chofer.decirUbicacion();
        copiloto.decirUbicacion();
        pasajero1.decirUbicacion();
        pasajero2.decirUbicacion();
    }

    // Getters y setters
    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public Copiloto getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(Copiloto copiloto) {
        this.copiloto = copiloto;
    }

    public Pasajero1 getPasajero1() {
        return pasajero1;
    }

    public void setPasajero1(Pasajero1 pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public Pasajero2 getPasajero2() {
        return pasajero2;
    }

    public void setPasajero2(Pasajero2 pasajero2) {
        this.pasajero2 = pasajero2;
    }
    
    @Override
    public String toString() {
        return "Coche{" + "chofer= " + chofer + ", copiloto= " + copiloto + ", pasajero1= " + pasajero1 + ", pasajero2= " + pasajero2 + '}';
    }
}