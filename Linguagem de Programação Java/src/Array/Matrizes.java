package Array;

import javax.swing.*;

public class Matrizes {
    public static void main(String[] args) {

        String[] alunos = {"João", "Maria", "José"};

        float[][] notas = new float[3][4];

        float somaNotas, mediaAluno;
        String statusAluno;

        for (int i = 0; i < notas.length; i++){
            System.out.println("Aluno: " + alunos[i]);
            somaNotas = 0;
            mediaAluno = 0;
            for (int j = 0; j < notas[i].length; j++){
                notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota nº "
                + (j+1) + " do(a) aluno(a): "));
                somaNotas += notas[i][j];
            }
            mediaAluno = somaNotas / 4;
            if(mediaAluno < 5.5){
                statusAluno = "Reprovado(a)";
            } else if (mediaAluno >= 5.5 && mediaAluno < 7.5){
                statusAluno = "Em Recuperação";
            } else {
                statusAluno = "Aprovado(a)";
            }

            System.out.println("\n************** BOLETIM *******************");
            System.out.println("Aluno: " + alunos[i]);
            System.out.println("Notas");
            for(int j1 = 0; j1 < 4; j1++){
                System.out.println((j1+1) + " - " + notas[i][j1]);
            }
            System.out.println("Média: " + mediaAluno + " - " + statusAluno);
        }
    }
}
