// Ler dois números inteiros e imprimir a soma. Antes do resultado,
// deverá aparecer a mensagem soma.
import java.util.Scanner;

public class Alg36 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num1, num2;

    System.out.printf("%nDigite o primeiro numero: ");
    num1 = input.nextInt();

    System.out.printf("%nDigite o segundo numero; ");
    num2 = input.nextInt();

    System.out.printf("%nSoma = %d", num1+num2);
    input.close();
    }
}
