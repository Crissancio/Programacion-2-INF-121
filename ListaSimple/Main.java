/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ListaSimple;

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
        LSNormal lista = new LSNormal();
        lista.adiInicio(5);
        lista.adiInicio(4);
        lista.adiInicio(3);
        lista.adiInicio(2);
        lista.adiInicio(1);
        
        lista.adiFinal(6);
        lista.adiFinal(7);
        lista.adiFinal(8);
        lista.adiFinal(9);
        lista.adiFinal(10);
        
        
        lista.mostrar();
        
        int c = 0;
        NodoS r = lista.getP();
        while(r!=null){
            if((int)r.getElemento()%2 != 0){
                c++;
            }
            r = r.getSig();
        }
        
        System.out.println("Contador: "+c+"\nNroElem: "+lista.nroElem());
    }
    
}
