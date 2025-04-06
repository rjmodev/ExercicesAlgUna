/*
* Entrar com a base e a altura de um retângulo e imprimir a seguinte saída:
* Perimetro
* Área
* Diagonal
*/
import java.util.Scanner;
import java.lang.Math;

public class Alg50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nValores de um retângulo");

        System.out.printf("%n%nDigite o valor da base de um retângulo: ");
        double baseRectangle = in.nextDouble();

        System.out.printf("Digite o valor da altura de um retângulo: ");
        double heightRectangle = in.nextDouble();

        double perimeterRectangle = 2 * (baseRectangle+heightRectangle);
        double areaRectangle = baseRectangle * heightRectangle;
        double diagonalRectangle = Math.sqrt(Math.pow(baseRectangle,2)+Math.pow(heightRectangle,2));

        System.out.printf("%nPerimetro: %.2f", perimeterRectangle);
        System.out.printf("%nÁrea: %.2f", areaRectangle);
        System.out.printf("%nDiagonal: %.2f%n", diagonalRectangle);

        in.close();
    }
}
