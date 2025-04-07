//Criar um algoritmo que calcule i e imprima a área de um triângulo

import java.util.Scanner;

public class Alg54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite a base do triângulo: ");
        double base = in.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double height = in.nextDouble();

        double area = (base * height) / 2.0;

        System.out.printf("%nA área de um triângulo é: %.2fcm²\n", area);
        in.close();
    }
}
