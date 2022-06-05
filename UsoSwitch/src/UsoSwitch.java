import java.util.Scanner;
public class UsoSwitch {
    public static void main(String[] args){
        Scanner scScanner = new Scanner (System.in);
        System.out.println ("Bienvenidos al programa");
        System.out.println ("Escriba su nombre");
        String nombreParticipante = scScanner.nextLine();
        System.out.println ("Escriba el nombre de un día de la semana");
        String nombreDia = scScanner.nextLine();
        switch (nombreDia){
            case "Lunes":
                System.out.println (nombreParticipante+ " el día que seleccionó fue el lunes");
                break;
            case "Martes":
                System.out.println (nombreParticipante+ " el día que seleccionó fue el Martes");
                break;
            case "Miercoles":
                System.out.println (nombreParticipante+ " el día que seleccionó fue el miercoles");
                break;
            case "jueves":
                System.out.println (nombreParticipante+ " el día que seleccionó fue el jueves");
                break;
            case "viernes":
                System.out.println (nombreParticipante+ " el día que seleccionó fue el viernes");
                break;
            case "sabado":
                System.out.println (nombreParticipante+ " el día que seleccionó fue el sabado");
                break;
            case "domingo":
                System.out.println (nombreParticipante+ " el día que seleccionó fue el domingo");
                break;
            default:
                System.out.println ("No valido");
                break;
            }

    }
}
