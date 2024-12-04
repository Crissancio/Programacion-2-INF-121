/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mascotas;

/**
 *
 * @author Cristhian1509
 */
public class ListaP {

    private NodoP p;

    ListaP() {
        p = null;
    }

    public NodoP getP() {
        return p;
    }

    public void setP(NodoP p) {
        this.p = p;
    }

    void adiFinal(Persona xp, ListaM m) {
        NodoP nuevo = new NodoP();
        nuevo.setPersona(xp);
        nuevo.setMascotas(m);
        if (p == null) {
            p = nuevo;
        } else {
            NodoP r = p;
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }

    void adiFinal(Persona xp, int n) {
        NodoP nuevo = new NodoP();
        nuevo.setPersona(xp);
        ListaM mascotas = new ListaM();
        for (int i = 0; i < n; i++) {
            Mascota elem = new Mascota();
            mascotas.adiFinal(elem);
        }
        nuevo.setMascotas(mascotas);
        if (p == null) {
            p = nuevo;
        } else {
            NodoP r = p;
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }

    int nroelem() {
        int c = 0;
        NodoP r = p;
        while (r != null) {
            c++;
            r = r.getSig();
        }
        return c;
    }

}
