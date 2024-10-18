/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasDobles;

/**
 *
 * @author Cristhian1509
 */
public abstract class LDoble {

    protected NodoD p;

    public LDoble() {
        p = null;
    }

    boolean esVacia() {
        return p == null;
    }

    abstract void adiInicio(Object elem);

    abstract void adiFinal(Object elem);

    abstract Object eliInicio();

    abstract Object eliFinal();

    abstract int nroElem();

    abstract void mostrar();

}
