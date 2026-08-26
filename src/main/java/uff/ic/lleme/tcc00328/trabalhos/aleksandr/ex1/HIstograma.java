package uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class HIstograma {
    public static void main(String[] args) {
        Random random = new Random();
        int tamanho = 1000;
        int max = 99;
        int min = 0;

        int[] frequencia = new int[max + 1];

        for (int i = 0; i < tamanho; i++){
            int numeroAleatorio = random.nextInt((max - min) + 1) + min;
            frequencia[numeroAleatorio]++;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("resultado.txt"))) {
            writer.write("Porcentagem de Aparicoes:");
            writer.newLine();
            
            for (int i = 0; i < frequencia.length; i++) {
                if (frequencia[i] > 0) {
                    double porcentagem = (frequencia[i] / (double) tamanho) * 100;
                    
                    String linha = String.format("Numero %2d: %5.1f%%\n", i, porcentagem);
                    
                    writer.write(linha);
                }
            }
            System.out.println("Resultado salvo com sucesso no arquivo 'resultado.txt'!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}
