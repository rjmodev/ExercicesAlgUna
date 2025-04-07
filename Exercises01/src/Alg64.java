/*
 * Ler uma temperatura em graus centígrados e apresentá-la convertida em graus Fahrenheit.
 * A fórmula de conversão é
 * F=(9 * C +160) / 5
 * onde F é a temperatura em Fahrenheit e C é a temperatura em centígrados.
 */

import java.util.Scanner;

public class Alg64 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite a temperatura em graus Centígrados: ");
        double tempC = in.nextDouble();

        double tempF = (9 * tempC + 160) / 5;

        System.out.printf("%nA temperatura em Fahrenheit é: %.2f°F%n", tempF);

        in.close();
    }
}
