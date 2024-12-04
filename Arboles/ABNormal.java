/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arboles;

import java.util.Scanner;

/**
 *
 * @author Cristhian1509
 */
public class ABNormal extends ABinario {

    ABNormal() {
        super();
    }

    NodoAr getRaiz() {
        return r;
    }

    void setRaiz(NodoAr k) {
        r = k;
    }

    void llenar() //llenaporniveldatosenteros
    {
        Pila nivel = new Pila(100);
        Pila su = new Pila(100);
        int n;
        NodoAr w, x;
        int res;
        r = new NodoAr();
        Scanner lee = new Scanner(System.in);
        System.out.println("Digite dato de la raiz");
        Object dato = new Integer(lee.nextInt());
        r.setDato(dato);
        nivel.adicionar(r);
        while (!nivel.esVacia()) {
            while (!nivel.esVacia()) {
                x = (NodoAr) nivel.eliminar();
                System.out.print("Desea descendiente izquierdo de " + x.getDato() + " Si=1 No<>1?");
                res = lee.nextInt();
                if (res == 1) {
                    w = new NodoAr();
                    System.out.println("Digite dato izquierdo");
                    dato = new Integer(lee.nextInt());
                    w.setDato(dato);
                    x.setSi(w);
                    su.adicionar(x.getSi());
                }
                System.out.print("Desea descendiente derecho de " + x.getDato() + " Si=1 No<>1?");
                res = lee.nextInt();
                if (res == 1) {
                    w = new NodoAr();
                    System.out.println("Digite dato derecho");
                    dato = new Integer(lee.nextInt());
                    w.setDato(dato);
                    x.setSd(w);
                    su.adicionar(x.getSd());
                }
            }
            nivel.vaciar(su);
        }
    }

    void m_Nivel() {
        super.m_Nivel();
    }

    void m_Enorden() {
        super.m_Enorden();
    }

    void m_Preorden() {
        super.m_Preorden();
    }

    void m_Posorden() {
        super.m_Posorden();
    }

    void m_PreordenRecu(NodoAr y) {
        super.m_PreordenRecu(y);
    }

    void m_EnordenRecu(NodoAr y) {
        super.m_PreordenRecu(y);
    }

    void m_PosordenRecu(NodoAr y) {
        super.m_PosordenRecu(y);
    }

    int alturaArbol() {
        return (super.alturalArbol());
    }

    int gradoaArbol() {
        return (super.gradoArbol());
    }
}
