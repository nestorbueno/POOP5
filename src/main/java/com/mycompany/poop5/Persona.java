package com.mycompany.poop5;

public class Persona {
    private String nombre;
    private int edad;
    private float altura;
    private String ocupacion;
    private Fecha fechaDeNacimiento;

    public Persona() {
        nombre = "";
        edad = 0;
        altura = 0.0f;
        ocupacion = "";
        fechaDeNacimiento = new Fecha();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Fecha getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura
                + ", ocupacion=" + ocupacion + ", fechaDeNacimiento=" + fechaDeNacimiento + "]";
    }
}
