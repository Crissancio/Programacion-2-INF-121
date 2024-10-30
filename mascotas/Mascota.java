/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mascotas;
import java.util.Scanner;
/**
 *
 * @author Cristhian1509
 */
public class Mascota {
    private String nombre, tipo;
    private int edad;

    Mascota(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }
    Mascota(){
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingresar: nombre / tipo / edad");
        nombre = lee.next();
        tipo = lee.next();
        edad = lee.nextInt();
    }
    void mostrar(){
        System.out.println("\t"+nombre+ " "+ tipo+" "+edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
