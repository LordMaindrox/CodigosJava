import java.util.Scanner;
public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanDato = new Scanner(System.in);
        System.out.println("Saludos, Escriba la unidad en que va a trabajar");
        String nombreMedida = scanDato.nextLine();
        System.out.println("Escriba la medida de la base del triàngulo ");
        Double medidaBase = scanDato.nextDouble();
        System.out.println("Escriba la medida de la altura del triángulo ");
        Double medidaAltura = scanDato.nextDouble();
        Double areaTriangulo = medidaAltura * medidaBase / 2;
        System.out.println("El área de su triángulo es: " + areaTriangulo + " " + nombreMedida + " cuadrados.");
    }
}
