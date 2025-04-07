//Entrar com os valores dos catetos de um triângulo retângulo e imprimir a hipotenusa
import java.util.Scanner;

public class Alg59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o valor do cateto A: ");
        double a = in.nextDouble();

        System.out.print("Digite o valor do cateto B: ");
        double b = in.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.printf("%nA hipotenusa é: %.2f%n", hypotenuse);

        in.close();
    }
}
