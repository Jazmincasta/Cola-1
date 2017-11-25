package sample;

/**
 * Created by DELL INC on 23/11/2017.
 */
public class Cola {
    static int i;


    private Nodo frente; //El inicio de la cola
    public boolean vacia(){return frente==null;}
    private int tamaño;
    public int getTamaño(){ return tamaño;}

    //Constructor simple
    public Cola() {
        this.frente = null;
        tamaño=0;
    }


    //Método para insertar siguiente elemento (nodo), el elemnto debe colocarse detrás del último nodo
    public int insertar(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (frente == null) {
            frente = nuevo;
        } else {
            Nodo temp = frente;
            while (temp.getProximo() != null) {
                temp = temp.getProximo();
            }
            temp.setProximo(nuevo);

        }

        return nuevo.getValor();

    }

    //Método para mostrar los elementos de la cola
    public void mostrar() {
        if (frente != null) {
            Nodo temp = frente;
            System.out.println("los valores de la cola son:  ");
            while (temp != null) {
                System.out.println(temp.getValor());
                temp = temp.getProximo();
            }
        } else {
            System.out.println("La cola está vacía.");
        }
    }

    //Método para extraer el elemento del frente
    public int extraer() {
        if (frente == null) {
            return 0;
        } else {
            tamaño--;
            int ValorExtraer = frente.getValor();//Variable temporal
            System.out.println("Valor extraido: " + frente.getValor());
            frente = frente.getProximo();//Cambiar el frente por el siguiente
            return ValorExtraer; //Devolver el valor extraido de la cola
        }
    }
public int getI(){
        return this.i;
}




}
