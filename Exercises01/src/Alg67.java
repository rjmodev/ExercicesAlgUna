//Efetuar o cálculo do valor de uma prestação em atraso, utilizando a fórmula:
//prestacao = valor + (valor * (taxa/100) * tempo)

import java.util.Scanner;

public class Alg67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%nDigite o valor da prestação: ");
        double valor = scanner.nextDouble();

        System.out.print("Digite a taxa de juros: ");
        double taxa = scanner.nextDouble();

        System.out.print("Digite o tempo de atraso (em meses): ");
        int tempo = scanner.nextInt();

        double prestacao = valor + (valor * (taxa / 100) * tempo);

        System.out.printf("%nO valor da prestação em atraso é: R$ %.2f%n", prestacao);

        scanner.close();
    }
}
