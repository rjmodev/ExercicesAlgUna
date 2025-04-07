/*
 * Entrar com nome e idade. Imprimir a seguinte saída:
 * Nome
 * Idade
 */

import java.util.Scanner;

public class Alg56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite seu nome : ");
        String name = in.nextLine();

        System.out.print("Digite sua idade: ");
        int age = in.nextInt();

        System.out.printf("%nNome: %s", name);
        System.out.printf("%nIdade: %d%n", age);

        in.close();
    }
}
