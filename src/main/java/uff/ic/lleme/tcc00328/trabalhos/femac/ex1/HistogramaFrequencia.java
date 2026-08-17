package uff.ic.lleme.tcc00328.trabalhos.femac.ex1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class HistogramaFrequencia {

    public static void main(String[] args) {
        int tamanhoVetor = 1000;
        int[] vetor = new int[tamanhoVetor];
        int[] contagem = new int[100]; 
        Random random = new Random();

        
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = random.nextInt(100); 
            contagem[vetor[i]]++;
        }

        
        StringBuilder histograma = new StringBuilder();
        histograma.append("=== HISTOGRAMA DE FREQUÊNCIA PERCENTUAL ===\n\n");
        histograma.append(String.format("%-10s | %-12s | %s\n", "Número", "Frequência (%)", "Gráfico"));
        histograma.append("--------------------------------------------------\n");

        for (int i = 0; i < contagem.length; i++) {
            double percentual = ((double) contagem[i] / tamanhoVetor) * 100;
            
            
            int numAsteriscos = (int) Math.round(percentual * 2);
            String barra = "*".repeat(numAsteriscos);

            histograma.append(String.format("%-10d | %-12.2f | %s\n", i, percentual, barra));
        }

       
        System.out.println(histograma.toString());

      
        String nomeArquivo = "histograma.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            writer.write(histograma.toString());
            System.out.println("Histograma salvo com sucesso no arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao gravar o arquivo: " + e.getMessage());
        }
    }
}
