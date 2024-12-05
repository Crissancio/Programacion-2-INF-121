/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.File;

/**
 *
 * @author Cristhian1509
 */
public class Proyecto {

    public Lista<Estudiante> estudiantes = new Lista<Estudiante>();

    String rutaEstudiantes = "C:/Users/Cristhian1509/Documents/NetBeansProjects/Interfaz2/src/Archivos/estudiantes/";

    public Proyecto() {
        cargarEstudiantes();
    }

    public void cargarEstudiantes() {
        File carpeta = new File(rutaEstudiantes);

        if (carpeta.isDirectory()) {
            File[] listaArchivos = carpeta.listFiles();
            if (listaArchivos != null) {
                for (File archivo : listaArchivos) {
                    Estudiante elem = new Estudiante(archivo.getAbsolutePath());
                    estudiantes.adiFinal(elem);
                }
            } else {
                System.out.println("Carpeta sin Archivos");
            }
        } else {
            System.out.println("La ruta no es un directorio");
        }
    }

    public void agregarEstudiante(String nombre, String apellido, int edad) {
        int id = conseguirIdMayorE();
        Estudiante nuevo = new Estudiante(id, nombre, apellido, edad);
        estudiantes.adiFinal(nuevo);
    }

    public int conseguirIdMayorE() {
        int id = 0;
        int n = estudiantes.nroElem();
        for (int i = 0; i < n; i++) {
            Estudiante elem = estudiantes.eliInicio();
            if (elem.getId() > id) {
                id = elem.getId();
            }
            estudiantes.adiFinal(elem);
        }
        return id+1;
    }

    /*-----------------------GETTERS Y SETTERS--------------------------------*/
    public Lista<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Lista<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

}
