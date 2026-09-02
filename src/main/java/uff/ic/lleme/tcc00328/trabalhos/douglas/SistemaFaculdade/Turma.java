package uff.ic.lleme.tcc00328.trabalhos.douglas.SistemaFaculdade;

public class Turma {

    private String turmapoo;
    private Disciplina disciplina;
    private Professor professor;
    private String horario;

    public Turma(String sigla, Disciplina disciplina, Professor professor, String semestre, String horario) {
        this.turmapoo = sigla;
        this.disciplina = disciplina;
        this.professor = professor;
        this.horario = horario;
    }

    public String getSigla() {
        return turmapoo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getHorario() {
        return horario;
    }
}
