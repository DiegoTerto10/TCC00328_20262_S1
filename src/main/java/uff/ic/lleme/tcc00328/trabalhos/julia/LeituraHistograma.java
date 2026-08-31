package uff.ic.lleme.tcc00328.trabalhos.julia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeituraHistograma {

    public static final int N = 1000;
    public static final int MAX = 99;

    public static int[] numeros = new int[N];
    public static double[] freq = new double[N];

    public static void main(String[] args) {
        String filename = "src//main//java//uff//ic//lleme//tcc00328//trabalhos//julia//numeros.txt";
        try (InputStream input = new FileInputStream(filename);) {
            Scanner in = new Scanner(input);
            int i = 0;
            while (in.hasNext() && i < N) {
                numeros[i] = in.nextInt();
                i++;
            }
            input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeituraHistograma.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeituraHistograma.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(Arrays.toString(numeros));

        freq = calculaHistograma(numeros);
        System.out.println(Arrays.toString(freq));
    }

    public static double[] calculaHistograma(int[] in) {
        int[] contador = new int[MAX + 1];
        double[] freq = new double[MAX + 1];

        for (int i = 0; i < in.length; i++)
            contador[in[i]]++;
        for (int i = 0; i < freq.length; i++)
            freq[i] = contador[i] / (double) in.length * 100;
        return freq;
    }
}