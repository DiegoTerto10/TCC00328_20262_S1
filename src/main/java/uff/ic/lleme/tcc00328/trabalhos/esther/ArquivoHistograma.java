package uff.ic.lleme.tcc00328.trabalhos.esther;

/**
EXERCICIO 1
Faça um programa Java para criar um vetores de números inteiros entre 0 e 99 e,
depois calcular, imprimir e gravar em um arquivo um histograma com a frequência 
percentual de cada um desses números.
**/

//importando biblioteca que gera numeros aleatorios
import java.util.Random; 
import java.util.Arrays;

//importando bibliotecas para trabalhar com arquivos
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoHistograma {    
    
    public static void main(String args[]) {
        // variáveis para dentro do main 
        int N = 100;
        int[] vetor = new int[1000];
        int[] contador = new int[N];  
        double[] freqRelativa = new double[N];
        
        Random random = new Random();

        // 1. Gera os números e conta as frequências
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
            contador[vetor[i]]++; 
        }
        
        System.out.println("Vetor gerado: " + Arrays.toString(vetor)); 
        
        // 2. Calcula a frequência relativa
        for (int i = 0; i < contador.length; i++) {
            freqRelativa[i] = ((double) contador[i] / vetor.length) * 100.0;
        }    
        
        // 3. Gravação do arquivo usando Try-with-resources (fecha automático)
        String caminhoArquivo = "arquivoHistograma.txt";
        
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            
            escritor.write("=== HISTOGRAMA DE FREQUÊNCIAS ===\n\n");
            
            // Laço para escrever cada número e sua respectiva porcentagem no TXT
            for (int i = 0; i < freqRelativa.length; i++) {
                // Formata para mostrar o texto bonitinho (ex: "Número 15: 1.20%")
                String linha = String.format("Número %02d: %.2f%%\n", i, freqRelativa[i]);
                escritor.write(linha);
            }

            System.out.println("\nArquivo TXT gerado com sucesso!");

        } catch (Exception erro) {
            System.out.println("Houve um problema para gravar o arquivo.");
            erro.printStackTrace();
        }
            
    }
}
 
