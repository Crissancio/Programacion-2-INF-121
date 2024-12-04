/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arboles;

import java.util.Scanner;

/**
 *
 * @author Cristhian1509
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Diseñar un programa recursivo para hallar el promedio de los digitos 
        //impares de una numero entero positivo
        Scanner lee = new Scanner(System.in);
        /*
        int n = lee.nextInt();
        
        int sum = suma_impares(n);
        int num = n_impares(n);
        System.out.println("sum: " + sum+"\nnum: "+num);
        System.out.println((float) sum/num);*/

        ABBusqueda a = new ABBusqueda();
        a.llenar();

        a.m_Nivel();
        System.out.println("\n");
        int n_eli = ej1(a.getRaiz(), a);

        System.out.println(n_eli);
        a.m_Enorden();

        /*----------------------------------*/
    }

    public static int suma_impares(int n) {
        if (n == 0) {
            return 0;
        } else {
            int elem = n % 10;
            if (elem % 2 != 0) {
                return elem + suma_impares(n / 10);
            } else {
                return suma_impares(n / 10);
            }
        }
    }

    public static int n_impares(int n) {
        if (n == 0) {
            return 0;
        } else {
            int elem = n % 10;
            if (elem % 2 != 0) {
                return 1 + n_impares(n / 10);
            } else {
                return n_impares(n / 10);
            }
        }
    }

    //Dado un ABB contar  y borrar los nodos que tienen un unico descendiente
    //directo
    public static int ej1(NodoAr r, ABBusqueda a) {
        if (r == null) {
            return 0;
        } else {
            NodoAr padre = recuperarPadre(a.getRaiz(), r);
            if (padre != null) {
                if (padre.getSi() == r) {
                    if (r.getSi() == null && r.getSd() != null) {
                        NodoAr elem = r.getSd();
                        padre.setSi(elem);
                        return 1 + ej1(r.getSi(), a) + ej1(r.getSd(), a);
                    } else if (r.getSi() != null && r.getSd() == null) {
                        NodoAr elem = r.getSi();
                        padre.setSi(elem);
                        return 1 + ej1(r.getSi(), a) + ej1(r.getSd(), a);

                    }
                } else if (padre.getSd() == r) {
                    if (r.getSi() == null && r.getSd() != null) {
                        NodoAr elem = r.getSd();

                        padre.setSd(elem);
                        return 1 + ej1(r.getSi(), a) + ej1(r.getSd(), a);
                    } else if (r.getSi() != null && r.getSd() == null) {
                        NodoAr elem = r.getSi();

                        padre.setSd(elem);
                        return 1 + ej1(r.getSi(), a) + ej1(r.getSd(), a);
                    }
                }
            }
            return ej1(r.getSi(), a) + ej1(r.getSd(), a);
        }
    }

    public static NodoAr recuperarPadre(NodoAr z, NodoAr b) {
        if (z == null) {
            return null;
        } else {
            NodoAr w = recuperarPadre(z.getSi(), b);
            if (w != null) {
                return w;
            }
            w = recuperarPadre(z.getSd(), b);
            if (w != null) {
                return w;
            }
            if (z.getSi() == b) {
                return z;
            } else if (z.getSd() == b) {
                return z;
            } else {
                return w;
            }
        }
    }

    public static int ej1(NodoAr r) {
        if (r == null) {
            return 0;
        } else {
            //verificar para el hijo izquierdo
            NodoAr i = r.getSi();
            if (i != null) {
                if (i.getSi() == null && i.getSd() != null) {
                    
                    r.setSi(i.getSd());
                    return 1 + ej1(r.getSi()) + ej1(r.getSd());
                } else if (i.getSi() != null && i.getSd() == null) {
                    r.setSi(i.getSi());
                    return 1 + ej1(r.getSi()) + ej1(r.getSd());
                }
            }
            //verificar para el hijo derecho
            NodoAr w = r.getSd();
            if (w != null) {
                if (w.getSi() == null && w.getSd() != null) {
                    r.setSd(w.getSd());
                    return 1 + ej1(r.getSi()) + ej1(r.getSd());
                } else if (w.getSi() != null && w.getSd() == null) {
                    r.setSd(w.getSi());
                    return 1 + ej1(r.getSi()) + ej1(r.getSd());
                }
            }
            return ej1(r.getSi()) + ej1(r.getSd());
        }
    }
}
