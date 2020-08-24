import java.util.Scanner;

public class Exec1043{
    public static void main (String arg[]){

        Scanner teclado = new Scanner(System.in);

        double a,b,c, peri,area;

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        if (a+b>c && b+c>a && a+c>b){

            peri = a+b+c;
            
            System.out.printf("Perimetro = %.1f\n" ,peri);
        }else{

            area = (a+b)*c/2;
            System.out.printf("Area = %.1f\n" ,area);

        }
    }
}
