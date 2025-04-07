//Criar um algoritmo que leia um valor de hora e informe quantos minut0s se parassram desde
//o início do dia.

import java.util.Scanner;

public class Alg71 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite a hora e os minutos (HH:MM):  ");
        String timeInput = in.nextLine();

        String[] parts = timeInput.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        int totalMinutes = (hours * 60) + minutes;

        System.out.printf("%nMinutos desde o ínicio do dia: %d minutos%n", totalMinutes);

        in.close();
    }
}
