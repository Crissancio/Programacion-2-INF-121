/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arboles;

/**
 *
 * @author Cristhian1509
 */
public abstract class ABinario {

    protected NodoAr r;

    ABinario() {
        r = null;
    }

    boolean esVacia() {
        if (r == null) {
            return true;
        }
        return false;
    }

    NodoAr getRaiz() {
        return r;
    }

    void setRaiz(NodoAr y) {
        r = y;
    }

    abstract void llenar();

    void m_Nivel() //Mostrarelementospornivel
{
        Pila nivel = new Pila(100);
        Pila su = new Pila(100);
        int n;
        NodoAr x, w;
        int res;
        nivel.adicionar(r);
        while (!nivel.esVacia()) {
            while (!nivel.esVacia()) {
                x = (NodoAr) nivel.eliminar();
                System.out.print(x.getDato() + "\t");
                if (x.getSi() != null) {
                    su.adicionar(x.getSi());
                }
                if (x.getSd() != null) {
                    su.adicionar(x.getSd());
                }
            }
            nivel.vaciar(su);
            System.out.println();
        }
    }

    void m_Enorden() //mostrardatosdelárbolenorden IRD
    {
        Pila p = new Pila(100);
        NodoAr x = r;
        p.adicionar(null);
        while (p.nElem() != 0) {
            while (x != null) {
                p.adicionar(x);
                x = x.getSi();
            }
            x = (NodoAr) p.eliminar();
            if (x != null) {
                System.out.print(x.getDato() + " ");
                x = x.getSd();
            }
        }
    }

    void m_Preorden() {
        NodoAr x, nd, ni;
        Pila p = new Pila(100);
        p.adicionar(null);
        x = r;
        while (x != null) {
            System.out.print(x.getDato() + " ");
            nd = x.getSd();
            ni = x.getSi();
            if (nd != null) {
                p.adicionar(nd);
            }
            if (ni != null) {
                x = ni;
            } else {
                x = (NodoAr) p.eliminar();
            }
        }
    }

    void m_Posorden() {
        NodoAr nd, x;
        Pila p = new Pila(100);
        p.adicionar(null);
        x = r;
        while (p.nElem() != 0) {
            while (x != null) {
                p.adicionar(x);
                nd = x.getSd();
                if (nd != null) {
                    p.adicionar(nd);
                    p.adicionar(null);
                }
                x = x.getSi();
            }
            x = (NodoAr) p.eliminar();
            while (x != null) {
                System.out.print(x.getDato() + " ");
                x = (NodoAr) p.eliminar();
            }
            if (p.nElem() != 0) {
                x = (NodoAr) p.eliminar();
            }
        }
    }

    void m_EnordenRecu(NodoAr y)// IRD
    {
        if (y != null) {
            m_EnordenRecu(y.getSi());
            System.out.print(y.getDato() + "\t");
            m_EnordenRecu(y.getSd());
        }
    }

    void m_PreordenRecu(NodoAr y) {
        if (y != null) {
            System.out.print(y.getDato() + "\t");
            m_PreordenRecu(y.getSi());
            m_PreordenRecu(y.getSd());
        }
    }

    void m_PosordenRecu(NodoAr y)//ID
    {
        if (y != null) {
            m_PosordenRecu(y.getSi());
            m_PosordenRecu(y.getSd());
            System.out.print(y.getDato() + "\t");
        }
    }

    int alturalArbol() //Calculalaalturadelárbol
    {
        Pila nivel = new Pila(100);
        Pila su = new Pila(100);
        int n, res, alt = 0;
        NodoAr x, w;
        nivel.adicionar(r);
        while (!nivel.esVacia()) {
            while (!nivel.esVacia()) {
                x = (NodoAr) nivel.eliminar();
                System.out.print(x.getDato() + "\t");
                if (x.getSi() != null) {
                    su.adicionar(x.getSi());
                }
                if (x.getSd() != null) {
                    su.adicionar(x.getSd());
                }
            }
            nivel.vaciar(su);
            alt++;
            System.out.println();
        }
        return alt;
    }

    int gradoArbol() {
        Pila nivel = new Pila(100);
        Pila su = new Pila(100);
        int n;
        NodoAr x, w;
        int res, maxgra = 0, gra;
        nivel.adicionar(r);
        while (!nivel.esVacia()) {
            while (!nivel.esVacia()) {
                x = (NodoAr) nivel.eliminar();
                gra = 1;
                System.out.print(x.getDato() + "\t");
                if (x.getSi() != null) {
                    su.adicionar(x.getSi());
                }
                if (x.getSd() != null) {
                    su.adicionar(x.getSd());
                }
                if ((x.getSi() != null) && (x.getSd() != null)) {
                    gra = 2;
                }
                if ((x.getSi() == null) && (x.getSd() == null)) {
                    gra = 0;
                }
                if (gra > maxgra) {
                    maxgra = gra;
                }
            }
            nivel.vaciar(su);
            System.out.println();
        }
        return maxgra;
    }

}
