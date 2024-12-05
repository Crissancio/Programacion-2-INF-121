/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Cristhian1509
 */
public class Nodo <Tipo> {
    private Tipo e;
    private Nodo sig;
    
    public Nodo(){
        sig = null;
    }

    public Tipo getE() {
        return e;
    }

    public void setE(Tipo e) {
        this.e = e;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
}
