/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.File;

/**
 *
 * @param <Tipo> */

public class Lista <Tipo> {

    private Nodo <Tipo> p;

    public Lista() {
        p = null;
    }

    public Nodo getP() {
        return p;
    }

    public void setP(Nodo p) {
        this.p = p;
    }
    

    public void adiFinal(Estudiante elem) {
        Nodo nuevo = new Nodo();
        nuevo.setE(elem);
        if (p == null) {
            p = nuevo;
        } else {
            Nodo r = p;
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }

    public Tipo eliInicio() {
        Tipo elem = null;
        if (p != null) {
            elem = p.getE();
            p = p.getSig();
        } else {
            System.out.println("lista vacia");
        }
        return elem;
    }

    public int nroElem() {
        Nodo r = p;
        int c = 0;
        while (r != null) {
            r = r.getSig();
            c++;
        }
        return c;
    }
}
