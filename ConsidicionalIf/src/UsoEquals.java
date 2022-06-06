import java.util.Scanner;
public class UsoEquals {
    public static void main(String[] args) {
        Scanner scanerDato = new Scanner(System.in);
        System.out.println("Bienvenidos al programa");
        System.out.println("Escriba su nombre");
        String nombreParticipante = scanerDato.nextLine();
        System.out.println("Escriba el nombre del día de la semana");
        String nombreDia = scanerDato.nextLine();
        if (nombreDia.equals("Lunes")) {
            System.out.println(nombreParticipante+" el día que seleccionó fue el Lunes");
        }else if (nombreDia.equals(("Martes"))){
            System.out.println(nombreParticipante+" el dìa que seleccionó es el día Martes");
        }else if (nombreDia.equals("Miércoles")) {
            System.out.println(nombreParticipante+" el dìa que seleccionó es el día Miércoles");
        }else if (nombreDia.equals("Jueves")) {
            System.out.println(nombreParticipante+" el dìa que seleccionó es el dìa Jueves");
        }else if (nombreDia.equals("Viernes")){
            System.out.println(nombreParticipante+" el dìa que seleccionó es el día Viernes");
        }else if (nombreDia.equals("Sábado")){
            System.out.println(nombreParticipante+" el dìa que seleccionó es el día Sábado");
        }else if (nombreDia.equals("Domingo")){
            System.out.println(nombreParticipante+" el día que seleccinó es el Domingo");
        }else{
            System.out.println("Cìfra igresada, no valida");
        }
    }

}



