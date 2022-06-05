import java.util.Scanner;
public class SumaDeDosFracciones {
    public static void main(String[] args) {
        Scanner scanDato = new Scanner(System.in);
        System.out.println("Bienvenido al programa de suma de dos fracciones");
        System.out.println("Escriba el numerador de la primera fracción");
        int numeradorA = scanDato.nextInt();
        System.out.println("Escriba el denominador de la primera fracción");
        int denominadorB = scanDato.nextInt();
        System.out.println("Escriba el numerador de la segunda fracción");
        int numeradorC = scanDato.nextInt();
        System.out.println("Escribe el denominador de la segunda fracción");
        int denominadorD = scanDato.nextInt();
        int denominadorSuma = denominadorB*denominadorD;
        int sumaAD = numeradorA*denominadorD;
        int sumaBC = numeradorC*denominadorB;
        int sumaNumerador = sumaAD+sumaBC;
        System.out.println("El resultado de la suma de las dos fracciones dadas es: "+sumaNumerador+"/"+denominadorSuma);

    }
}
