/*
 * Efetuar o cálculo da quantidade de litros de combustível gasto em uma viagem sabendo-se
 * que o carro faz 12 km com um litro. Deverão ser fornecidos o tempo gasto na viagem e a velocidade
 * média. Utilizar as seguintes formulas:
 * o Distância = tempo x velocidade
 * o Litros usados = distância / 12
 * O algoritmo deverá apresentar os valores da velocidade média, tempo gasto na viagem, distância
 * percorrida e a quantidade de litros utilizados na viagem.
 */

import java.util.Scanner;

public class Alg66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o tempo gasto na viagem (em horas): ");
        double time = in.nextDouble();

        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        double averageSpeed = in.nextDouble();

        double distance = time * averageSpeed;
        double litersFuelUsed = distance / 12;

        System.out.printf("%nVelocidade média: %.2f km/h%n", averageSpeed);
        System.out.printf("Tempo gasto: %.2f horas%n", time);
        System.out.printf("Distância percorrida: %.2f km%n", distance);
        System.out.printf("Quantidade de litros usados: %.2f litros%n", litersFuelUsed);

        in.close();
    }
}
