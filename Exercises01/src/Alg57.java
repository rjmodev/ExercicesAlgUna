/*
* Entrar com as notas da PR1 e PR2 e imprimir a média final
* Truncada
* Arredondada
*/
import java.util.Scanner;

public class Alg57 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite a nota da prova 1: ");
        double pr1 = in.nextDouble();

        System.out.print("Digite a nota da prova 2: ");
        double pr2 = in.nextDouble();

        double average = (pr1 + pr2) / 2;

        int truncatedAverage = (int)average;

        int roundedAverage = (int)Math.round(average);

        System.out.printf("%nMédia final truncada: %d", truncatedAverage);
        System.out.printf("%nMédia final arredondada: %d%n", roundedAverage);

        in.close();
    }
}
