/*
* Antes do racionamento de energia ser decretado, quase ninguém falava em
* quilowatts, mas, agora, todos imcorporaram essa palavra em seu vocabulário.
* Sabendo-se que 100 quilowatts de energia custa um sétimo do salário mínimo,
* fazer um algoritmo que receba o valor do salário mínimo
* e a quantidade de quilowatts gasta por uma residência e calcule. Imprima:
* O valor em reais de cada quilowatt
* O valor em reais a ser pago
* O novo valor a ser pago por essa residência com um desconto de 10%
*/
import java.util.Scanner;

public class Alg48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salarioMinimo, wattsGastos;

        System.out.printf("%nDigite o salário mínimo: R$");
        salarioMinimo = in.nextDouble();

        System.out.printf("Digite os quilowatts gastos: ");
        wattsGastos = in.nextDouble();

        double valorPorQuilowat = (salarioMinimo/7)/100;
        double valorTotal = valorPorQuilowat*wattsGastos;
        double valorTotalDesconto10 = (valorPorQuilowat*wattsGastos)*0.9;

        System.out.printf("%nO valor em reais de cada quilowatt é R$%.2f", valorPorQuilowat);
        System.out.printf("%nO valor em reais a ser pago é R$%.2f", valorTotal);
        System.out.printf("%nO valor a ser pago nessa residência com um desconto de 10%% é R$%.2f", valorTotalDesconto10);
        in.close();
    }
}
