/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas_dobles_circulares;

/**
 *
 * @author Cristhian1509
 */
public class LDCircular {
    private Nodo p;
    LDCircular(){
        p = null;
    }

    public Nodo getP() {
        return p;
    }

    public void setP(Nodo p) {
        this.p = p;
    }
    
    void adiFinal(Object elem){
        Nodo nuevo = new Nodo();
        nuevo.setDato(elem);
        if(p==null){
            p = nuevo;
            nuevo.setSig(p);
            p.setAnt(nuevo);
        }else{
            Nodo r = p.getAnt();
            r.setSig(nuevo);
            nuevo.setSig(p);
            nuevo.setAnt(r);
            p.setAnt(nuevo);
        }
    }
}
