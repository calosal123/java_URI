import java.util.Scanner;

public class Exec1008{
    public static void main (String arg[]){

        Scanner teclado = new Scanner(System.in);

        int nf,hr;
        float sl,res;

        

        nf = teclado.nextInt();
        hr = teclado.nextInt();
        sl = teclado.nextFloat();
        

        res = hr * sl;

        System.out.println("NUMBER = " +nf);
        System.out.printf("SALARY = U$ %.2f\n",res);





    }
}