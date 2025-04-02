// Ler o nome, endereço e telefone e imprimí-los.
import java.util.Scanner;

public class Alg35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, adress;
        long  phone;

        System.out.printf("%nDigite  o seu primeiro nome: ");
        name = input.nextLine();

        System.out.printf("Digite  o seu endereço: ");
        adress = input.nextLine();

        System.out.printf("Digite o seu telefone com DDD: ");
        phone = input.nextLong();

        System.out.printf("%nBem vindo %s!!!", name);
        System.out.printf("%nO seu endereço é %s", adress);
        System.out.printf("%nO seu telefone é %d", phone);
        input.close();
    }
}
