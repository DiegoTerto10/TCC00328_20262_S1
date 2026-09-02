package uff.ic.lleme.tcc00328.trabalhos.douglas.SistemaFaculdade;

public class Inscricao {
    private Aluno aluno;
    private Turma turma;

    private Inscricao() {}

    public Inscricao(Aluno aluno, Turma turma){
        this.aluno = aluno;
        this.turma = turma;
    }

    public Aluno getAluno(){
        return aluno;
    }

    public Turma getTurma(){
        return turma;
    }

    public Disciplina getDisciplina(){
        return turma.getDisciplina();
    }

    public Professor getProfessor(){
        return turma.getProfessor();
    }

    public int getCargaHoraria(){
    return turma.getDisciplina().getCargaHoraria();
    }
}