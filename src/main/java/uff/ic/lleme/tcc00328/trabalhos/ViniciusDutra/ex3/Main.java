package uff.ic.lleme.tcc00328.trabalhos.ViniciusDutra.ex3;

import java.util.ArrayList;
import java.util.List;
import uff.ic.lleme.tcc00328.trabalhos.ViniciusDutra.ex3.data.Aluno;
import uff.ic.lleme.tcc00328.trabalhos.ViniciusDutra.ex3.data.Disciplina;
import uff.ic.lleme.tcc00328.trabalhos.ViniciusDutra.ex3.data.Inscricao;
import uff.ic.lleme.tcc00328.trabalhos.ViniciusDutra.ex3.data.Turma;

public class Main {

    private final List<Aluno> alunos;
    private final List<Disciplina> disciplinas;
    private final List<Inscricao> matriculas;

    public Main() {
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

    public Inscricao realizarMatricula(Aluno aluno, Disciplina disciplina, String semestre) {
        Turma turma = new Turma();
        Inscricao novaMatricula = new Inscricao(aluno, turma);
        matriculas.add(novaMatricula);
        return novaMatricula;
    }

    public static void main(String[] args) {
        System.out.println("Iniciando o sistema da faculdade...");
        
        Main _ = new Main();
        
        System.out.println("Sistema executado com sucesso!");
    }
}