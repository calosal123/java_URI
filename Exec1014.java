import java.util.Scanner;

public class Exec1014{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        int x;
        float y, t;

        x = teclado.nextInt();
        y = teclado.nextFloat();

        t = x / y;

        System.out.printf("%.3f km/l\n", t);



        
    }
}