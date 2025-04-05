//Entrar com quatro números inteiros e imprimir a média ponderada, sabendo
// que os pesos são respectivamente 1, 2, 3, e 4.
import java.util.Scanner;

public class Alg41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Calcule a média ponderada");

        System.out.printf("%nDigite o primeiro número inteiro: ");
        int n1 = in.nextInt();
        System.out.printf("Digite o segundo número inteiro: ");
        int n2 = in.nextInt();
        System.out.printf("Digite o terceiro número inteiro: ");
        int n3 = in.nextInt();
        System.out.printf("Digite o quarto número inteiro: ");
        int n4 = in.nextInt();

        float media = (n1*1+n2*2+n3*3+n4*4)/(1+2+3+4);

        System.out.printf("%nA media poderada dos números é : %.1f",media);
        in.close();
    }
}
