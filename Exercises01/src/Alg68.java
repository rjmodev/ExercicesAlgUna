//Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma que a variável
//A passe a ter o valor da variável B e que a variável B passe a ter o valor da variável A. Apresentar
//os valores trocados.

import java.util.Scanner;

public class Alg68 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o valor de A: ");
        int a = in.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = in.nextInt();

        int swap = a;
        a = b;
        b = swap;

        System.out.printf("%nO valor invertido é%n A: %d%n B: %d%n", a, b);
        in.close();
    }
}
