//Entrar com a razão de uma PG e o valor do 1º termo. Calcular e imprimir o 5º termo da série.
import java.util.Scanner;

public class Alg61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o valor do 1º termo da PG: ");
        double fisrtTerm = in.nextDouble();

        System.out.print("Digite a razão da PG: ");
        double ratio = in.nextDouble();

        System.out.print("Digite qual termo deseja calcular: ");
        int n = in.nextInt();

        double termN = fisrtTerm * Math.pow(ratio, n - 1);

        System.out.printf("%nO %dº termo da PG é: %.2f%n", n, termN);

        in.close();

    }
}
