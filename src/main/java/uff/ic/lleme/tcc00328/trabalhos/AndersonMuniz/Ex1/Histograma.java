package uff.ic.lleme.tcc00328.trabalhos.AndersonMuniz.Ex1;

import java.util.Arrays;
import java.util.Random;

public class Histograma {

    public static int N = 100; // cria uma variável que recebe 100 posições?

    public static int[] vet = new int[1000];// faz um vetor preparar para criar na memória 1000 posições na memória para representar vetores?
                                            // faça o vetor vet na variável int receba 1000 posições na memória para guardar valores?
    public static int[] hist = new int[N];  //faça a função hist que seja interiro e que receba 1000 posições na memoria para que hist receba 1000 posições na memória para representar vetores?

    public static double[] freq = new double[N]; //faça a função freq na variavel double que receba que seja uma variável e que receba valores

    public static Random rnd = new Random(); //faça a função rnd que receba que seja uma variável e que receba valores para serem numeros aleatorios?

    public static void main(String[] args) {

        // Aqui preenche o vetor com números aleatórios
        for (int i = 0; i < vet.length; i++) {

            vet[i] = rnd.nextInt(0, 100);

            // Vai Contar quantas vezes o número apareceu
            hist[vet[i]]++;
        }

        // Mostra o vetor
        System.out.println("Vetor:");
        System.out.println(Arrays.toString(vet));

        // Esta parte Calcula a frequência percentual
        for (int i = 0; i < freq.length; i++) {

            freq[i] = hist[i] / (double) vet.length * 100;
        }

        // Aqui apresentará o histograma
        System.out.println("\nHistograma:");

        for (int i = 0; i < freq.length; i++) {

            System.out.println(i + " = " + freq[i] + "%");
        }
    }
}