package UI;

import java.util.Scanner;
public class UIMenu {

    public static final String[] MESES = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Novimenbre","Diciembre"};

    public static void mostrarMenu(){
        System.out.println("Bienvenidos a la agenda médica");
        System.out.println("Seleccione una opción");

        int respuesta = 0;
        do {
            System.out.println("1.- Doctor");
            System.out.println("2.- Paciente");
            System.out.println("0.- Salir");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextInt());

            switch (respuesta) {
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    respuesta = 0;
                    mostrarMenuPaciente();
                    break;
                case 0:
                    System.out.println("Gracias por su visita");
                    break;
                default:
                    System.out.println("Selecciona una opción correcta");
            }
        }while (respuesta != 0);
    }
    static void mostrarMenuPaciente(){
        int respuesta = 0;
        do {
           System.out.println("\n\n");
           System.out.println("Paciente");
           System.out.println("1.- Reservar una cita");
           System.out.println("2.- Mis citas");
           System.out.println("0.- Regresar");

           Scanner sc = new Scanner(System.in);
           respuesta = Integer.valueOf(sc.nextInt());

           switch (respuesta) {
               case 1:
                   System.out.println("::Libro de citas");
                   for (int i = 1; i < 4; i++) {
                       System.out.println(i + ". " + MESES[i]);
                   }
                   break;
               case 2:
                   System.out.println("::Mis citas");
                   break;
               case 0:
                   mostrarMenu();
                   break;
           }
        }while (respuesta != 0);
    }
}
