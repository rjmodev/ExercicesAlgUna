//Para vários tributos, a base de cálculo é o salário mínimo. Fazer um algoritmo que leia o valor
//do salário mínimo e o valor do salário de uma pessoa. Calcular e imprimir quantos salários mínimos
//ela ganharia.

import java.util.Scanner;

public class Alg74 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o valor do salário mínimo: R$");
        double minimumWage = in.nextDouble();

        System.out.print("Digite o valor do salário do funcionário: R$");
        double personSalary = in.nextDouble();

        double ratio = personSalary / minimumWage;

        System.out.printf("%nEssa pessoa ganha %.1f vezes o salário mínimo.%n", ratio);

        in.close();
    }
}
