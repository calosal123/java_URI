import java.util.Scanner;

public class Exec1007{

   public static void main (String arg[]){

    Scanner teclado = new Scanner(System.in);

    int A,B,C,D,x;

    A = teclado.nextInt();
    B = teclado.nextInt();
    C = teclado.nextInt();
    D = teclado.nextInt();

    x = (A*B - C*D);

    System.out.println("DIFERENCA = " +x);

   }
}