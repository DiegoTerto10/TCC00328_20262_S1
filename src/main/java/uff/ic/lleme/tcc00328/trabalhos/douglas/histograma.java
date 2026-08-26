package uff.ic.lleme.tcc00328.trabalhos.douglas;
 
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
 
public class histograma {
  public static void main(String[] args) {
    int[] numeros = new int[500];
    Random gerador = new Random();
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = gerador.nextInt(100);
    }
 
    int[] contagem = new int[100];
    for (int i = 0; i < numeros.length; i++) {
      contagem[numeros[i]]++;
    }
 
    double[] percentual = new double[100];
    for (int i = 0; i < contagem.length; i++) {
      percentual[i] = (contagem[i] * 100.0) / numeros.length;
    }
 
    System.out.println("Histograma");
    for (int i = 0; i < contagem.length; i++) {
      if (contagem[i] > 0) {
        System.out.println("número " + i + "(" + contagem[i] + ", " + percentual[i] + "%)");
      }
    }
 
    try {
      FileWriter arquivo = new FileWriter("histograma.txt");
 
      arquivo.write("Histograma\n");
      for (int i = 0; i < contagem.length; i++) {
        if (contagem[i] > 0) {
          arquivo.write("número " + i + "(" + contagem[i] + ", " + percentual[i] + "%)\n");
        }
      }
 
      arquivo.close();
      System.out.println("Arquivo histograma.txt gravado com sucesso.");
    } catch (IOException e) {
      System.out.println("Erro ao gravar arquivo: " + e.getMessage());
    }
  }
}