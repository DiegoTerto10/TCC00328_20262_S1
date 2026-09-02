package uff.ic.lleme.tcc00328.trabalhos.douglas.SistemaFaculdade;

public class Professor {

    private String idProfessor;
    private String nome;
    private String departamento;
    private String email;

    public Professor(String idProfessor, String nome, String departamento, String email) {
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.departamento = departamento;
        this.email = email;
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
    
    public String getEmail(){
        return email;
    }
}