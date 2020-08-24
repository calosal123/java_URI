import java.util.Scanner;
public class Exec3{
    public static void main (String arg[]){

        Scanner teclado = new Scanner(System.in);
        
        float salario;
        float kw;
        float valorconta;
        float valorkw;
        float valorDesconto;

        System.out.println("digite valor do salario: ");
        salario = teclado.nextFloat();

        System.out.println("digite valor do kw: ");
        kw = teclado.nextFloat();


        valorkw = salario/700;
        valorconta =  valorkw * kw;
        valorDesconto = valorconta * 0.9f;

        System.out.printf(" valor de 1 kw R$ %.2f\n", valorkw);
        System.out.printf(" valor da conta R$ %.2f\n", valorconta);
        System.out.printf(" valor da desconto R$ %.2f\n", valorDesconto);


    }
}
