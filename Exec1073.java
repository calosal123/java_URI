import java.util.Scanner;

public class Exec1073{
    public static void main (String arg[]){

        Scanner teclado = new Scanner(System.in);

        int x, y,vl;
        x = 2;

        y = teclado.nextInt();

         
            do {
                vl = x*x; 
                System.out.println(x + "^2="  + vl);
                                   
                    x = x+2;
                
            }while (x <= y);
            
    }
    
}