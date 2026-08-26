package uff.ic.lleme.tcc00328.trabalhos.lauraamaral;

import java.util.Random;

public class Histograma {
    public static int N = 100;
    public static double[] vet = new double[1000];
    public static int[] count = new int[N];
    public static double[] percent = new double[count.length];

    public static void main(String[] args) {

        Random gerador = new Random();
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = gerador.nextInt(95) + 5;
        }

        contar();
        frequencia_percentual();
    }

    public static void contar() {
        for (int i = 0; i < vet.length; i++) {
            int valorGerado = (int) vet[i];
            count[valorGerado]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println("O número " + i + " aparece " + count[i] + " vezes.");
            }
        }
    }

    public static void frequencia_percentual() {
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                percent[i] = (count[i] / 1000.0) * 100; 
                System.out.println("Número " + i + ": " + percent[i] + "%");
            }
        }
    }

    public static void gerarhistograma() {
        System.out.println("_____________________ Histograma _____________________");
        int intervalo = 10;

   

}