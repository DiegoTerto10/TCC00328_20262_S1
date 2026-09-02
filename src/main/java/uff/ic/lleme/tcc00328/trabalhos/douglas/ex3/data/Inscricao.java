package uff.ic.lleme.tcc00328.trabalhos.douglas.ex3.data;

import java.util.Calendar;

public class Inscricao {

    private Aluno aluno;
    private Turma turma;
    private String dataPedido;
    private String dataAprovacao;
    private String dataCancelamento;
    private double nf;
    private double vs;

    private Inscricao() {
    }

    public Inscricao(Aluno aluno, Turma turma) {
        this.aluno = aluno;
        this.turma = turma;
        this.dataPedido = Calendar.getInstance().toString();
    }

    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    /**
     * @return the turma
     */
    public Turma getTurma() {
        return turma;
    }

    /**
     * @param turma the turma to set
     */
    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    /**
     * @return the dataPedido
     */
    public String getDataPedido() {
        return dataPedido;
    }

    /**
     * @param dataPedido the dataPedido to set
     */
    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    /**
     * @return the dataAprovacao
     */
    public String getDataAprovacao() {
        return dataAprovacao;
    }

    /**
     * @param dataAprovacao the dataAprovacao to set
     */
    public void setDataAprovacao(String dataAprovacao) {
        this.dataAprovacao = dataAprovacao;
    }

    /**
     * @return the dataCancelamento
     */
    public String getDataCancelamento() {
        return dataCancelamento;
    }

    /**
     * @param dataCancelamento the dataCancelamento to set
     */
    public void setDataCancelamento(String dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }

    /**
     * @return the nf
     */
    public double getNf() {
        return nf;
    }

    /**
     * @param nf the nf to set
     */
    public void setNf(double nf) {
        this.nf = nf;
    }

    /**
     * @return the vs
     */
    public double getVs() {
        return vs;
    }

    /**
     * @param vs the vs to set
     */
    public void setVs(double vs) {
        this.vs = vs;
    }

}
