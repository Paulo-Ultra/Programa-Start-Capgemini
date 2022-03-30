package Enum;

public class Aluno {

    private Double nota1;
    private Double nota2;
    private Double nota3;
    STATUS situacaoAluno;
    MATRICULA situacaoMatricula;

    public Aluno(Double nota1, Double nota2, Double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public enum STATUS {
        APROVADO,
        REPROVADO
    }

    public enum MATRICULA {
        MATRICULADO,
        PENDENTE,
        RECUSADO
    }

    public Double calcularMediaAluno() {
        return (nota1 + nota2 + nota3) / 3;
    }
}
