//Entrar com os lados a, b, c, de um paralelepípedo. Calcular e imprimir a diagonal
import java.util.Scanner;

public class Alg53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%nCalcule a diagonal de um paralelepípedo");

        System.out.printf("%n%nDigite o valor de A: ");
        int sideA = in.nextInt();
        System.out.printf("Digite o valor de B: ");
        int sideB = in.nextInt();
        System.out.printf("Digite o valor de C: ");
        int sideC = in.nextInt();

        double sideParallel = Math.sqrt((Math.pow (sideA,2) + Math.pow(sideB,2) + Math.pow(sideC,2)));

        System.out.printf("%n%nA diagonal do paralelepípedo é: %.2fcm", sideParallel);
        in.close();
    }
}
