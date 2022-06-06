import java.util.Scanner;
public class CicloDoWhile {
    public static void main(String[] args) {
        double result = 0;
        boolean salir = true;
        do {
            Scanner entradaEscaner = new Scanner (System.in);
            System.out.println("Menu\n1.-Suma\n2.-Resta\n3.-Salir\n");
            System.out.println ("¿Qué operación quieres hacer?");
            int num = entradaEscaner.nextInt();
            System.out.println ("Escribe la primera cifra");
            float operadorUno = entradaEscaner.nextFloat();
            System.out.println ("Escribe la segunda cifra");
            float operadorDos = entradaEscaner.nextFloat();
            if (num == 1){
                result=operadorUno+operadorDos;
                System.out.println ("El resultado de sumar "+operadorUno +" y"+operadorDos+" es"+result);
            } else if (num == 2){
                result=operadorUno-operadorDos;
                System.out.println ("El resultado de restar "+operadorUno +" y"+operadorDos+" es"+result);
            } else if (num !=1 && num !=2){
                salir= false;
            }
        }while (salir);
    }
}
