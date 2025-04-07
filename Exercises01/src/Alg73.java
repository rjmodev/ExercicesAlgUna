//Criar um algoritmo que receba um número real, calcular e imprimi:
//A parte inteira do número
//A parte fracionária do número
//O número arredondado

import java.util.Scanner;

public class Alg73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite um número real: ");
        double numberR = in.nextDouble();

        int integerPart = (int) numberR;
        double fractionalPart = numberR - integerPart;
        int roundedNumber = (int)Math.round(numberR);

        System.out.printf("%nParte inteira do número: %d", integerPart);
        System.out.printf("%nParte fracionária do número: %.2f", fractionalPart);
        System.out.printf("%nO número arredondado: %d%n", roundedNumber);

        in.close();
    }
}
