package uff.ic.lleme.tcc00328.trabalhos.douglas.SistemaFaculdade;

public class Main {
    public static void main(String[] args) {
        Aluno douglas = new Aluno("123456", "Douglas", "douglas@id.uff.br");
        Professor professorPoo = new Professor("P001", "Luiz André", "Ciencia da Computacao", "LuizAndré@id.uff.br");
        Disciplina poo = new Disciplina("TCC00328", "Programação Orientada a Objetos", 60);
        Turma turmaPoo = new Turma("TCC00328-A", poo, professorPoo, "2026.2", "SEG/QUA 10:00-12:00");
        
    }
}