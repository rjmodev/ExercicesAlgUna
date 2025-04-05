// Entrar com dois números reais e imprimir a média aritmética com a mensagem
// média antes do resultado .
import java.util.Scanner;

public class Alg39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%nDigite o primeiro número real: ");
        float n1 = input.nextFloat();

        System.out.printf("Digite o segundo número real: ");
        float n2 = input.nextFloat();

        float media = n1+n2/2;
        System.out.printf("%nMedia = %.2f%n", media);
        input.close();
    }
}
