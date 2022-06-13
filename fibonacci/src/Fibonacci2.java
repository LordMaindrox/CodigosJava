public class Fibonacci2 {
    public static void main(String[] args) {
        int [] arrayFibonacci = new int[20];
        int x = 0;
        int y = 1;
        System.out.print( x+", "+y+", ");
        for (int i = 0; i<20; i++){
            int resultado = x+y;
            arrayFibonacci[i]= resultado;
            x=y;
            y=resultado;
            System.out.print(arrayFibonacci[i]+", ");
        }
    }
}
