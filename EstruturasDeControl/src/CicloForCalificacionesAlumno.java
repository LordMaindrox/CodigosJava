import java.util.Scanner;
public class CicloForCalificacionesAlumno {
    public static void main(String[] args) {
        Scanner entradaEscanner = new Scanner(System.in);
        System.out.println("Bienvenidos al programa, por favor escriba su nombre, gracias");
        String nombreMaestro = entradaEscanner.nextLine();
        System.out.println("Saludos "+nombreMaestro+", Puede indicar el número de alumnos que hay en su clase por favor");
        int numeroAlumnos = entradaEscanner.nextInt();
        entradaEscanner.nextLine();
        for (int i=1 ;i<=numeroAlumnos ;i++ ){
            System.out.println("Escriba el nombre del alumno");
            String nombreAlumno = entradaEscanner.nextLine();
            System.out.println("Escriba la calificaciòn de Español");
            Double calEspa = entradaEscanner.nextDouble();
            System.out.println("Escribe la calificaciòn de Matemáticas");
            Double calMath = entradaEscanner.nextDouble();
            System.out.println("Escriba la calificación de Biología");
            Double calBio=entradaEscanner.nextDouble();
            entradaEscanner.nextLine();
            Double promedioAlumno= (calBio+calEspa+calMath)/3;
            System.out.println("El promedio de "+nombreAlumno+" es de "+promedioAlumno);
        }
    }
}
