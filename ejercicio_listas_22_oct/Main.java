/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_listas_22_oct;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Cristhian1509
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lee = new Scanner(System.in);
        
        LSimpleV vehiculos = new LSimpleV();
        vehiculos.adicionarFinal(new Vehiculo("modelo1","fabricante1","tipo1","Juan"));
        vehiculos.adicionarFinal(new Vehiculo("modelo2","fabricante2","tipo2","Pedro"));
        vehiculos.adicionarFinal(new Vehiculo("modelo3","fabricante3","tipo1","Pepe"));
        vehiculos.adicionarFinal(new Vehiculo("modelo4","fabricante2","tipo4","Luis"));
        vehiculos.adicionarFinal(new Vehiculo("modelo5","fabricante1","tipo2","Luis"));
        
        LSimpleC conductores = new LSimpleC();
        
        conductores.adicionarFinal(new Conductor("Juan",18));
        conductores.adicionarFinal(new Conductor("Tadeo",28));
        conductores.adicionarFinal(new Conductor("Mauricio",21));
        conductores.adicionarFinal(new Conductor("Pepe",30));
        conductores.adicionarFinal(new Conductor("Luis",41));
        conductores.adicionarFinal(new Conductor("Pedro",31));
        
        /*
        System.out.println("Ingrese cuantos vehiculos va a ingresar");
        int n = lee.nextInt();
        
        for (int i = 0; i < n; i++) {
            Vehiculo v = new Vehiculo();
            vehiculos.adicionarFinal(v);
        }
        
        
        System.out.println("Ingrese cuantos conductores va a ingresar");
        n = lee.nextInt();
        
        for (int i = 0; i < n; i++) {
            Conductor c = new Conductor();
            conductores.adicionarFinal(c);
        }
        */
        
        System.out.println("\t\tLista de Vehiculos");
        vehiculos.mostrar();
        System.out.println("\t\tLista de Conductores");
        conductores.mostrar();
        
        System.out.println("\t\t---a)  Mostrar el conductor con mayor numero de vehiculos");
        mostrarConductorMasVehiculo(conductores, vehiculos);
        
        System.out.println("\t\t---b)  Mostrar el Conductor del Vehiculo de modelo X");
        mostrarConductorVehiculoModeloX(vehiculos, conductores, "modelo2");
    
        System.out.println("\t\t---c) Contar los vehículos que son del fabricante X y son conducidos por el conductor Y. ");
        ContarVehiculoFabXConY("fabricante1", "Luis", vehiculos);
        
        System.out.println("\t\t---d) Eliminar los conductores que no poseen ningún vehículo.");
        EliminarConductorSinVehiculo(conductores, vehiculos);
        conductores.mostrar();
        
        
    }
    
    public static boolean tieneVehiculo(String nombre, LSimpleV vehis){
        NodoV r = vehis.getP();
        while(r!=null){
            if(r.getV().getNombreConductor().equals(nombre)){
                return true;
            }
            r = r.getSig();
        }
        return false;
    }
    
    //----------
    public static void EliminarConductorSinVehiculo(LSimpleC conducs, LSimpleV vehis){
        int n = conducs.nroElem();
        Conductor c = null;
        
        for (int i = 0; i < n; i++) {
            c = conducs.eliminarInicio();
            if(tieneVehiculos(c.getNombre(), vehis)){
                conducs.adicionarFinal(c);
            }
        }
    }
    
    public static boolean tieneVehiculos(String nombre, LSimpleV vehis){
        boolean tiene = false;
        int n = vehis.nroElem();
        Vehiculo v = null;
        
        for (int i = 0; i < n; i++) {
            v = vehis.eliminarInicio();
            if(v.getNombreConductor().equals(nombre)){
                tiene = true;
            }
            vehis.adicionarFinal(v);
        }
        return tiene;
    }
    
    public static void ContarVehiculoFabXConY(String fabricante, String conductor, LSimpleV vehis){
        int c = 0;
        int n = vehis.nroElem();
        Vehiculo v = null;
        for (int i = 0; i < n; i++) {
            v = vehis.eliminarInicio();
            if(v.getFabricante().equals(fabricante) && v.getNombreConductor().equals(conductor)){
                c++;
            }
            vehis.adicionarFinal(v);
        }
        System.out.println(c+ " vehiculos son del fabricante "+fabricante+" y son conducidos por el conductor "+conductor);
    }
    
    
    //b)-------------------------------
    public static void mostrarConductorVehiculoModeloX(LSimpleV vehis, LSimpleC conducs,String modelo){
        int n = vehis.nroElem();
        Vehiculo v = null;
        for (int i = 0; i < n; i++) {
            v = vehis.eliminarInicio();
            if(v.getModelo().equals(modelo)){
                mostrarConductorNombreX(conducs, v.getNombreConductor());
            }
            vehis.adicionarFinal(v);
        }
    }
    
    public static void mostrarConductorNombreX(LSimpleC conducs, String nombre){
        int n = conducs.nroElem();
        Conductor c = null;
        
        for(int i = 0; i< n; i++){
            c = conducs.eliminarInicio();
            if(c.getNombre().equals(nombre)){
                c.mostrar();
            }
            conducs.adicionarFinal(c);
        }
    }
    
    
    //a)-----------------------------------------------------------------------------
    public static void mostrarConductorMasVehiculo(LSimpleC conducs, LSimpleV vehis){
        int n = conducs.nroElem();
        int max = 0;
        Conductor c = null;
        for (int i = 0; i < n; i++) {
            c = conducs.eliminarInicio();
            int maxC = contarVehiculos(vehis, c.getNombre());
            if(maxC > max){
                max = maxC;
            }
            conducs.adicionarFinal(c);
        }
        
        for(int i = 0; i<n; i++){
            c = conducs.eliminarInicio();
            if(contarVehiculos(vehis, c.getNombre()) == max){
                c.mostrar();
            }
            conducs.adicionarFinal(c);
        }
    }
    
    public static int contarVehiculos(LSimpleV vehis, String nombre){
        int n = vehis.nroElem();
        int c = 0;
        Vehiculo v = null;
        for (int i = 0; i < n; i++) {
            v = vehis.eliminarInicio();
            if(v.getNombreConductor().equals(nombre)){
                c++;
            }
            vehis.adicionarFinal(v);
        }
        return c;
    }
    
    
    
}
