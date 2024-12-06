/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.File;

/**
 *
 * @param <Tipo> */

public class LSimple <Tipo> {

    private NodoS <Tipo> p;

    public LSimple() {
        p = null;
    }

    public NodoS getP() {
        return p;
    }

    public void setP(NodoS p) {
        this.p = p;
    }

    public void adiFinal(Tipo elem) {
        NodoS nuevo = new NodoS();
        nuevo.setDato(elem);
        if (p == null) {
            p = nuevo;
        } else {
            NodoS r = p;
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }

    public Tipo eliInicio() {
        Tipo elem = null;
        if (p != null) {
            elem = p.getDato();
            p = p.getSig();
        } else {
            System.out.println("lista vacia");
        }
        return elem;
    }

    public int nroElem() {
        NodoS r = p;
        int c = 0;
        while (r != null) {
            r = r.getSig();
            c++;
        }
        return c;
    }
}
