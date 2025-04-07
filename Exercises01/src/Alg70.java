/*
* Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10% para o
* garçom. Fazer um algoritmo que leia o valor gasto com despesas realizadas em um restaurante e
* imprima o valor total com a gorjeta
*/

import java.util.Scanner;

public class Alg70 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o valor gasto no restaurante: R$");
        double amountSpent = in.nextDouble();

        double tip = amountSpent * 0.10;
        double totalWithTip  = amountSpent + tip;

        System.out.printf("%nValor total com 10%% de gorjeta: R$%.2f%n", totalWithTip );

        in.close();
    }
}
