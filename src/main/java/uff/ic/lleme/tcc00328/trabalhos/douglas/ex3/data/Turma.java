package uff.ic.lleme.tcc00328.trabalhos.douglas.ex3.data;

public class Turma {

    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private String horario;
    private String semestre;

    private Turma() {

    }

    public Turma(String codigo, Disciplina disciplina,
            String semestre, String horario) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.horario = horario;
        this.semestre = semestre;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the semestre
     */
    public String getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(String semestre) {
        this.semestre = semestre;
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
