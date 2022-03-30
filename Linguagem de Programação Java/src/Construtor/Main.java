package Construtor;

public class Main{
    public static void main(String[] args) {

        Aluno aluno = new Aluno(8.0, 8.3, 8.8);

        double mediaAlunoFinal = aluno.calcularMediaAluno();

        if(mediaAlunoFinal < 6) {
            aluno.situacaoAluno = Aluno.STATUS.REPROVADO;
        } else {
            aluno.situacaoAluno = Aluno.STATUS.APROVADO;
        }


        System.out.println("A média do aluno é: " + String.format("%.2f", aluno.calcularMediaAluno()) + " e o aluno está " + aluno.situacaoAluno);
    }
}
