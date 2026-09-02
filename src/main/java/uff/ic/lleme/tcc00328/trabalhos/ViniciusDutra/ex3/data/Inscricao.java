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

    
    public Inscricao(Aluno aluno, Turma turma) {
        this.aluno = aluno;
        this.turma = turma;
    }

    public double getNf() {
        return (p1 + p2) / 2;
    }
    
    public double getVs() {
        return vs;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public Disciplina getDisciplina() {
        return turma.getDisciplina();
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public void setVs(double vs) {
        this.vs = vs;
    }
}