package uff.ic.lleme.tcc00328.trabalhos.luizandre.ex1;

import java.util.Arrays;
import java.util.Random;

public class Histograma {

    public static int N = 100;
    public static int[] vet = new int[1000];
    double[] freq = new double[N];
    public static Random rnd = new Random();

    public static void main(String[] args) {

        vet = geraNumeros(N);

        System.out.println(Arrays.toString(vet));

        freq = histograma(vet);

        System.out.println(Arrays.toString(freq));
    }

    public static int[] geraNumeros(int N) {
        int[] out = new int[N];
        for (int i = 0; i < vet.length; i++)
            vet[i] = rnd.nextInt(0, 100);
        return out;
    }

    public static double[] histograma(int[] in) {
        int[] contador = new int[N];
        double[] out = new double[N];

        for (int i = 0; i < vet.length; i++)
            contador[in[i]]++;
        for (int i = 0; i < vet.length; i++)
            out[i] = contador[i] / (double) in.length * 100;
        return out;
    }

}
