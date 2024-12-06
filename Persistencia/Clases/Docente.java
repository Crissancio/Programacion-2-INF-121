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
import java.nio.Buffer;

/**
 *
 * @author Cristhian1509
 */
public class Docente {
    private String nombre, paterno, materno;
    private int id_docente;
    private float sueldo;
    
    //RUTA ABSOLUTA DE LA CARPETA DONDE SE ALAMCENAN LOS ARCHIVOS DEL TIPO DE OBJETO
    //+tipo_objeto
    private String ruta = "C:/Users/Cristhian1509/Documents/NetBeansProjects/Persistencia/src/main/java/Archivos/Docentes/docente";

    
    //Contructor - Datos por parametros
    public Docente(String nombre, String paterno, String materno, int id_docente, float sueldo) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.id_docente = id_docente;
        this.sueldo = sueldo;
        
        ruta = ruta+id_docente+".txt";
        crearArchivo();
    }
    
    //Constructor - Datos por archivo
    public Docente(String ruta){
        this.ruta = ruta;
        try{
            FileReader archivo = new FileReader(ruta);
            if(archivo != null){
                BufferedReader lector = new BufferedReader(archivo);
                
                //Recupera los dato de CADA LINEA DEL ARCHIVO
                //->TENER EN CUENTA EL ORDEN EN COMO SE GUARDARON LOS DATOS EN EL ARCHIVO<--
                id_docente = Integer.parseInt(lector.readLine());
                nombre = lector.readLine();
                paterno = lector.readLine();
                materno = lector.readLine();
                sueldo = Float.parseFloat(lector.readLine());   
            }
            archivo.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public void crearArchivo(){
        try{
            File archivo = new File(ruta);
            
            //Verifica si las carpetas existen, caso contrario las crea
             if (archivo.getParentFile() != null) {
                archivo.getParentFile().mkdirs();
            }
            
            //Verifica si el archivo existe
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getAbsolutePath());
            } else {
                System.out.println("El archivo ya existe.");
            }
            
            FileWriter escritor = new FileWriter(archivo);
            
            //Escribimos en el archivo
            //Agregar siempre el salto de linea
            escritor.write(id_docente+"\n");
            escritor.write(nombre+"\n");
            escritor.write(paterno+"\n");
            escritor.write(materno+"\n");
            escritor.write(sueldo+"");
            
            escritor.close();
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void leerArchivo() {
        try (BufferedReader lector = new BufferedReader(new FileReader(ruta))) {
            String linea;

            // Leer línea por línea
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + ruta);
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
    
    public void mostrar(){
        System.out.println(nombre+" "+paterno+" "+materno+" "+sueldo);
    }
    
    public void actualizarArchivo() {
        eliminarArchivo();
        crearArchivo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getId_docente() {
        return id_docente;
    }

    public void setId_docente(int id_docente) {
        this.id_docente = id_docente;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
