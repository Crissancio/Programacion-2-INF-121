/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas_simples_20_10;
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
        // TODO code application logic here
        Scanner lee = new Scanner(System.in);
        //Sea una lista de enteros
        LSNormal lista1 = new LSNormal();
        LSNormal lista2 = new LSNormal();
        
        lista1.adiFinal(40);
        lista1.adiFinal(8);
        lista1.adiFinal(7);
        lista1.adiFinal(1);
        lista1.adiFinal(12);
        lista1.adiFinal(5);
        lista1.adiFinal(3);
        lista1.adiFinal(6);
        
        
        lista2.adiFinal(7);
        lista2.adiFinal(8);
        lista2.adiFinal(11);
        lista2.adiFinal(10);
        lista2.adiFinal(1);
        lista2.adiFinal(3);
        lista2.adiFinal(5);
        lista2.adiFinal(9);
        
        //System.out.println("Ingresar cuantos elementos van a entrar a la lista.");
        //int n = lee.nextInt();
        /*
        int elem = 0;
        for(int i = 0; i<n; i++){
            elem = lee.nextInt();
            lista.adiFinal(elem);
        }
        */
        
        
        lista1.mostrar();
        lista2.mostrar();
        
        System.out.println("Verificar cuantos impares hay en la lista");
        int n = lista1.nroElem();
        int elem = 0;
        int c = 0;
        
        for(int i = 0; i<n; i++){
            elem = (int) lista1.eliInicio();
            if(elem % 2 != 0){
                c++;
            }
            lista1.adiFinal(elem);
        }
        
        System.out.println("Verificar Cual lista tiene la mayor suma de elementos");
        n = lista1.nroElem();
        int sumLista1 = 0;
        for(int i = 0; i<n; i++){
            elem =(int) lista1.eliInicio();
            sumLista1 = sumLista1 + elem;
            lista1.adiFinal(elem);
        }
        
        int sumLista2 = 0;
        NodoS r;
        r = lista2.getP();
        while(r!=null){
            sumLista2 = sumLista2 + (int)r.getElemento();
            r = r.getSig();
        }
        
        System.out.println("Lista 1: "+sumLista1+"\nLista 2: "+sumLista2);
        if(sumLista1 > sumLista2){
            lista1.mostrar();
        }else{
            lista2.mostrar();
        }
        
        //Sea una Lista Simples de Numeros
        //a) Verificar quien tiene la suma de los numeros pares mas grande de las 2 listas
        //b) adicionar al final la suma de sus impares
    
    }
    
}
