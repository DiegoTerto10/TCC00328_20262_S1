package uff.ic.lleme.tcc00328.trabalhos.AndersonMuniz.Ex2;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Histograma {

    public static void main(String[] args) {

        int tamanho = 1000;

        int[] vet = new int[tamanho];

        int[] hist = new int[100];

        double[] freq = new double[100];

        Random rnd = new Random();

        // Gera os números e conta as ocorrências
        for (int i = 0; i < tamanho; i++) {

            vet[i] = rnd.nextInt(100);

            hist[vet[i]]++;
        }

        try {

            FileWriter arquivo = new FileWriter("histograma.txt");

            PrintWriter escritor = new PrintWriter(arquivo);

            System.out.println("Histograma:");

            // Calcula e mostra a frequência de cada número
            for (int i = 0; i < 100; i++) {

                freq[i] = (hist[i] * 100.0) / tamanho;

                String linha = String.format("%d = %.2f%%", i, freq[i]);

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
