import java.util.Scanner;

public class Exec1064{
    public static void main (String arg[]){

        Scanner teclado = new Scanner(System.in);

        int nui = 0;
        float nuq = 0;

        for(int i = 0; i < 6; i++){

            float num = teclado.nextFloat();

            if (num > 0){
                nui = nui + 1;
                nuq = nuq + num;
            }
        }
        System.out.println(nui + " valores positivos");
        System.out.printf("%.1f\n",(nuq/nui));
    }
}
