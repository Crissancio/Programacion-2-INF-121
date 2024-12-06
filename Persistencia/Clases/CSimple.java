package Clases;

public class CSimple <Tipo> {
    private int ini, fin, max;
    private Object v[] = new Object[201];

    public CSimple(int max){
        ini = fin = 0;
        this.max = max + 1;
    }

    public int nElem(){
        return fin-ini;
    }

    public boolean esVacia(){
        return fin == 0;
    }

    public boolean esLlena(){
        return fin == max;
    }

    public void adicionar(Tipo elem){
        if(esLlena()){
            System.out.println("La cola esta llena");
        }else{
            fin++;
            v[fin] = elem;
        }
    }

    public Tipo eliminar(){
        Tipo elem = null;
        if(esVacia()){
            System.out.println("La cola esta vacia");
        }else{
            ini++;
            elem = (Tipo) v[ini];
            if(ini == fin){
                ini = fin = 0;
            }
        }
        return elem;
    }

    public void vaciar(CSimple<Tipo> cola){
        while(!cola.esVacia()){
            adicionar((Tipo) cola.eliminar());
        }
    }
    
}