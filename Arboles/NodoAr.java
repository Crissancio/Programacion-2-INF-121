/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arboles;

/**
 *
 * @author Cristhian1509
 */
public class NodoAr {

    private Object dato;
    private NodoAr si, sd;

    NodoAr() {
        si = sd = null;
    }

    public NodoAr getSi() {
        return si;
    }

    public void setSi(NodoAr si) {
        this.si = si;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoAr getSd() {
        return sd;
    }

    public void setSd(NodoAr sd) {
        this.sd = sd;
    }

}
