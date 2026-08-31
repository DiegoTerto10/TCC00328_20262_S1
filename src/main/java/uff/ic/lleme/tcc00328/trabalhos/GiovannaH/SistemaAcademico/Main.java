package uff.ic.lleme.tcc00328.trabalhos.GiovannaH.SistemaAcademico;

public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "Giovanna";
        aluno.matricula = "221041061";
        aluno.curso = "Telecom";
        aluno.email = "giovannahelena@id.uff.br";

        Disciplina poo = new Disciplina();
        poo.nome = "Programação Orientada a Objetos";
        poo.codigo = "TCC00328";
        poo.cargaHoraria = 60;
        poo.notas[0] = 7;
        poo.notas[1] = 9;   
        poo.notas[2] = 8;
        poo.turma = new Turma();

        poo.turma.classe = "S1";
        poo.turma.professor = "Prof. Luiz André";

        aluno.disciplinas.add(poo);

    }

    
}
