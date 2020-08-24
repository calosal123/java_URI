import java.util.Scanner;

public class Exec1067{
    public static void main (String arg[]){

        Scanner teclado = new Scanner(System.in);

        int x, y;
        y = 1;

        x = teclado.nextInt();

            do {

                if(y % 2 != 0){
                    System.out.println(y);
                }
                    y = y+2;
                
            }while (y <= x ); 
        
    }
               
    
}