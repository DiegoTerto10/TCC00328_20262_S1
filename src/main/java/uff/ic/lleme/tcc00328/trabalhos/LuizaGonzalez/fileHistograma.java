package uff.ic.lleme.tcc00328.trabalhos.LuizaGonzalez;

import java.util.Random;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class fileHistograma {
    public static Random random = new Random();
    public static int[] valores = new int[1000];
    public static int[] frequencia = new int[10];
    public static PrintWriter arquivo;
    public static String local = "/home/aluno/Documentos/ArquivosCriadosPOO/histograma.txt";
    
   public static void gerandoNumeros(){
       System.out.println("Gerando " + valores.length + " números aleatórios...");

        for (int i = 0; i < valores.length; i++) {
            valores[i] = random.nextInt(10);
            frequencia[valores[i]]++;
        }
   }
   
   public static void gerandoFrequencia(){
       for (int i = 0; i < frequencia.length; i++) {
            if (frequencia[i] > 0) {
                double porcentagem = (frequencia[i] * 100.0) / valores.length;
                arquivo.printf("Número %d: %.2f%% (%d vezes)%n", i, porcentagem, frequencia[i]);
            }
        }
   }
   
   public static void gerandoArquivo(){

        try { 
            arquivo = new PrintWriter(local);
            arquivo.println("HISTOGRAMA");
            arquivo.println();
            arquivo.println("Valor das frequencias:");

            gerandoFrequencia();
            arquivo.close();
            System.out.println("Arquivo histograma.txt foi criado!");
        
       } catch (FileNotFoundException e){
           System.out.println("Erro ao criar arquivo!");
       }
   }
   
   public static void main(String[] args) {
        gerandoNumeros();
        gerandoArquivo();
    }
}