/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas_simples_circulares;

/**
 *
 * @author Cristhian1509
 */
public class LSCircular {
    private Nodo p;
    
    LSCircular(){
        p = null;
    }

    public Nodo getP() {
        return p;
    }

    public void setP(Nodo p) {
        this.p = p;
    }
    void adiFinal(int a){
        Nodo nuevo = new Nodo();
        nuevo.setDato(a);
        if(p==null){
            p = nuevo;
            nuevo.setSig(p);
        }else{
            Nodo r = p;
            while(r.getSig()!=p){
                r = r.getSig();
            }
            r.setSig(nuevo);
            nuevo.setSig(p);
        }
    }
    
    int eliInicio(){
        int elem = 0;
        if(p!=null){
            elem = p.getDato();
            Nodo r = p;
            while(r.getSig() != p){
                r = r.getSig();
            }
            r.setSig(p.getSig());
            p = p.getSig();
        }else{
            System.out.println("Lista Vacia");
        }
        return elem;
    }
}
