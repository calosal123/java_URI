import java.util.Scanner;

public class Exec1114{
    public static void main (String arg[]){

        Scanner teclado = new Scanner(System.in);

        int s,y,c;
        s = 2002;
        c = 0;

              
            do {

                y = teclado.nextInt();
               if( y == s){
                   System.out.println("Acesso Permitido");
                   break;
                
                }else{
                    System.out.println("Senha Invalida");
                }
            c = c +1;

            }while (c > 0);
            
    }
    
}