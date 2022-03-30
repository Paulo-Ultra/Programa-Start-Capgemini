package estruturascondicionalerepeticao;

import java.util.Scanner;

public class EstruturaEnquanto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalAlunos = 10;
        while(totalAlunos > 0) {

            String nomeAluno = sc.nextLine();
            sc.nextLine();
            int idadeAluno = sc.nextInt();

            System.out.println("O nome do aluno é: " + nomeAluno + " e sua idade é: " + idadeAluno);

            totalAlunos -= 1;

        }
        sc.close();
    }
}
