import java.util.Scanner;

public class Exec1018{
    public static void main (String arg[]){

        Scanner teclado = new Scanner(System.in);

        int n,v1,v2,v3,v4,v5,resto;

        n = teclado.nextInt();

        v1 = n / 100;
        resto = v1 % 100;
        
        v2 = resto / 50;
        resto = resto % 50;

        v3 = resto / 20;
        resto = resto % 20;

        v4 = resto / 10;
        resto = resto % 10;

        v5 = resto / 5;
        resto = resto % 5;


        System.out.println ( v1 + " notas(s) de R$ 100,00");
        System.out.println ( v2 + " notas(s) de R$ 50,00");
        System.out.println ( v3 + " notas(s) de R$ 20,00");
        System.out.println ( v4 + " notas(s) de R$ 10,00");
        System.out.println ( v5 + " notas(s) de R$ 5,00");
        
    }

}