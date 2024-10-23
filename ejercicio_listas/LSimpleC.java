/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_listas;

/**
 *
 * @author Cristhian1509
 */
public class LSimpleC {
    private NodoC p;
    
    LSimpleC(){
        p = null;
    }

    public NodoC getP() {
        return p;
    }

    public void setP(NodoC p) {
        this.p = p;
    }
    void adicionarInicio(Conductor c) {
        NodoC nuevo = new NodoC();
        nuevo.setC(c);
        if (p == null) {
            p = nuevo;
        } else {
            nuevo.setSig(p);
            p = nuevo;
        }

    }

    void adicionarFinal(Conductor c) {
        NodoC nuevo = new NodoC();
        nuevo.setC(c);
        if (p == null) {
            p = nuevo;
        } else {
            NodoC r = p;
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }

    Conductor eliminarInicio() {
        Conductor elem = null;
        if (p != null) {
            NodoC r = p.getSig();
            elem = p.getC();
            p = r;
        }else{
            System.out.println("Lista Vacia");
        }
        return elem;
    }
    
    Conductor eliminarFinal(){
        Conductor elem = null;
        if(p!=null){
            NodoC r = p, w = r;
            
            while (r.getSig() != null) {
                w = r;
                r = r.getSig();
            }
            elem = r.getC();
            w.setSig(null);
            
        }else{
            System.out.println("Lista Vacia");
        }
        
        return elem;
    }
    
    int nroElem(){
        NodoC r = p;
        int c = 0;
        while(r!=null){
            c++;
            r = r.getSig();
        }
        return c;
    }
    
    void mostrar(){
        NodoC r = p;
        while(r!=null){
            r.getC().mostrar();
            r = r.getSig();
        }
    }
}
