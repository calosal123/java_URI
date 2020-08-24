import java.util.Scanner;

public class Exec1065{
    public static void main (String arg[]){

        Scanner teclado = new Scanner(System.in);

        int nup = 0;
        
        for(int i = 0; i < 5; i++){

            int nu = teclado.nextInt();
            int rs = nu % 2;

            if (rs == 0){
                nup = nup + 1;
            }
        }
        System.out.println(nup + " valores positivos");
        
    }
}