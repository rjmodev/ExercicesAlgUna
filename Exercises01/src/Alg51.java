/*
* Entrar com o raio de um circulo e imprimir a seguinte saída:
* Perimetro
* Área
* */
import  java.util.Scanner;

public class Alg51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nPerimetro e area do cículo a partir do seu raio");

        System.out.printf("%n%nDigite o raio do círculo: ");
        double radiusCircle = in.nextDouble();

        double perimeterCircle = 2 * Math.PI * radiusCircle;
        double areaCircle = Math.PI * Math.pow(radiusCircle, 2);

        System.out.printf("%nPerimetro: %.2f mts", perimeterCircle);
        System.out.printf("%nArea: %.2f m²%n", areaCircle);

        in.close();
    }
}
