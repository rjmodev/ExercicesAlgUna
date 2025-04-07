// Ler dois números reais e imprimir o quadrado da diferença do primeiro valor pelo segundo e
// a diferença dos quadrados.

import java.util.Scanner;

public class Alg77 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o primeiro número real: ");
        double number1 = in.nextDouble();

        System.out.print("Digite o segundo número real: ");
        double number2 = in.nextDouble();

        double squareDifference = Math.pow((number1-number2), 2);
        double differenceOfSquares = Math.pow(number1, 2) - Math.pow(number2, 2);

        System.out.printf("%nO quadrado da diferença entre %.2f e %.2f é: %.2f", number1, number2, squareDifference);
        System.out.printf("%nA diferença dos quadrados de %.2f e %.2f é: %.2f.%n", number1, number2, differenceOfSquares);

    in.close();
    }
}
