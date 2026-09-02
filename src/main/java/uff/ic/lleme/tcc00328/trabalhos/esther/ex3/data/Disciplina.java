
package uff.ic.lleme.tcc00328.trabalhos.esther.ex3.data;


public class Disciplina {
    
    private String nome;
    private String codigo;
    private int cargaHoraria;
    
    
    // Construtor
    public Disciplina (String nome, String codigo, int cargaHoraria){
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getCodigo() { // get é metodo acessor
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
}
}
