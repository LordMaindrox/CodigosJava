public class Fibonacci {
    public static void main (String[] args){
        int [] fibonacci = new int [20];
        int x = 0;
        int y = 1;
        System.out.print(x+", "+y+", ");
        for (int i = 0; i<20; i++){
            int ac= x+y;
            fibonacci[i]= ac;
            x = y;
            y = ac;
            System.out.print(fibonacci[i]+", ");
        }
    }
}
