import java.util.Scanner;

public class Exec1070{
    public static void main (String arg[]){

        Scanner teclado = new Scanner(System.in);

        int x, y;
        x = 1;

        y = teclado.nextInt();

        if (y % 2 == 0){

            y = y + 1;
        }

            do {

                if(y % 2 != 0){
                    System.out.println(y);
                    y = y+2;
                    x = x+1;
                }
            }while (x <= 6 ); 
                
                    

    }            
    
}