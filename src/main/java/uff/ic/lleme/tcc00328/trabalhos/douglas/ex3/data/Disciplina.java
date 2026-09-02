package uff.ic.lleme.tcc00328.trabalhos.douglas.ex3.data;

public class Disciplina {

    private String codigo;
    private String nome;
    private String cargaHorario;
    private String ementa;

    private Disciplina() {
    }

    public Disciplina(String codigo, String nome, String cargaHorario, String ementa) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHorario = cargaHorario;
        this.ementa = ementa;
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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cargaHorario
     */
    public String getCargaHorario() {
        return cargaHorario;
    }

    /**
     * @param cargaHorario the cargaHorario to set
     */
    public void setCargaHorario(String cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    /**
     * @return the ementa
     */
    public String getEmenta() {
        return ementa;
    }

    /**
     * @param ementa the ementa to set
     */
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

}
