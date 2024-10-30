/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Listas_simples_circulares;
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
        LSCircular lista = new LSCircular();
        
        lista.adiFinal(1);
        lista.adiFinal(10);
        lista.adiFinal(2);
        lista.adiFinal(7);
        lista.adiFinal(3);
        lista.adiFinal(4);
        
        Nodo r = lista.getP();
        /*while(r.getSig()!=lista.getP()){
            System.out.println(r.getDato());
            r = r.getSig();
        }
        /System.out.println(r.getDato());
        */
        //------------
        Nodo m = lista.getP();
        while(r!=null){
            System.out.println(r.getDato());
            r = r.getSig();
        }
        
        
    }
    
}
