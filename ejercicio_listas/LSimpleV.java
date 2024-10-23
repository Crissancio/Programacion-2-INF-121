/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_listas;

/**
 *
 * @author Cristhian1509
 */
public class LSimpleV {

    private NodoV p;

    LSimpleV() {
        p = null;
    }

    public NodoV getP() {
        return p;
    }

    public void setP(NodoV p) {
        this.p = p;
    }

    void adicionarInicio(Vehiculo v) {
        NodoV nuevo = new NodoV();
        nuevo.setV(v);
        if (p == null) {
            p = nuevo;
        } else {
            nuevo.setSig(p);
            p = nuevo;
        }

    }

    void adicionarFinal(Vehiculo v) {
        NodoV nuevo = new NodoV();
        nuevo.setV(v);
        if (p == null) {
            p = nuevo;
        } else {
            NodoV r = p;
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }

    Vehiculo eliminarInicio() {
        Vehiculo elem = null;
        if (p != null) {
            NodoV r = p.getSig();
            elem = p.getV();
            p = r;
        }else{
            System.out.println("Lista Vacia");
        }
        return elem;
    }
    
    Vehiculo eliminarFinal(){
        Vehiculo elem = null;
        if(p!=null){
            NodoV r = p, w = r;
            
            while (r.getSig() != null) {
                w = r;
                r = r.getSig();
            }
            elem = r.getV();
            w.setSig(null);
            
        }else{
            System.out.println("Lista Vacia");
        }
        
        return elem;
    }
    
    int nroElem(){
        NodoV r = p;
        int c = 0;
        while(r!=null){
            c++;
            r = r.getSig();
        }
        return c;
    }
    
    void mostrar(){
        NodoV r = p;
        while(r!=null){
            r.getV().mostrar();
            r = r.getSig();
        }
    }

}
