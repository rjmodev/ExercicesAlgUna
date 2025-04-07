/*
* Criar um algoritmo que leia o peso de uma pessoa, só a parte inteira, calcular e imprimir:
* O peso da pessoa em gramas
* Novo peso, em gramas, se a pessoa engordar 12%
*/

import java.util.Scanner;

public class Alg75 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o peso somente com números inteiros: ");
        int weightKg = in.nextInt();

        int weightGrams = weightKg * 1000;
        double increasedWeight = (double) weightGrams * 1.12;

        System.out.printf("%nO peso em gramas é: %dg%n", weightGrams);
        System.out.printf("O peso com o ganho de 12%% é: %.2fg%n", increasedWeight);

        in.close();
    }
}
