// Entrar com os valores para xnum1, xnum2, xnum3 e imprimir o valor de x,
// sabendo-se que: x = xnum1 + (xnum2/(xnum3+xnum1)) + 2(xnum1-xnum2) + log(64) na base 2
import java.util.Scanner;

public class Alg58 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite xnum1: ");
        double xnum1 = in.nextDouble();

        System.out.print("Digite xnum2: ");
        double xnum2 = in.nextDouble();

        System.out.print("Digite xnum3: ");
        double xnum3 = in.nextDouble();

        double denominator = xnum3 + xnum1;
        if (denominator == 0) {
            System.out.println("Erro: Não é possível dividir por zero.");
            return;
        }

        double calc1 = xnum1;
        double calc2 = xnum2 / denominator;
        double calc3 = 2 * (xnum1 - xnum2);
        double calc4 = Math.log(64) / Math.log(2); // logaritmo de 64 na base 2

        double x = calc1 + calc2 + calc3 + calc4;

        System.out.printf("O valor de x é: %.2f%n", x);
    }
}
