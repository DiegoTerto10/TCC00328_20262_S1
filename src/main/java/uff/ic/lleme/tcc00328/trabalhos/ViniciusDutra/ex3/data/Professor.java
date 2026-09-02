package uff.ic.lleme.tcc00328.trabalhos.ViniciusDutra.ex3.data;

public class Professor {

    private String idProfessor;
    private String nome;
    private String departamento;

    public Professor(String idProfessor, String nome, String departamento) {
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getIdProfessor() {
        return idProfessor;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }
}