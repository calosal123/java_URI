import java.util.Scanner;
public class Exe2{
    public static void main(String arg[]){

        Scanner teclado = new Scanner(System.in);
                
        float dist, velMedia, tempo, consumo;

        System.out.println("digite tempo: ");
        tempo = teclado.nextFloat();
        
        System.out.println("digite velMedia: ");
        velMedia = teclado.nextFloat();

        dist = velMedia * tempo;
        consumo = dist / 12;

        System.out.println("Foram consumidos "+consumo+" litros de combustivel");


    }



}