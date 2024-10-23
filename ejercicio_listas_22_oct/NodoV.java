/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_listas_22_oct;

/**
 *
 * @author Cristhian1509
 */
public class NodoV {
    private Vehiculo v;
    private NodoV sig;
    
    NodoV(){
        sig = null;
    }

    public Vehiculo getV() {
        return v;
    }

    public void setV(Vehiculo v) {
        this.v = v;
    }

    public NodoV getSig() {
        return sig;
    }

    public void setSig(NodoV sig) {
        this.sig = sig;
    }
}
