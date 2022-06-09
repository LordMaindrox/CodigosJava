import java.util.Scanner;
public class ArregloyPromediosEjercicio {
    public static void main(String[] args) {
        Scanner scnDato = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Bienvenidos al programa para encontrar el promedio de datos");
        System.out.println("-----------------------------------------------------------");
        boolean salir = true;
        do {
            System.out.println("Elija una de las opciones:\n1.-Escriba C si desa seguir agregando números\n2.-S Salir y mostrar promedio");
            System.out.println("-----------------------------------------------------------");
            System.out.println("Escriba su respuesta para iniciar el proceso: ");
            System.out.println("-----------------------------------------------------------");
            String opcion = scnDato.nextLine();
            if (opcion.equalsIgnoreCase("S")){
                salir = false;
                System.out.println("Gracias por participar");
            }else if (opcion.equalsIgnoreCase("C")) {
                System.out.println("Escriba el nùmero de datos a registrar");
                int numeroDeDatosDelArray = scnDato.nextInt();
                float [] numerosArray = new float[numeroDeDatosDelArray];
                for (int totalDeCiclos=0; totalDeCiclos<numeroDeDatosDelArray; totalDeCiclos++){
                    System.out.print("Escriba el nùmero: ");
                    numerosArray[totalDeCiclos] = scnDato.nextInt();
                }
                scnDato.nextLine();
                float sumaArray = 0;
                for (int ciclos = 0; ciclos < numerosArray.length;  ciclos++) {
                    sumaArray = sumaArray + numerosArray[ciclos];
                    //System.out.println(sumaArray);
                }
                float promedio = sumaArray/numeroDeDatosDelArray;
                System.out.println("***********************************************************");
                System.out.println(" El promedio es "+promedio);
                System.out.println("***********************************************************");
            }else if ((opcion != "C")&&(opcion != "S")){
                System.out.println("Escriba una opción correcta ");
            }
        }while (salir);
    }
}
