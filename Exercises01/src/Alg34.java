//Ler um número inteiro e imprimir seu sucessor e seu antecessor
import java.util.Scanner;

public class Alg34 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite um numero para calcular seu antecessor e sucessor = ");
    int num = input.nextInt();

    System.out.printf("%nO antecessor de %d é %d.", num, num-1);
    System.out.printf("%nO sucessor de %d é %d.%n", num, num+1);
    input.close();

    }
}
