// Entrar com um número e imprimir a seguinte saída:
// número
// quadrado
// raiz quadrada
import java.util.Scanner;

public class Alg45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Calcule o quadrado e a raiz quadrada");

        System.out.printf("%nDigite um número inteiro: ");
        int n1 = in.nextInt();

        System.out.printf("%nNúmero = %d%n", n1);
        System.out.printf("Quadrado = %d%n", n1*n1);
        System.out.printf("Raiz Quadrada = %.2f", Math.sqrt(n1));
    }
}
