/*
* Entrar com o lado de um quadrado e imprimir a seguinte saída:
* Perimetro
* Área
* diagonal
*/
import java.util.Scanner;

public class Alg52 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDimensões e valores de um quadrado");

        System.out.printf("%n%nDigite o valor do lado de um quadrado: ");
        double sideSquare = in.nextDouble();

        double perimeterSquare = 4 * sideSquare;
        double areaSquare = Math.pow(sideSquare, 2);
        double diagonalSquare = Math.sqrt(2 * areaSquare);

        System.out.printf("%nPerimetro: %.2f mts", perimeterSquare);
        System.out.printf("%nÁrea: %.2f m²", areaSquare);
        System.out.printf("%nDiagonal: %.2f mts%n", diagonalSquare);

        in.close();
    }
}
