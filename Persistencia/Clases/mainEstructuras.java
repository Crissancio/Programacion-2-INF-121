/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

import java.io.File;

/**
 *
 * @author Cristhian1509
 */
public class mainEstructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String rutaDocentes = "C:/Users/Cristhian1509/Documents/NetBeansProjects/Persistencia/src/main/java/Archivos/Docentes";
        Pila<Docente> pilaDocentes = new Pila<Docente>(100);
        cargarDocentesPila(rutaDocentes, pilaDocentes);
        
        System.out.println("\t\t-->Mostrando los docentes de la pila<--");
        
        Pila <Docente> aux = new Pila<>(100);
        while(!pilaDocentes.esVacia()){
            Docente elem = pilaDocentes.eliminar();
            elem.mostrar();
            aux.adicionar(elem);
        }
        pilaDocentes.vaciar(aux);
        
        
        LSimple<Docente> listaDocentes = new LSimple<>();
        cargarDocentesLista(rutaDocentes, listaDocentes);
        System.out.println("\t\t-->Mostrando los docentes de la Lista<--");
        int n = listaDocentes.nroElem();
        for (int i = 0; i < n; i++) {
            Docente elem = listaDocentes.eliInicio();
            elem.mostrar();
            listaDocentes.adiFinal(elem);
        }

        CSimple<Docente> colaSDocentes = new CSimple<Docente>(100);
        cargarDocentesCSimple(rutaDocentes, colaSDocentes);
        System.out.println("\t\t-->Mostrando los docentes de la Cola<--");
        CSimple<Docente> auxCS = new CSimple<Docente>(100);
        while(!colaSDocentes.esVacia()){
            Docente elem = colaSDocentes.eliminar();
            elem.mostrar();
            auxCS.adicionar(elem);
        }
        colaSDocentes.vaciar(auxCS);
        
        CCircular<Docente> colaCDocentes = new CCircular<Docente>(100);
        cargarDocentesCCircular(rutaDocentes, colaCDocentes);
        System.out.println("\t\t-->Mostrando los docentes de la Cola<--");
        CCircular<Docente> auxCC = new CCircular<Docente>(100);
        while(!colaCDocentes.esVacia()){
            Docente elem = colaCDocentes.eliminar();
            elem.mostrar();
            auxCC.adicionar(elem);
        }
        colaCDocentes.vaciar(auxCC);


    }
    
    public static void cargarDocentesPila(String ruta, Pila<Docente> p){
        //Carga los archivos de la carpeta
        File carpeta = new File(ruta);
        if (carpeta.isDirectory()) {
            
            //Obtiene la lista de archivos de la carpeta
            File[] listaArchivos = carpeta.listFiles();
            if (listaArchivos != null) {
                
                //Recorre la lista de archivos
                for (File archivo : listaArchivos) {
                    //Instanciamos un Objecto y utilizamos el constructor por archivo
                    //(DEBEMOS MANDAR LA RUTA ABSOLUTA DEL ARCHIVO)
                    Docente elem = new Docente(archivo.getAbsolutePath());
                    p.adicionar(elem);
                }
            } else {
                System.out.println("Carpeta sin Archivos");
            }
        } else {
            System.out.println("La ruta no es un directorio");
        }
    }

    public static void cargarDocentesCSimple(String ruta, CSimple<Docente> cola){
        //Carga los archivos de la carpeta
        File carpeta = new File(ruta);
        if (carpeta.isDirectory()) {
            
            //Obtiene la lista de archivos de la carpeta
            File[] listaArchivos = carpeta.listFiles();
            if (listaArchivos != null) {
                
                //Recorre la lista de archivos
                for (File archivo : listaArchivos) {
                    //Instanciamos un Objecto y utilizamos el constructor por archivo
                    //(DEBEMOS MANDAR LA RUTA ABSOLUTA DEL ARCHIVO)
                    Docente elem = new Docente(archivo.getAbsolutePath());
                    cola.adicionar(elem);
                }
            } else {
                System.out.println("Carpeta sin Archivos");
            }
        } else {
            System.out.println("La ruta no es un directorio");
        }
    }

    public static void cargarDocentesCCircular(String ruta, CCircular<Docente> cola){
        //Carga los archivos de la carpeta
        File carpeta = new File(ruta);
        if (carpeta.isDirectory()) {
            
            //Obtiene la lista de archivos de la carpeta
            File[] listaArchivos = carpeta.listFiles();
            if (listaArchivos != null) {
                
                //Recorre la lista de archivos
                for (File archivo : listaArchivos) {
                    //Instanciamos un Objecto y utilizamos el constructor por archivo
                    //(DEBEMOS MANDAR LA RUTA ABSOLUTA DEL ARCHIVO)
                    Docente elem = new Docente(archivo.getAbsolutePath());
                    cola.adicionar(elem);
                }
            } else {
                System.out.println("Carpeta sin Archivos");
            }
        } else {
            System.out.println("La ruta no es un directorio");
        }
    }
    
    
    public static void cargarDocentesLista(String ruta, LSimple<Docente> lista){
        //Carga los archivos de la carpeta
        File carpeta = new File(ruta);
        if (carpeta.isDirectory()) {
            
            //Obtiene la lista de archivos de la carpeta
            File[] listaArchivos = carpeta.listFiles();
            if (listaArchivos != null) {
                
                //Recorre la lista de archivos
                for (File archivo : listaArchivos) {
                    //Instanciamos un Objecto y utilizamos el constructor por archivo
                    //(DEBEMOS MANDAR LA RUTA ABSOLUTA DEL ARCHIVO)
                    Docente elem = new Docente(archivo.getAbsolutePath());
                    lista.adiFinal(elem);
                }
            } else {
                System.out.println("Carpeta sin Archivos");
            }
        } else {
            System.out.println("La ruta no es un directorio");
        }
    }

   
}
