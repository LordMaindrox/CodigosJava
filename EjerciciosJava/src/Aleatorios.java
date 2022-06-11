import java.util.Scanner;
public class Aleatorios {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //System.out.println("Escriba la cantidad de números que va a jugar");
        int cantidadDeDatos = s.nextInt();
        //int [] numerosArreglo = new int[cantidadDeDatos];
        int [] maquinaArreglo = new int[cantidadDeDatos];
        /*for (int i=0 ;i<cantidadDeDatos ;i++ ){
            System.out.println("Escriba un número");
            numerosArreglo[i] = s.nextInt();
        }*/
        for ( int w = 0;w < cantidadDeDatos ; w++ ) {
            //maquinaArreglo [w]= (int)(Math.random());
            //System.out.println(Math.random());
            //maquinaArreglo[w]= Integer.parseInt((int)(Math.random() * 100) + " ");
            //System.out.println(maquinaArreglo);
            maquinaArreglo[w] = (int)(Math.random()*20);
            System.out.println(maquinaArreglo[w]);
        }

    }
}
