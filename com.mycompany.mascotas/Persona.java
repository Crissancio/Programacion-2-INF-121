/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mascotas;

/**
 *
 * @author Cristhian1509
 */
public class Persona {
    private String nombre;
    private int edad, ci;

    public Persona(String nombre, int edad, int ci) {
        this.nombre = nombre;
        this.edad = edad;
        this.ci = ci;
    }
    void mostrar(){
        System.out.println(nombre+ " "+ci+" "+edad);
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

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
    
}
