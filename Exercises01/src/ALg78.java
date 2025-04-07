//Dado um polígono conexo de n lados, podemos calcular o número de diagonais diferentes
//(nd) desse polígono pela formula: nd = n * (n - 3) / 
// 2. Fazer um algoritmo que leia quantos
//lados tem o polígono, calcule e escreva o número de diagonais diferentes (nd) do mesmo.

import java.util.Scanner;

public class ALg78 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o número de lados de um polígono: ");
        int numberSides = in.nextInt();

        int diagonals = numberSides * (numberSides - 3) / 2;

        System.out.printf("%nA quantidade de diagonais diferentes são: %d%n", diagonals);

        in.close();
    }
}
