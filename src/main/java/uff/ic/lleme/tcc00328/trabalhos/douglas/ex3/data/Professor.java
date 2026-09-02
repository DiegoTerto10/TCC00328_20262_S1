package uff.ic.lleme.tcc00328.trabalhos.douglas.ex3.data;

public class Professor {

    private String matricula;
    private String nome;
    private String departamento;
    private String email;

    private Professor() {

    }

    public Professor(String idProfessor, String nome, String departamento, String email) {
        this.matricula = idProfessor;
        this.nome = nome;
        this.departamento = departamento;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getEmail() {
        return email;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
