import java.util.Scanner;

public class Exec1144{
    public static void main (String arg[]){

        Scanner teclado = new Scanner(System.in);

        int c = teclado.nextInt();

        int d = 1;
        int n = 1;

        do{
            System.out.println((n) + " " + (n*n) + " " + (n*n*n));
            System.out.println((n) + " " + (n*n+1) + " " + (n*n*n+1));
            n +=1;

            d += 1;

        }while(d <= c);

    }
}