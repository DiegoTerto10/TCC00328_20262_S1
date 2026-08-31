package uff.ic.lleme.tcc00328.trabalhos.GiovannaH.SistemaAcademico;
import java.util.ArrayList;

public class Aluno {
    String nome;
    String matricula;
    String curso;
    String email;
    ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso(){
        return curso;
    }

    public String getEmail(){
        return email;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    

}
