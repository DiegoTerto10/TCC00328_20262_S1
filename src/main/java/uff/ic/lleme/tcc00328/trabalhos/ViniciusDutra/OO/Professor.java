package uff.ic.lleme.tcc00328.trabalhos.ViniciusDutra.OO;


public class Professor {
    private final String idProfessor;
    private final String nome;
    private final String departamento;

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