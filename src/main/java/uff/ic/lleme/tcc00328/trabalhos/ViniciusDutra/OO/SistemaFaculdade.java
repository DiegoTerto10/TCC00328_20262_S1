package uff.ic.lleme.tcc00328.trabalhos.ViniciusDutra.OO;


import java.util.ArrayList;
import java.util.List;

public class SistemaFaculdade {
    private final List<Aluno> alunos;
    private final List<Disciplina> disciplinas;
    private final List<Matricula> matriculas;

    public SistemaFaculdade() {
        this.alunos = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
        this.matriculas = new ArrayList<>();
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void cadastrarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public Matricula realizarMatricula(Aluno aluno, Disciplina disciplina, String semestre) {
        Matricula novaMatricula = new Matricula(aluno, disciplina, semestre);
        matriculas.add(novaMatricula);
        return novaMatricula;
    }
}