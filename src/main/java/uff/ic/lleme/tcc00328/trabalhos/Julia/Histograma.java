package uff.ic.lleme.tcc00328.trabalhos.julia;

import java.util.Arrays;
import java.util.Random;

public class Histograma {

    public static final int N = 1000;
    public static final int MAX = 99;
    public static Random rnd = new Random();

    public static int[] numeros = new int[N];
    public static double[] freq = new double[N];

    public static void main(String[] args) {

        numeros = geraNumeros(N, MAX);
        System.out.println(Arrays.toString(numeros));

        freq = calculaHistograma(numeros);
        System.out.println(Arrays.toString(freq));
    }

    public static int[] geraNumeros(int N, int max) {
        int[] numeros = new int[N];
        for (int i = 0; i < numeros.length; i++)
            numeros[i] = rnd.nextInt(0, max + 1);
        return numeros;
    }

    public static double[] calculaHistograma(int[] in) {
        int[] contador = new int[in.length];
        double[] freq = new double[in.length];

        for (int i = 0; i < numeros.length; i++)
            contador[in[i]]++;
        for (int i = 0; i < numeros.length; i++)
            freq[i] = contador[i] / (double) in.length * 100;
        return freq;
    }

}
