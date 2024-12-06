/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Cristhian1509
 */
public class Pila <Tipo>{
    private int tope, max;
    private Object v[] = new Object[201];

    public Pila(int max) {
        this.tope = 0;
        this.max = max+1;
    }
    
    int nElem(){
        return tope;
    }
    
    boolean esVacia(){
        return tope == 0;
    }
    boolean esLlena(){
        return tope == max;
    }
    
    void adicionar(Tipo elem){
        if(esLlena()){
            System.out.println("La pila esta llena");
        }else{
            tope++;
            v[tope] = elem;
        }
    }
    
    Tipo eliminar(){
        Tipo elem = null;
        if(esVacia()){
            System.out.println("La pila esta vacia");
        }else{
            elem = (Tipo) v[tope];
            tope--;
        }
        return elem;
    }
    
    void vaciar(Pila pila){
        while(!pila.esVacia()){
            adicionar((Tipo) pila.eliminar());
        }
    }
}
