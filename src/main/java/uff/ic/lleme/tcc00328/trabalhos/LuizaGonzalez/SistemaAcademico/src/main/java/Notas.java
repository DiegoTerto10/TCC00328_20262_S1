import java.util.Scanner;

public class Notas {
    public String[] tiposNotas = {"notasP1","notasP2","notasVS"};
    public double[] valoresNotas = new double[3];
    Scanner sc = new Scanner(System.in);
    
    public void cadastrarNotas(){
        System.out.println("Digite a nota da P1:");
        valoresNotas[0] = sc nextDouble();
        
        System.out.println("Digite a nota da P2:");
        valoresNotas[1] = sc nextDouble();
        
        double media = (valoresNotas[0] + valoresNotas[1]) / 2.0;
        
        if (6 > media && media > 4){
            System.out.println("Voce nao passou direto, mas esta qualificado para a VS");
            System.out.println("Digite a nota da VS");
            valoresNotas[2] = sc newDouble();
        } else {
            valoresNotas[2] = 0.0 ;
        }
        
    }
    
    public void mostrarNotas(){
        System.out.println("Aqui estão suas notas");
        
        for (int i = 0; i < tiposNotas.length; i++){
            System.out.println("Nota da " + tiposNotas[i] + ": ");   
        }
    }
}
