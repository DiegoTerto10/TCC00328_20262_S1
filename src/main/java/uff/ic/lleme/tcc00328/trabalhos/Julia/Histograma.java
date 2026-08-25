package uff.ic.lleme.tcc00328.trabalhos.julia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Histograma {

    public static final int N = 1000;
    public static final int MAX = 99;
    public static Random rnd = new Random();
    public static int[] numeros = new int[N];
    public static double[] freq = new double[N];

    public static void main(String[] args) {
        String filename = "src//main//java//uff//ic//lleme//tcc00328//trabalhos//julia//numeros.txt";

        numeros = leNumeros(filename);
        System.out.println(Arrays.toString(numeros));

        freq = calculaHistograma(numeros);
        System.out.println(Arrays.toString(freq));
    }

    public static int[] leNumeros(String filename) {
        int[] lista = new int[N];
        int count = 0;
        try (InputStream input = new FileInputStream(filename)) {
            Scanner in = new Scanner(input);
            while (in.hasNextInt() && count < N) {
                lista[count] = in.nextInt();
                count++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Histograma.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Histograma.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Arrays.copyOf(lista, count);
    }

    public static int[] geraNumeros(int N, int max) {
        int[] numeros = new int[N];
        for (int i = 0; i < numeros.length; i++)
            numeros[i] = rnd.nextInt(0, max + 1);
        return numeros;
    }

    public static double[] calculaHistograma(int[] in) {
        int[] contador = new int[MAX + 1];
        double[] freq = new double[MAX + 1];
        for (int i = 0; i < in.length; i++)
            contador[in[i]]++;
        for (int i = 0; i < contador.length; i++)
            freq[i] = contador[i] / (double) in.length * 100;
        return freq;
    }
}