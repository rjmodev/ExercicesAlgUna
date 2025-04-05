/*
* Fazer um algoritmo que possa entrar com o saldo de uma aplicação e imprima o
* novo saldo, considerando o reajuste de 1%.
*/
import java.util.Scanner;

public class Alg46 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.printf("%nAplicação de saldo com 1%%");
        System.out.printf("%n%nDigite o valor a ser aplicado: ");
        float balance = in.nextFloat();

        float newBalance = balance+(balance*0.01F);

        System.out.printf("%nA aplicação com 1%% renderá no total: %.2f", newBalance);
        in.close();
    }
}
