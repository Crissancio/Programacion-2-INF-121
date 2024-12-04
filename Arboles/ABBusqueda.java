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
public class ABBusqueda extends ABinario {

    public ABBusqueda() {
        super();
    }

    NodoAr getRaiz() {
        return r;
    }

    void setRaiz(NodoAr k) {
        r = k;
    }

    int alturaArbol() {
        return (super.alturalArbol());
    }

    int gradoaArbol() {
        return (super.gradoArbol());
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

    void llenar() {
        int i, sw, dx, dy;
        NodoAr y, x;
        Object da;
        Scanner lee = new Scanner(System.in);
        System.out.println("Número de elementos?");
        int n = lee.nextInt();
        x = new NodoAr();
        System.out.println("Ingrese dato entero al árbol?");
        da = new Integer(lee.nextInt());
        x.setDato(da);
        setRaiz(x);
        for (i = 1; i < n; i++) {
            x = new NodoAr();
            System.out.println("Ingrese dato entero al árbol?");
            da = new Integer(lee.nextInt());
            x.setDato(da);
            y = r;
            sw = 0;
            while (sw == 0) {
                dx = x.getDato().hashCode();
                dy = y.getDato().hashCode();
                if (dx < dy) {
                    if (y.getSi() == null) {
                        y.setSi(x);
                        sw = 1;
                    } else {
                        y = y.getSi();
                    }
                } else if (y.getSd() == null) {
                    y.setSd(x);
                    sw = 1;
                } else {
                    y = y.getSd();
                }
            }
        }
    }

    void insertar(NodoAr y, NodoAr ra)//recursivoqueinsertaundatoal ABB
    {
        int dar, day;
        dar = (ra.getDato()).hashCode();
        day = (y.getDato()).hashCode();
        if (day < dar) {
            if (ra.getSi() == null) {
                ra.setSi(y);
            } else {
                insertar(y, ra.getSi());
            }
        } else if (ra.getSd() == null) {
            ra.setSd(y);
        } else {
            insertar(y, ra.getSd());
        }
    }
}
