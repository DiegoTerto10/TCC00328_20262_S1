/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uff.ic.lleme.tcc00328.trabalhos.esther.ex3.data;

/**
 *
 * @author User
 */
public class Professor {

    private String nome;
    private String departamento;

    public Professor(String nome, String departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }
    
    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }
}
