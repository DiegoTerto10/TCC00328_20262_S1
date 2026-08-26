package uff.ic.lleme.tcc00328.trabalhos.julia;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GeraArquivoNumeros {

    public static final int N = 1000;
    public static final int MAX = 99;
    public static Random rnd = new Random();

    public static void main(String[] args) {
        String filename = "src//main//java//uff//ic//lleme//tcc00328//trabalhos//julia//numeros.txt";

        int[] numeros = geraNumeros(N, MAX);
        escreveNumeros(numeros, filename);

        System.out.println("Arquivo gerado com sucesso!");
    }

    public static int[] geraNumeros(int N, int max) {
        int[] numeros = new int[N];
        for (int i = 0; i < numeros.length; i++)
            numeros[i] = rnd.nextInt(0, max + 1);
        return numeros;
    }

    public static void escreveNumeros(int[] numeros, String filename) {
        try (PrintWriter out = new PrintWriter(filename)) {
            for (int n : numeros) {
                out.println(n);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GeraArquivoNumeros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
