package uff.ic.lleme.tcc00328.trabalhos.douglas.ex3;

import uff.ic.lleme.tcc00328.trabalhos.douglas.ex3.data.Aluno;
import uff.ic.lleme.tcc00328.trabalhos.douglas.ex3.data.Disciplina;
import uff.ic.lleme.tcc00328.trabalhos.douglas.ex3.data.Inscricao;
import uff.ic.lleme.tcc00328.trabalhos.douglas.ex3.data.Professor;
import uff.ic.lleme.tcc00328.trabalhos.douglas.ex3.data.Turma;

public class Main {

    public static void main(String[] args) {

        // Oferecimento de turma
        Disciplina poo = new Disciplina("TCC00328", "POO", "60", "");
        Turma s1 = new Turma("S1", poo, "20271", "11-13");

        // Alocação de professor
        Professor la = new Professor("123", "Luiz André", "Ciencia da Computacao", "lapaesleme@id.uff.br");
        s1.setProfessor(la);

        // Pedir inscrição
        Aluno douglas = new Aluno("123456", "Douglas", "douglas@id.uff.br");
        Inscricao inscricao = new Inscricao(douglas, s1);
        System.out.println(inscricao.getDataPedido());
    }
}
