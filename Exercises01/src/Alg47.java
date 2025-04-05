import java.util.Scanner;

/*
* Entrar com o número no formato CDU e imprimir invertido: UDC
* (Exemplo: 123, sairá 321).
* O número deverá ser armazenado em outra variável antes de ser impresso.
*/
public class Alg47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inversor de números!!");
        System.out.printf("%nDigite um numero entre 100 e 999: ");
        int cdu = in.nextInt();

        int centenaC = cdu/100;
        int aux = cdu-(centenaC*100);
        int dezenaD = aux/10;
        int unidadeU = cdu-(centenaC*100)-(dezenaD*10);

        int udc = (unidadeU*100)+(dezenaD*10)+centenaC;

        System.out.printf("%nSeu valor invertido é %d", udc);
        in.close();
    }
}
