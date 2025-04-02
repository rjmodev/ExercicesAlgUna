//Criar um algoritmo que imprima a média artmética entre os números 8, 9 e 7.

public class Alg31 {
    public static void main(String[] args) {
        byte n1 = 8, n2 = 9, n3 = 7;
        float media = (n1 + n2 + n3)/3;

        System.out.printf("A media de %d, %d e %d é %.1f", n1, n2, n3, media);
    }
}
