/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_listas_22_oct;
import java.util.Scanner;
/**
 *
 * @author Cristhian1509
 */
public class Vehiculo {
    private String modelo, fabricante, tipo, nombreConductor;

    public Vehiculo(String modelo, String fabricante, String tipo, String nombreConductor) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.nombreConductor = nombreConductor;
    }
    
    public Vehiculo(){
        Scanner lee = new Scanner(System.in);
        System.out.println("\tIngresar: modelo, fabricante, tipo, conductor");
        modelo = lee.nextLine();
        fabricante = lee.nextLine();
        tipo = lee.nextLine();;
        nombreConductor = lee.nextLine();
    }
    void mostrar(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Fabricante: "+fabricante);
        System.out.println("Tipo: "+tipo);
        System.out.println("Conductor: "+nombreConductor+"\n");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }
}
