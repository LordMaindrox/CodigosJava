import java.util.Scanner;
public class OtrosCasosIfElseIf {
    public static void main(String[] args) {
        Scanner scanerDato = new Scanner(System.in);
        System.out.println("Bienvenidos al programa");
        System.out.println("Por favor, escriba su nombre");
        String nombreParticipante = scanerDato.nextLine();
        System.out.println("Escriba su calificación para clasificarla, valores del 0 al 10");
        Double valorCalificacion = scanerDato.nextDouble();
        if (valorCalificacion>=0 && valorCalificacion<=10){
            if (valorCalificacion== 10)
                System.out.println(nombreParticipante + " su calificación es excelente");
            else if (valorCalificacion >= 9)
                System.out.println(nombreParticipante+" su calificación es buena");
            else if (valorCalificacion>=8)
                System.out.println(nombreParticipante+" su calificación es regular");
            else if (valorCalificacion>=7)
                System.out.println(nombreParticipante+" su calificación es aceptable");
        }else{
            System.out.println("El valor que ingresó esta fuera del rango, por favor vuelva a iniciar");
        }
    }
}
