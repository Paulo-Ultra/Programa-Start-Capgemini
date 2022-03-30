package estruturascondicionalerepeticao;

import java.util.Scanner;

public class ExercicioVinteQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char desejaContinuar = 'S';

        while(desejaContinuar == 'S' || desejaContinuar == 's') {
            System.out.print("Digite um número:");
            int numero = sc.nextInt();
            if(numero == 0) {
                System.out.println("O número é zero");
            } else {
                if(numero > 0) {
                    System.out.println("O número é maior que zero");
                } else {
                    System.out.println("O número é menor que zero");
                }
            }

            System.out.println("Deseja continuar? S - Sim / N - Não");
            desejaContinuar = sc.next().charAt(0);
        }

    }
}
