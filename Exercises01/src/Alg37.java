import java.util.Scanner;

public class Alg37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.printf("%nDigite o primeiro numero: ");
        num1 = input.nextInt();

        System.out.printf("%nDigite o segundo numero; ");
        num2 = input.nextInt();

        System.out.printf("%nO produto dos números é = %d", num1*num2);
        input.close();
    }
}
