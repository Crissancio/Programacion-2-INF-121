/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Cristhian1509
 */
public class NodoS <Tipo> {
    private Tipo dato;
    private NodoS sig;
    
    public NodoS(){
        sig = null;
    }

    public NodoS getSig() {
        return sig;
    }

    public void setSig(NodoS sig) {
        this.sig = sig;
    }

    public Tipo getDato() {
        return dato;
    }

    public void setDato(Tipo dato) {
        this.dato = dato;
    }
    
}
