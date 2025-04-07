//Crie um algoritmo que calcule e imprima a área de um losango

import java.util.Scanner;

public class Alg55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite a diagonal principal do losango: ");
        double d1 = in.nextDouble();

        System.out.print("Digite a diagonal menor do losango: ");
        double d2 = in.nextDouble();

        double rhombusArea = (d1 * d2) / 2.0;
        System.out.printf("%nA área do losango é:  %.2fcm²\n", rhombusArea);

        in.close();
    }
}
