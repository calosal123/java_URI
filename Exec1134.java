import java.util.Scanner;

public class Exec1134{
    public static void main (String arg[]){

        Scanner teclado = new Scanner(System.in);

        int n,a,g,d;

        a = 0;
        g = 0;
        d = 0;


        do{
            n = teclado.nextInt();

            if(n == 1){
                a = a + 1;
            }else if(n == 2){
                g = g + 1;
            }else if (n == 3){
                 d = d + 1;
            }

        }while(n != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " +a);
        System.out.println("Gasolina: " +g);
        System.out.println("Diesel: " +d);

        }
}


