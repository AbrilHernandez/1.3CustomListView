package com.example.abril.customlistview;

/**
 * Created by Abril on 04/09/2017.
 */
public class Persona {
    private String nombre;
    private char genero;
    private String nocontrol;
    private String carrera;

    public Persona(String nombre, char genero, String nocontrol, String carrera) {
        this.nombre=nombre;
        this.genero=genero;
        this.nocontrol=nocontrol;
        this.carrera = carrera;

    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {return genero;}

    public String getNocontrol(){return nocontrol;}
    public String getCarrera(){return carrera;}
}