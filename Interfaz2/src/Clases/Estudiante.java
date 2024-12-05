/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Cristhian1509
 */
public class Estudiante {

    private String ruta = "C:/Users/Cristhian1509/Documents/NetBeansProjects/Interfaz2/src/Archivos/estudiantes/" + "estudiante";

    private String nombre, apellido;
    private int edad, id;

    public Estudiante(int id, String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = id;
        ruta = ruta + id + ".txt";
        crearArchivo();

    }

    public Estudiante(String ruta) {
        this.ruta = ruta;
        try {
            FileReader archivo = new FileReader(ruta);
            if (archivo != null) {
                BufferedReader lector = new BufferedReader(archivo);
                this.id = Integer.parseInt(lector.readLine());
                this.nombre = lector.readLine();
                this.apellido = lector.readLine();
                this.edad = Integer.parseInt(lector.readLine());
            }
            archivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo() {
        try {
            File archivo = new File(ruta);

            if (archivo.getParentFile() != null) {
                archivo.getParentFile().mkdirs();
            }

            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getAbsolutePath());
            } else {
                System.out.println("El archivo ya existe.");
            }

            FileWriter escritor = new FileWriter(archivo);
            escritor.write(id + "\n");
            escritor.write(nombre + "\n");
            escritor.write(apellido+"\n");
            escritor.write(edad + "");
            escritor.close();
            System.out.println("Se escribió en el archivo.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al manejar la ruta.");
            e.printStackTrace();
        }
    }

    public void leerArchivo() {
        String rutaArchivo = ruta;

        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            // Leer línea por línea
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + rutaArchivo);
            e.printStackTrace();
        }
    }

    public void eliminarArchivo() {

        File archivo = new File(ruta);

        if (archivo.exists()) {
            if (archivo.delete()) {
                System.out.println("Archivo eliminado exitosamente.");
            } else {
                System.out.println("No se pudo eliminar el archivo.");
            }
        } else {
            System.out.println("El archivo no existe.");
        }
    }

    public void actualizarArchivo() {
        eliminarArchivo();
        crearArchivo();
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void mostrar() {
        System.out.println(nombre + " " + edad);
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
