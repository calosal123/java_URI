import java.util.Scanner;

    public class Exec1142{
        public static void main (String arg[]){

            Scanner teclado = new Scanner(System.in);

            int l = teclado.nextInt();

            int x = 1;
            int n = 1;

            do{
                System.out.println((n) + " " + (n+=1) + " " + (n+=1) + " PUM");
                n +=2;
                x += 1; 

            }while(x <= l);


        }


        
    }