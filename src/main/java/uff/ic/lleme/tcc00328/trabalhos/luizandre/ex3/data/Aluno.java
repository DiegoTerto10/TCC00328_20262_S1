package uff.ic.lleme.tcc00328.trabalhos.lapaesleme.ex3.data;

public class Aluno {

    private String matricula;
    private String nome;
    private String email;

    public Aluno(String matricula, String nome, String email) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
