public class RevF {
    static public void main(String[] args){
        int [] arrayFibo = new int[20];
        int x = 0;
        int y = 1;
        System.out.print(x + ", " + y + ", ");
        for (int i = 1; i < 20 ; i++){
            int resultado = x+y;
            arrayFibo[i]=resultado;
            x = y;
            y= resultado;
            System.out.print(arrayFibo[i]+ ", ");

        }
    }
}
