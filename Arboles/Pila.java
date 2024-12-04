/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arboles;

/**
 *
 * @author Cristhian1509
 */
public class Pila {
    private int tope;
    private int max=200;
    private Object v[] = new Object[max+1];
    
    Pila(int n){
        max = n+1;
        tope = 0;
    }
    Pila(){
        tope = 0;
    }
    
    boolean esVacia(){
        return tope == 0;
    }
    
    boolean esLlena(){
        return tope == max;
    }
    
    int nElem(){
        return tope;
    }
    
    void adicionar(Object elem){
        if(esLlena()){
            System.out.println("La pila esta llena");
        }else{
            tope++;
            v[tope] = elem;
        }
    }
    
    Object eliminar(){
        Object elem = null;
        if(esVacia()){
            System.out.println("La pila esta vacia");
        }else{
            elem = v[tope];
            tope--;
        }
        return elem;
    }
    
    void vaciar(Pila pila){
        while(! pila.esVacia()){
            adicionar(pila.eliminar());
        }
    }
}
