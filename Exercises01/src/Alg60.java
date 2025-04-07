//Entrar com a razão de uma PA e o valor do 1º termo. Calcular e imprimir o 10º termo da série.
import java.util.Scanner;

public class Alg60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o valor do 1º termo da PA: ");
        int firstTerm = in.nextInt();

        System.out.print("Digite a razão da PA: ");
        int ratio = in.nextInt();

        int tenTerm = firstTerm + (10 - 1) * ratio;

        System.out.printf("%nO 10º termo da PA é: %d%n", tenTerm);

        in.close();
    }
}
