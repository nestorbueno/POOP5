/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.poop5;

/**
 *
 * @author estudiante
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo = new Circulo();
        circulo.getRadio();
        System.out.println(circulo.getRadio());
        circulo.setRadio(7.77f);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        //System.out.println("·······················");
        Fecha fechaDeNacimiento = new Fecha();
        fechaDeNacimiento.setDia(8);
        fechaDeNacimiento.setMes(10);
        fechaDeNacimiento.setAño(2005);   
        System.out.println("·······················");
        Persona persona = new Persona();
        persona.setAltura(1.72f);
        persona.setEdad(18);
        persona.setNombre("Nestor");
        persona.setFechaDeNacimiento(fechaDeNacimiento);
        persona.setOcupacion("estudiante");
        System.out.println(persona.getAltura());
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getFechaDeNacimiento());
        System.out.println(persona.getOcupacion());
        System.out.println(persona);
        System.out.println("·······················");
        System.out.println("Creando un coche con sus ocupantes:");
        Coche miCoche = new Coche();
        miCoche.setChofer(new Chofer());
        miCoche.setCopiloto(new Copiloto());
        miCoche.setPasajero1(new Pasajero1());
        miCoche.setPasajero2(new Pasajero2());
        
        miCoche.mostrarOcupantes();
        
        System.out.println(miCoche);
    }
    
    
}