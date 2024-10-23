/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_listas;
import java.util.Scanner;
/**
 *
 * @author Cristhian1509
 */
public class Conductor {
    private String nombre;
    private int edad;

    public Conductor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Conductor(){
        Scanner lee = new Scanner(System.in);
        System.out.println("\tIngresar nombre, edad");
        nombre = lee.next();
        edad = lee.nextInt();
    }
    
    void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad+"\n");
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
    
    
    
}
