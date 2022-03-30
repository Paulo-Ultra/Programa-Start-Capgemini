package Enum;

public class Main {
    public static void main(String[] args) {

       Aluno aluno = new Aluno(8.5, 8.3, 8.1);

        double mediaAlunoFinal = aluno.calcularMediaAluno();

        if(mediaAlunoFinal < 6) {
            aluno.situacaoAluno = Aluno.STATUS.REPROVADO;
        } else {
            aluno.situacaoAluno = Aluno.STATUS.APROVADO;
        }


        System.out.println("A média do aluno é: " + String.format("%.2f", aluno.calcularMediaAluno()) + " e o aluno está " + aluno.situacaoAluno);

        aluno.situacaoMatricula = Aluno.MATRICULA.MATRICULADO;
        System.out.println("O aluno está: " + aluno.situacaoMatricula);
    }
}
