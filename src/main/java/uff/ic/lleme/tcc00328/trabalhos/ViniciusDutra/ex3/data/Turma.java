package uff.ic.lleme.tcc00328.trabalhos.ViniciusDutra.ex3.data;

public class Turma {

    private String sigla;
    private Disciplina disciplina;
    private Professor professor;
    private String semestre;
    private String horario;

    public Turma(String sigla, Disciplina disciplina, Professor professor, String semestre, String horario) {
        this.sigla = sigla;
        this.disciplina = disciplina;
        this.professor = professor;
        this.semestre = semestre;
        this.horario = horario;
    }

    public String getSigla() {
        return sigla;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getSemestre() {
        return semestre;
    }

    public String getHorario() {
        return horario;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }    

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}