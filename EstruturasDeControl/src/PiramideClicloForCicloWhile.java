import java.util.Scanner;
public class PiramideClicloForCicloWhile {
    public static void main(String[] args) {
        Scanner entradaEscaner= new Scanner(System.in);
        String nuevaA = "";
        System.out.println ("¿Qué figura quiere?");
        String a = entradaEscaner.nextLine();
        //System.out.println (a);
        System.out.println ("¿Cuántos niveles tiene?");
        int numeroNiveles = entradaEscaner.nextInt();
        /*for (int i= 1;  i<=numeroNiveles; i=i+1){
            nuevaA = nuevaA + a;
		    System.out.println(nuevaA);
		}*/
        int i = 1;
        while (i<=numeroNiveles){
            nuevaA = nuevaA + a;
            System.out.println(nuevaA);
            i=i+1;
        }
    }
}
