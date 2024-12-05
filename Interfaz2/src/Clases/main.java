/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

/**
 *
 * @author Cristhian1509
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Lista<Estudiante> lista = new Lista();

        System.out.println("---------------------");

        int i = 3;

        int n = lista.nroElem();

        for (int j = 0; j < n; j++) {
            Estudiante elem = lista.eliInicio();

            if (elem.getId() == i) {
                System.out.println(elem.getRuta());
                elem.eliminarArchivo();
            } else {
                lista.adiFinal(elem);
            }

        }

        for (int j = 0; j < n; j++) {
            Estudiante elem = lista.eliInicio();
            elem.mostrar();
            lista.adiFinal(elem);
        }

    }

}