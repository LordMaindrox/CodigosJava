import java.util.Scanner;
public class CalificiacionesAlumno {
    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner (System.in);
        System.out.println ("Bienvenidos al programa");
        System.out.println ("Escriba su nombre");
        String nombreMaestro = entradaEscaner.nextLine();
        System.out.println ("Saludos "+ nombreMaestro);
        System.out.println ("Escriba el nombre del alumno");
        String nombreAlumno = entradaEscaner.nextLine();
        System.out.println ("Por favor introduzca la calificación de biología: ");
        float calBiologia = entradaEscaner.nextFloat ();
        System.out.println ("Por favor introduzca la calificación de español: ");
        float calEspanol = entradaEscaner.nextFloat ();
        System.out.println ("Por favor introduzca la calificación de matemáticas: ");
        float calMath = entradaEscaner.nextFloat ();
        float promedioGeneral = 0f;
        promedioGeneral = (calBiologia+calEspanol+calMath)/3;
        System.out.println("El promedio general de: "+ nombreAlumno +" es "+ promedioGeneral);

    }
}
