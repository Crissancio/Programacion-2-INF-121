/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mascotas;

/**
 *
 * @author Cristhian1509
 */
public class ListaM {
    private NodoM p;
    ListaM(){
        p = null;
    }

    public NodoM getP() {
        return p;
    }

    public void setP(NodoM p) {
        this.p = p;
    }
    void adiFinal(Mascota m){
        NodoM nuevo = new NodoM();
        nuevo.setMascota(m);
        if(p == null){
            p = nuevo;
        }else{
            NodoM r = p;
            while(r.getSig() != null){
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }
    
    Mascota eliInicio(){
        Mascota elem = null;
        if(p!=null){
            NodoM r = p, w = r;
            while(r.getSig()!= null){
                w = r;
                r = r.getSig();
            }
            elem = r.getMascota();
            w.setSig(null);
        }else{
            System.out.println("Lista Vacia");
        }
        return elem;
    }
    
    int nroelem(){
        int c = 0;
        NodoM r = p;
        while(r!=null){
            c++;
            r= r.getSig();
        }
        return c;
    }
    
    void mostrar(){
        NodoM r = p;
        while(r!=null){
            r.getMascota().mostrar();
            r = r.getSig();
        }
    }
}
