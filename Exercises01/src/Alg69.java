//Criar um algoritmo que leia o numerador e o denominador de uma fração e transformá-lo em
//um número decimal.

import java.util.Scanner;

public class Alg69 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o valor em número inteiro do numerador de uma fração: ");
        int numerator  = in.nextInt();

        System.out.printf("Digite o valor em número inteiro do denominador de uma fração: ");
        int denominator = in.nextInt();

        if (denominator == 0) {
            System.out.println("Erro: Não é possível dividir por zero.");
            return;
        }

        double result = (double) numerator / denominator;

        System.out.printf("%nO resultado da fração %d/%d é: %.2f%n", numerator, denominator, result);

        in.close();
    }
}
