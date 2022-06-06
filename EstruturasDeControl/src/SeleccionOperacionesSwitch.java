import java.util.Scanner;
public class SeleccionOperacionesSwitch {
    public static void main(String[] args) {
        double result = 0;
        boolean salir = true;
        do {
            Scanner entradaEscaner = new Scanner (System.in);
            System.out.println("Menu\n1.-Suma\n2.-Resta\n3.-Salir\n");
            System.out.println ("¿Qué operación quieres hacer?");
            int num = entradaEscaner.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Escribe la primera cifra");
                    float operadorUnoSuma = entradaEscaner.nextFloat();
                    System.out.println("Escribe la segunda cifra");
                    float operadorDosSuma = entradaEscaner.nextFloat();
                    result = operadorUnoSuma + operadorDosSuma;
                    System.out.println("El resultado de sumar " + operadorUnoSuma + " y" + operadorDosSuma + " es" + result);
                    break;
                case 2:
                    System.out.println("Escribe la primera cifra");
                    float operadorUno = entradaEscaner.nextFloat();
                    System.out.println("Escribe la segunda cifra");
                    float operadorDos = entradaEscaner.nextFloat();
                    result = operadorUno - operadorDos;
                    System.out.println("El resultado de restar " + operadorUno + " y" + operadorDos + " es" + result);
                    break;
                case 3:
                    System.out.println("Gracias por participar");
                    salir=false;
                    break;
            }
        }while (salir);
    }

}
