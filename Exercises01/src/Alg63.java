//Criar um algoritmo que efetue o cálculo do salário líquido de um professor. Os dados
//fornecidos serão: valor da hora aula, número de aulas dadas no mês e percentual de desconto do
//INSS.

import java.util.Scanner;

public class Alg63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o valor da hora aula: ");
        double valueHourClass = in.nextDouble();

        System.out.print("Digite o número de aulas dadas no mês: ");
        int numberClass = in.nextInt();

        System.out.print("Digite o percentual de desconto do INSS: ");
        double percentINSS = in.nextDouble();

        double salaryGross = valueHourClass * numberClass;
        double discountINSS = salaryGross * (percentINSS / 100);
        double salaryNet = salaryGross - discountINSS;

        System.out.printf("%nO salário líquido é: R$ %.2f%n", salaryNet);

        in.close();
    }
}
