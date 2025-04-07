//Criar um algoritmo que leia um número entre 0 e 60 e imprimir o seu sucessor, sabendo que
//o sucessor de 60 é 0. Não pode ser utilizado nenhum comando de seleção e nem de repetição.

import java.util.Scanner;

public class Alg76 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite um número inteiro entre 0 e 60: ");
        int number = in.nextInt();

        int next = (number + 1) % 61;

        System.out.printf("%nO sucessor de %d é: %d%n", number, next);

        in.close();
    }
}
