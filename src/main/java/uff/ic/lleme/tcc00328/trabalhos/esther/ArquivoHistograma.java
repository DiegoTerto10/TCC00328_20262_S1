package uff.ic.lleme.tcc00328.trabalhos.esther;

/**
EXERCICIO 1
Faça um programa Java para criar um vetores de números inteiros entre 0 e 99 e,
depois calcular, imprimir e gravar em um arquivo um histograma com a frequência 
percentual de cada um desses números.
**/

//importando biblioteca que gera numeros aleatorios
import java.util.Random; 
import java.util.Arrays;

//importando bibliotecas para trabalhar com arquivos
/*import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;*/
        
public class ArquivoHistograma {    
    
    public static int N = 100;
    public static int[] vetor = new int[1000];
    public static int[] contador = new int[N];  
    public static double[] freqRelativa = new double[N];
    
   
    public static void main(String args[]){
        Random random = new Random();
       
        for (int i=0; i<vetor.length; i++){
            vetor[i]= random.nextInt(100);
            contador[vetor[i]]++; 
        }
        System.out.println(Arrays.toString(vetor)); 
        
       for (int i = 0; i < contador.length; i++) {
            freqRelativa[i] = ((double) contador[i] / vetor.length) * 100.0;
        }    
        System.out.println(Arrays.toString(freqRelativa));
    
            
    }
    }
    
 
