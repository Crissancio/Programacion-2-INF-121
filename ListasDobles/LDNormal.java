/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasDobles;

/**
 *
 * @author Cristhian1509
 */
public class LDNormal extends LDoble {

    LDNormal() {
        super();
    }

    public NodoD getP() {
        return p;
    }

    public void setP(NodoD p) {
        this.p = p;
    }

    boolean esVacia() {
        return super.esVacia();
    }

    void adiInicio(Object elem) {
        NodoD nuevo;
        nuevo = new NodoD();
        nuevo.setElemento(elem);
        nuevo.setSig(p);
        if (p != null) {
            p.setAnt(nuevo);
        }
        p = nuevo;
    }

    void adiFinal(Object elem) {
        NodoD nuevo, r;
        nuevo = new NodoD();
        nuevo.setElemento(elem);
        if (esVacia()) {
            p = nuevo;
        } else {
            r = p;
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
            nuevo.setAnt(r);
        }
    }

    Object eliInicio() {
        Object dato = null;
        if (!esVacia()) {
            NodoD r = p.getSig();
            dato = p.getElemento();
            r.setAnt(null);
            p = r;
        } else {
            System.out.println("Lista Vacia!!!");
        }

        return dato;
    }

    Object eliFinal() {
        Object dato = null;
        if (!esVacia()) {
            NodoD r = p, w = r;
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
        NodoD r = p;
        while (r != null) {
            c++;
            r = r.getSig();
        }
        return c;
    }

    void mostrar() {
        NodoD r = p;
        while (r != null) {
            System.out.print(r.getElemento() + " ");
            r = r.getSig();
        }
        System.out.println("");
    }
}
