/*
* Criar um algoritmo que dado um número de uma conta corrente com três dígitos, retorne o
* seu dígito verificador, o qual é calculado da seguinte maneira.
* Exemplo: número da conta: 235
* Somar o número da conta com o seu inverso: 235 + 532 = 767
* Multiplicar cada dígito pela sua ordem posicional e somar estes
* resultados: 767
* 7 6 7
* x1 x2 x3
* 7 + 12 + 21 = 40
*/

import java.util.Scanner;

public class Alg80 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite um número da conta com 3 dígitos: ");
        int account = in.nextInt();

        if (account < 100 || account > 999) {
            System.out.println("Digito inválido. Deve ser um número de 3 dígitos.");
            return;
        }

        int d1Account = account / 100 % 10;
        int d2Account = account / 10 % 10;
        int d3Account = account % 10;
        int reverseThreeDigits = (d1Account*100)+(d2Account*10)+d3Account;

        int sum = account + reverseThreeDigits;

        int d1Sum = sum / 100 % 10;
        int d2Sum = sum / 10 % 10;
        int d3Sum = sum % 10;


        int checkDigit =  d1Sum + d2Sum * 2 + d3Sum * 3;

        System.out.printf("%nDigito Verificado: %d", checkDigit);

        in.close();
    }
}
