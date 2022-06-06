import java.util.Scanner;
public class UsoDeIf {
    public static void main(String[] args){
        Scanner scanerDato = new Scanner(System.in);
        System.out.println("Biennvenidos al programa");
        System.out.println("Escriba un número");
        Double numeroDato = scanerDato.nextDouble();
        if (numeroDato>=0){
            System.out.println("El número que escribiò es positivo");
        }else{
            System.out.println("El número que escribió es negativo");
        }
    }
}
