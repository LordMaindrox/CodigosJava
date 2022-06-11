import java.util.Arrays;
import java.util.Scanner;
public class Loteria {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("        Bienvenidos a la loteria        ");
        System.out.println("----------------------------------------");
        Boolean control = true;
        do {
            System.out.println("----------------------------------------");
            System.out.println("          Selecciona una opción         ");
            System.out.println("----------------------------------------");
            System.out.println("Escribe I para iniciar el juego\nEscribe S para salir");
            String selecParticipante = s.nextLine();
            if (selecParticipante.equalsIgnoreCase("S")) {
                control = false;
                System.out.println("Gracias por participar, vuelva pronto");

            }else if (selecParticipante.equalsIgnoreCase("I")) {
                System.out.println("Escriba la cantidad de números que va a jugar");
                int cantidadDeDatos = s.nextInt();
                int[] numerosArreglo = new int[cantidadDeDatos];
                int[] maquinaArreglo = new int[cantidadDeDatos];
                for (int i = 0; i < cantidadDeDatos; i++) {
                    System.out.println("Escriba un número del 0 al 100");
                    numerosArreglo[i] = s.nextInt();
                }
                s.nextLine();
                for (int w = 0; w < cantidadDeDatos; w++) {
                    //maquinaArreglo [w]= (int)(Math.random());
                    maquinaArreglo[w] = (int) (Math.random() * 100);
                    //System.out.print(Arrays.toString(maquinaArreglo));
                }
                boolean b = Arrays.equals(numerosArreglo, maquinaArreglo);
                //System.out.println(b);
                if (b == true){
                    System.out.println("los números ganadores son: "+Arrays.toString(maquinaArreglo));
                    System.out.println("los números que has elegido son: "+Arrays.toString(numerosArreglo));
                    System.out.println("Felicidades ganaste");
                }else{
                    System.out.println("los números del ganadores son: "+Arrays.toString(maquinaArreglo));
                    System.out.println("los números que has elegido son: "+Arrays.toString(numerosArreglo));
                    System.out.println("Suerte para la próxima");
                }

            }else if ((selecParticipante != "I")&&(selecParticipante != "S")){
                System.out.println("--Elija una opción correcta, solo acepta S o I--");
            }
        }while (control);

    }
}
