// Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
// volume = 3.14159 * R2 * altura.

import java.util.Scanner;

public class Alg65 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o raio da lata de óleo: ");
        double ratio = in.nextDouble();

        System.out.print("Digite a altura da lata de óleo: ");
        double height = in.nextDouble();

        double volume = 3.14159 * Math.pow(ratio, 2) * height;

        System.out.printf("%nO volume da lata de óleo é: %.2f cm³%n", volume);

        in.close();
    }
}
