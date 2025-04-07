/*
* Uma pessoa resolveu fazer uma aplicação em uma poupança programada. Para calcular seu
* rendimento, ela deverá fornecer o valor constante da aplicação mensal, a taxa e o número de meses.
* Sabendo-se que a fórmula usada para esta cálculo é: valor_acumulado=P*(((l+i)^n)-l/i)
* Obs: i = taxa | P = aplicação mensal | n = número de meses
* */

import java.util.Scanner;

public class Alg79 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o valor do depósito mensal: R$");
        final double P = in.nextDouble();

        System.out.print("Digite a taxa de juros mensal: ");
        double I = in.nextDouble();
        double conversionRatio = I / 100;
        I = conversionRatio;

        System.out.print("Digite o número de meses: ");
        final int N = in.nextInt();


        I = conversionRatio;

        double accumulated = P * (Math.pow(1 + I, N) - 1) / I;

        System.out.printf("%nValor total acumulado: R$%.2f%n", accumulated);

        in.close();
    }
}
