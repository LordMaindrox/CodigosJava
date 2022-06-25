import java.util.Queue;
import java.util.LinkedList;

public class Colas {
    static public void main(String[] args){
        Queue cola = new LinkedList();

        cola.add("manzana");
        cola.add("pera");
        cola.add("elefante");
        cola.add("perro");
        cola.add("cola");
        cola.add("pato");
        cola.add("compu");
        cola.add("hola");


        cola.peek();
        System.out.println(cola.peek());
        System.out.println(cola.element());
        System.out.println(cola);
    }
}
