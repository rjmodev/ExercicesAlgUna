/*
* Entrar com dois números inteiros e imprimir a seguinte saída:
* Dividendo
* Divisor
* Quociente
* resto
*/
import java.util.Scanner;

public class Alg40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Verifique os atributos a cada parte da divisão");
        System.out.printf("%nDigite o primeiro número inteiro: ");
        int n1 = in.nextInt();

        System.out.printf("Digite o segundo número inteiro: ");
        int n2 = in.nextInt();

        System.out.printf("Dividendo: %d%n", n1);
        System.out.printf("Divisor: %d%n", n2);
        System.out.printf("Quociente: %d%n", n1/n2);
        System.out.printf("Resto: %d%n", n1%n2);
        in.close();
    }
}
