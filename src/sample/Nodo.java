package sample;

/**
 * Created by DELL INC on 23/11/2017.
 */
public class Nodo {
    private int valor;
    private Nodo proximo; //Punter hacia el siguiente

    //Constructor simple, inicializa sin valor

    public Nodo(){
        this.valor=0;
        this.proximo = null;
    }

    //Constructor




    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setProximo(Nodo siguiente){
        this.proximo=siguiente;
    }

    public int getValor(){
        return this.valor;
    }

    public Nodo getProximo(){
        return  this.proximo;
    }

}
