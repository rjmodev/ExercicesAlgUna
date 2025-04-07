//Em épocas de pouco dinheiro, os comerciantes estão procurando aumentar suas vendas
//oferecendo desconto. Faça um algoritmo que possa entrar com o valor de um produto e imprima o
//novo valor tendo em vista que o desconto foi de 9%.
import java.util.Scanner;

public class Alg62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o valor do produto: R$ ");
        double valueProduct = in.nextDouble();

        double newValueDiscount = valueProduct * 0.9;

        System.out.printf("%nO novo valor com 9%% de desconto é: R$ %.2f%n", newValueDiscount);

        in.close();
    }
}
