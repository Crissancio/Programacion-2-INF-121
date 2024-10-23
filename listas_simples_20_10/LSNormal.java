/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas_simples_20_10;
/**
 *
 * @author Cristhian1509
 */
public class LSNormal extends LSimple {

    public LSNormal() {
        super();
    }

    public NodoS getP() {
        return p;
    }

    public void setP(NodoS p) {
        this.p = p;
    }

    boolean esVacia() {
        return super.esVacia();
    }

    void adiInicio(Object elem) {
        NodoS nuevo;
        nuevo = new NodoS();
        nuevo.setElemento(elem);
        nuevo.setSig(p);
        p = nuevo;
    }

    void mostrar() {
        NodoS r = p;
        while (r != null) {
            System.out.print(r.getElemento() + " ");
            r = r.getSig();
        }
        System.out.println("");
    }

    void adiFinal(Object elem) {
        NodoS nuevo, r;
        nuevo = new NodoS();
        nuevo.setElemento(elem);
        if (esVacia()) {
            p = nuevo;
        } else {
            r = p;
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }

    Object eliInicio() {
        Object dato = null;
        if (!esVacia()) {
            NodoS r = p.getSig();
            dato = p.getElemento();
            p = r;
        } else {
            System.out.println("Lista Vacia!!!");
        }

        return dato;
    }

    Object eliFinal() {
        Object dato = null;
        if (!esVacia()) {
            NodoS r = p, w = r;
            while (r.getSig() != null) {
                w = r;
                r = r.getSig();
            }
            dato = r.getElemento();
            w.setSig(null);
        } else {
            System.out.println("Lista Vacia!!!");
        }

        return dato;
    }

    int nroElem() {
        int c = 0;
        NodoS r = p;
        while (r != null) {
            c++;
            r = r.getSig();
        }
        return c;
    }
}
