import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner scanDato = new Scanner(System.in);
        System.out.println("Saludos, Escriba el nombre de su paciente");
        String nombrePaciente = scanDato.nextLine();
        System.out.println("Escribe el peso del paciente en kilos");
        Double pesoPaciente = scanDato.nextDouble();
        System.out.println("Escribe la talla del paciente en metros");
        Double tallaPaciente = scanDato.nextDouble();
        Double tallaCuadrado = Math.pow(tallaPaciente,2);
        Double iMC = pesoPaciente/tallaCuadrado;
        System.out.println("El IMC de "+nombrePaciente+" es de "+iMC+" kg/m2");
    }
}
