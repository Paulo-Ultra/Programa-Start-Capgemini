package estruturascondicionalerepeticao;

import java.util.Scanner;

public class ExercicioQuinze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Digite um valor: ");
        numero = sc.nextInt();

        if(numero >= 100 && numero <= 2000){
            System.out.println("O número " + numero + " está no intervalo");
        } else {
            System.out.println("O número " + numero + " não está no intervalo");
        }

    }
}
