//Ler um número real e imprimir a terça parte deste número.
import java.sql.SQLOutput;
import java.util.Scanner;

public class Alg38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num;

        System.out.printf("%nDigite um numero com ponto flutuante: ");
        num = input.nextFloat();

        System.out.printf("A terça parte desse numero é: %.2f%n", num*1/3);
    }
}
