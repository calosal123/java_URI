import java.util.Scanner;

public class Exec1005{

   public static void main (String arg[]){

    Scanner teclado = new Scanner(System.in);

    double A,B,MEDIA;

    A = teclado.nextDouble();
    B = teclado.nextDouble();


    MEDIA = (A*3.5 + B*7.5)/11;

    System.out.printf("MEDIA = %.5f\n" ,MEDIA);
   }
}