import java.util.Scanner;
public class Aluno {
    public String nome;
    public String curso;
    public String matricula;
    public String email;
    public String senha;
    
    public Aluno(){
        notas = new Notas();
    }
    
    public void cadastrarAluno(){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite seu nome:");
    nome = sc.nextLine();
    }
}
