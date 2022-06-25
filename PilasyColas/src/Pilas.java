import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Stack;

public class Pilas {
    public static void main (String[] args){
        Stack pila = new Stack();
        pila.push(5);
        pila.push("Element");
        pila.push(5.987);
        pila.push("Calle");
        pila.push("Moto");
        pila.push("Salon");
        pila.push("Hola");
        pila.push("Clase");
        pila.push("Superclase");

        System.out.println(pila);
        pila.pop();
        System.out.println(pila);

        /*System.out.println("tus elementos son: ");
        int y = 1;
        for (int i = 0;i<pila.size(); i++){
            System.out.println(pila.get(pila.size()-y));
            y= y + 1;
        }*/

        while(!pila.isEmpty()){
            System.out.println("Todos los elementos: "+pila.pop());
        }

        System.out.println(pila.isEmpty());

    }
}
