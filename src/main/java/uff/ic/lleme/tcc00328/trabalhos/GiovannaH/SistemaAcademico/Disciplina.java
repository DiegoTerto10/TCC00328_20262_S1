package uff.ic.lleme.tcc00328.trabalhos.GiovannaH.SistemaAcademico;

public class Disciplina {

    String nome;
    String codigo;
    int cargaHoraria;
    Turma turma;
    int notas[] = new int[3];


    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Turma getTurma() {
        return turma;
    }

    public int[] getNotas() {
        return notas;
    }
    
}
