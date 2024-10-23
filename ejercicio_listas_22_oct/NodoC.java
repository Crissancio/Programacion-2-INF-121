/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_listas_22_oct;

/**
 *
 * @author Cristhian1509
 */
public class NodoC {
    private Conductor c;
    private NodoC sig;
    
    NodoC(){
        sig = null;
    }

    public Conductor getC() {
        return c;
    }

    public void setC(Conductor c) {
        this.c = c;
    }

    public NodoC getSig() {
        return sig;
    }

    public void setSig(NodoC sig) {
        this.sig = sig;
    }
}
