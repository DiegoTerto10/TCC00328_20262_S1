package uff.ic.lleme.tcc00328.trabalhos.ViniciusDutra.OO;

public class Matricula {
    private final Aluno aluno;  
    private final Disciplina disciplina;
    private final String semestre;
    private double nota;

    public Matricula(Aluno aluno, Disciplina disciplina, String semestre) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.semestre = semestre;
        this.nota = 0.0; 
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public String getSemestre() {
        return semestre;
    }

    public double getNota() {
        return nota;
    }

    public void lancarNota(double nota) {
        this.nota = nota;
    }
}