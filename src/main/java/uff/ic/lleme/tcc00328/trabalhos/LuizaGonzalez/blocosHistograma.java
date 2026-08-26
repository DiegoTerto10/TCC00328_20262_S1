package uff.ic.lleme.tcc00328.trabalhos.LuizaGonzalez;

import java.util.Random;

public class blocosHistograma {
    public static Random random = new Random();
    public static int[] valores = new int[1000];
    public static int[] frequencia = new int[10];
    
   public static void gerandoNumeros(){
       System.out.println("Gerando " + valores.length + " números aleatórios...");

        for (int i = 0; i < valores.length; i++) {
            valores[i] = random.nextInt(10);
            frequencia[valores[i]]++;
        }
        System.out.println("\nOs valores gerados são:");
   }
   
   public static void gerandoFrequencia(){
       for (int i = 0; i < frequencia.length; i++) {
            if (frequencia[i] > 0) {
                double porcentagem = (frequencia[i] * 100.0) / valores.length;
                System.out.printf("Número %d: %.2f%% (%d vezes)%n", i, porcentagem, frequencia[i]);
            }
        }
   }
   
   public static void main(String[] args) {
        gerandoNumeros();
        gerandoFrequencia();
    }
}
