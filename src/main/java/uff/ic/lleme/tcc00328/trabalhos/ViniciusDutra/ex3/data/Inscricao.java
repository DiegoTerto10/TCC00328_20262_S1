package uff.ic.lleme.tcc00328.trabalhos.ViniciusDutra.ex3.data;

public class Inscricao {

    private Aluno aluno;
    private Turma turma;
    private double p1 = 0;
    private double p2 = 0;
    private double vs = 0;
    private String dataPedido;
    private String dataAprovacao;
    private String dataCancelamento;

    private Inscricao() {

    }

    public Inscricao(Aluno aluno, Turma turma) {
        this.aluno = aluno;
        this.turma = turma;
    }

    public double getNf() {
        return (p1 + p2) / 2;
    }

    public Aluno getAluno() {
        return aluno;
    }

}
