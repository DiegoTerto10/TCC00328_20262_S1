package uff.ic.lleme.tcc00328.trabalhos.julia;

public class Histograma {

    public static void main(String[] args) {
        
        int[] vet = new int[200];
        int[] histograma = new int[100];

        // 1. Preenche o vetor com numeros de 0 a 99
        for (int i = 0; i < 200; i++) {
            vet[i] = (int) (Math.random() * 100);
        }

        // 2. Conta quantas vezes cada numero apareceu
        for (int i = 0; i < 200; i++) {
            int pos = vet[i];
            histograma[pos] = histograma[pos] + 1;
        }

        // 3. Imprime a quantidade e o percentual na tela
        for (int i = 0; i < 100; i++) {
            double percentual = (histograma[i] / 200.0) * 100;
            System.out.println("Numero " + i + ": " + histograma[i] + " vezes (" + percentual + "%)");
        }
    }
}
