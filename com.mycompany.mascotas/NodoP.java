/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mascotas;

/**
 *
 * @author Cristhian1509
 */
public class NodoP {
    private Persona persona;
    private ListaM mascotas;
    private NodoP sig;
    NodoP(){
        sig = null;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public ListaM getMascotas() {
        return mascotas;
    }

    public void setMascotas(ListaM mascotas) {
        this.mascotas = mascotas;
    }

    public NodoP getSig() {
        return sig;
    }

    public void setSig(NodoP sig) {
        this.sig = sig;
    }
}
