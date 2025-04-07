//Criar um algoritmo que leia o valor de um depósito e o valor da taxa de juros. Calcular e
//imprimir o valor do rendimento e o valor total depois do rendimento.
import java.util.Scanner;

public class Alg72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o valor do depósito: R$");
        double deposit = in.nextDouble();

        System.out.print("Digite a taxa de juros: ");
        double interestRate = in.nextDouble();

        double interest = deposit * (interestRate / 100);
        double total = deposit + interest;

        System.out.printf("%nJuros ganhos: R$%.2f%n", interest);
        System.out.printf("Valor total ganho com juros: R$%.2f%n", total);
        in.close();
    }
}
