/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package histograma;

/**
 *
 * @author Mirtilo o brabo
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
public class Histograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tamanho = 1000;

        int[] vetor = new int[tamanho];

        int[] frequencia = new int[100];

        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100);
            frequencia[vetor[i]]++;    
    }
        
        try {
            FileWriter arquivo = new FileWriter("histograma.txt");
            PrintWriter escritor = new PrintWriter(arquivo);

            System.out.println("Histograma:");

            for (int i = 0; i < 100; i++) {

                double percentual = (frequencia[i] * 100.0) / tamanho;

                String linha = String.format(
                    "%2d: %6.2f%%",
                    i,
                    percentual
                );

                System.out.println(linha);
                escritor.println(linha);
            }

            escritor.close();

            System.out.println("\nHistograma gravado no arquivo histograma.txt");

        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo.");
        }
    }
}
