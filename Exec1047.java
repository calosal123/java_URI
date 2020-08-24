import java.util.Scanner;

public class Exec1047{
    public static void main (String arg[]){

        Scanner teclado = new Scanner(System.in);

        int hi, hf, dur,duH,duM;
        int mi,mf,durf,dua;

        
        hi = teclado.nextInt();
        mi = teclado.nextInt();
        hf = teclado.nextInt();
        mf = teclado.nextInt();
        
        dur = hi * 60 + mi;
        durf = hf * 60 + mf;
        dua = durf - dur;

        if (dua <= 0 ){
            dua = dua + 24*60;

        }
        
duH = dua/60;
duM = dua%60;

        System.out.println("O JOGO DUROU " +duH+ " HORA(S) E " +duM+ " MINUTO(S)");
    }
}