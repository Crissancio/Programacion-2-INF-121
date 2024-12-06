package Clases;

public class CCircular<Tipo> {
    private int ini, fin, max;
    private Object v[] = new Object[201];

    public CCircular(int max){
        ini = fin = 0;
        this.max = max + 1;
    }

    public int nElem(){
        return (max -fin+ini)%max;
    }

    public boolean esVacia(){
        return nElem() == 0;
    }

    public boolean esLlena(){
        return nElem() == max;
    }

    public void adicionar(Tipo elem){
        if(esLlena()){
            System.out.println("La cola esta llena");
        }else{
            fin++;
            v[fin] = elem;
            if(fin == max){
                fin = 0;
            }
        }
    }

    public Tipo eliminar(){
        Tipo elem = null;
        if(esVacia()){
            System.out.println("La cola esta vacia");
        }else{
            ini++;
            elem = (Tipo) v[ini];
            if(ini==max){
                ini = 0;
            }

            if(ini == fin){
                ini = fin = 0;
            }
        }
        return elem;
    }

    public void vaciar(CCircular <Tipo> cola){
        while(!cola.esVacia()){
            adicionar((Tipo) cola.eliminar());
        }
    }
}