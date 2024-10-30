/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mascotas;

/**
 *
 * @author Cristhian1509
 */
public class Mascotas {

    public static void main(String[] args) {
        ListaM m1 = new ListaM();
        m1.adiFinal(new Mascota("Angelo", "Perro", 2));
        m1.adiFinal(new Mascota("Naranjo", "Gato", 5));
        m1.adiFinal(new Mascota("Bolainas", "Loro", 3));
        
        ListaP personas = new ListaP();
        personas.adiFinal(new Persona("Juan", 25, 1111), m1);
        personas.adiFinal(new Persona("Pedro", 18, 1212), 2);
        
        /*mostrar*/
        NodoP r = personas.getP();
        while(r != null){
            r.getPersona().mostrar();
            r.getMascotas().mostrar();
            r = r.getSig();
        }
        /*Mostrar las mascotas de la persona con nombre X*/
        String nombre = "Juan";
        NodoP m = personas.getP();
        while(m!=null){
            if(m.getPersona().getNombre().equals(nombre)){
                System.out.println("\t---Mascotas de "+nombre);
                m.getMascotas().mostrar();
            }
            m = m.getSig();
        }
        
    }
}
